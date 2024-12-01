package altn72.tpfilrouge.controleur;

import altn72.tpfilrouge.exceptions.PassagerNonTrouveException;
import altn72.tpfilrouge.modele.Passager;
import altn72.tpfilrouge.modele.PassagerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * Rôles principaux de cette classe :
 * a) courroie de transmission entre la couche "V" de la couche "M"
 * b) contiendra le code métier
 *
 * @author Jacques Augustin
 */
@Service
public class PassagerService {

    /**
     * Injection de dépendance
     * Bonne pratique : utiliser un constructeur
     */
    private final PassagerRepository passagerRepository;

    @Autowired
    public PassagerService(PassagerRepository passagerRepository){
        this.passagerRepository = passagerRepository;
    }

    public List<Passager> getTousLesPassagers(){
        return passagerRepository.findAll();
    }


    // Question 6.2
    public Optional<Passager> recupererUnPassager(Integer idPassager) {
        Optional<Passager> passager = passagerRepository.findById(idPassager);
        if (passager.isPresent()){
            return passager;
        }else {
            throw new PassagerNonTrouveException("######### Ce passager n'existe pas dans la base de données ! #########");
        }
    }

    // Question 6.3
    public void supprimerUnPassager(Integer idPassager)  {
        Optional<Passager> passager = passagerRepository.findById(idPassager);
        if (passager.isPresent()){
            passagerRepository.deleteById(idPassager);
        }else {  
            throw new PassagerNonTrouveException("######### Impossible de supprimer ce passager car il n'existe pas dans la base de données! ######### ");
        }
    }

    // Question 6.4
    public void modifierPassager(int idPassager, Passager passager){
        Optional<Passager> passagerAModifierOptional = passagerRepository.findById(idPassager);

        if (passagerAModifierOptional.isPresent()){
            Passager passagerAModifier = passagerAModifierOptional.get();
            BeanUtils.copyProperties(passager, passagerAModifier, "id"); // Ignore l'ID pour éviter sa modification
            passagerRepository.save(passagerAModifier); // Sauvegarde l'objet mis à jour
        }
    }

    // Question 6.5
    public void ajouterPassager(Passager passager){
        passagerRepository.save(passager);
    }

}
