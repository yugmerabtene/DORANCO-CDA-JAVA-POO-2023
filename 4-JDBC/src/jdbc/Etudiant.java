package jdbc;

import java.util.Date;

public class Etudiant {
    private int id;                 // Identifiant unique de l'étudiant
    private String nom;             // Nom de l'étudiant
    private String prenom;          // Prénom de l'étudiant
    private Date dateNaissance;    // Date de naissance de l'étudiant
    private String email;           // Adresse e-mail de l'étudiant
    private String matricule;       // Matricule de l'étudiant

    // Constructeur par défaut
    public Etudiant() {}

    // Constructeur avec tous les champs
    public Etudiant(int id, String nom, String prenom, Date dateNaissance, String email, String matricule) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.matricule = matricule;
    }

    // Getters et setters pour tous les champs
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", email='" + email + '\'' +
                ", matricule='" + matricule + '\'' +
                '}';
    }
}
