package altn72.tpfilrouge.modele;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Via cette interface nous pouvons requêter la BDD
 * en profitant des requêtes prédéfinies utilisables directement
 *
 * @author Jacques Augustin
 *
  */
public interface PassagerRepository extends JpaRepository<Passager,Integer> {
}
