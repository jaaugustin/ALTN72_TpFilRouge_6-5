package altn72.tpfilrouge.modele;

/**
 * Cette classe respecte la convention Java Bean
 *
 * @author Jacques Augustin
 */
public class Passager_V0 {

    private int id;
    private String nom;
    private String prenom;
    private String IdDocumentIdentite ;

    public Passager_V0() {
    }

    public Passager_V0(
            int id,
            String nom,
            String prenom,
            String idDocumentIdentite) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        IdDocumentIdentite = idDocumentIdentite;
    }

    public Passager_V0(
            String nom,
            String prenom,
            String idDocumentIdentite) {
        this.nom = nom;
        this.prenom = prenom;
        IdDocumentIdentite = idDocumentIdentite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getIdDocumentIdentite() {
        return IdDocumentIdentite;
    }

    public void setIdDocumentIdentite(String idDocumentIdentite) {
        IdDocumentIdentite = idDocumentIdentite;
    }


    @Override
    public String toString() {
        return "Passager_V0{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", IdDocumentIdentite='" + IdDocumentIdentite + '\'' +
                '}';
    }
}
