package altn72.tpfilrouge.modele;

import jakarta.persistence.*;

/**
 * Classe Entity qui est "bindée" avec la table "Passager"
 * chaque ligne de la tabale Passager correspond à une instance de cette classe Entity
 *
 * @author Jacques Augustin
 */

@Entity
@Table(name = "passager")
public class Passager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;

    @Column(name = "PRENOM", nullable = false, length = 50)
    private String prenom;

    @Column(name = "PIECE_IDENTITE", nullable = false, length = 150)
    private String pieceIdentite;

    @Column(name = "NUMERO_IDENTITE", nullable = false, length = 10)
    private String numeroIdentite;

    @Column(name = "NUMERO_RESERVATION", nullable = false, length = 7)
    private String numeroReservation;

    @Column(name = "COMMENTAIRES", nullable = false, length = 250)
    private String commentaires;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getPieceIdentite() {
        return pieceIdentite;
    }

    public void setPieceIdentite(String pieceIdentite) {
        this.pieceIdentite = pieceIdentite;
    }

    public String getNumeroIdentite() {
        return numeroIdentite;
    }

    public void setNumeroIdentite(String numeroIdentite) {
        this.numeroIdentite = numeroIdentite;
    }

    public String getNumeroReservation() {
        return numeroReservation;
    }

    public void setNumeroReservation(String numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

}