package altn72.tpfilrouge.controleur;

import altn72.tpfilrouge.modele.Passager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Classe responsable de l'aiguillage
 * C'est notre tour de contrôle
 *
 * @author Jacques Augustin
 */
@RestController
@RequestMapping("/tpfilrouge") //cette annotation permet de spécifier une url "racine" qui s'applique à tous les endpoints définis dans la classe
public class PassagerControleur {

    private final PassagerService passagerService;  // "final" => la valeur de la variable de pourra plus être modifiée APRES l'initialisation

    @Autowired   // Injection de dépendance via le constructeur (pratique recommandée)
    public PassagerControleur(PassagerService passagerService) {
        this.passagerService = passagerService;
    }

    // Question 6.1
    @GetMapping("/passagers")
    // La méthode ci-dessous est ce que l'on appelle un endpoint car elle peut être appelée
    // en ajoutant /passagers à l'url de base de l'application + le path défini via @RequestMapping
    public List<Passager> afficherInfosPassagers(){

//        return List.of(
//                new Passager_V0(1,"ACHVAR", "Didier","RF101010"),
//                new Passager_V0(2,"AUGUSTIN","Jacques","RF123456"));

        return passagerService.getTousLesPassagers();
    }

    // Question 6.2
    @GetMapping("/{idPassager}") // cet endpoint sera appelé via l'url localhost:8080/tpfilrouge/2 (par exemple)
    public Optional<Passager> afficherPassager(@PathVariable Integer idPassager) {
        return passagerService.recupererUnPassager(idPassager);
    }

    // Question 6.3
    @DeleteMapping("/supprimerPassager/{idPassager}")
    public void supprimerPassager(@PathVariable Integer idPassager) {
        passagerService.supprimerUnPassager(idPassager);
    }

    // Question 6.4
    @PutMapping("modifierPassager/{idPassager}")
    public void modifierPassager(@PathVariable int idPassager, @RequestBody Passager passager) {
        passagerService.modifierPassager(idPassager, passager);
    }

    // Question 6.5
    @PostMapping("/ajouter")
    public void ajouterPassager(@RequestBody Passager passager) {
        passagerService.ajouterPassager(passager);
    }

}
