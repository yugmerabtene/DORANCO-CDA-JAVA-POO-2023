package jdbc;

import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Cr�ez une instance de la classe de repository
        EtudiantRepository etudiantRepository = new EtudiantRepositoryImpl();

        // Test de la m�thode getAllEtudiants()
        List<Etudiant> etudiants = etudiantRepository.getAllEtudiants();
        System.out.println("Liste de tous les �tudiants :");
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }

        // Test de la m�thode addEtudiant()
        Etudiant nouvelEtudiant = new Etudiant(0, "John", "Doe", new Date(), "john.doe@example.com", "12345");
        etudiantRepository.addEtudiant(nouvelEtudiant);
        System.out.println("\nNouvel �tudiant ajout� : " + nouvelEtudiant);

        // Test de la m�thode updateEtudiant()
        int idAUpdater = 1; // Remplacez 1 par l'ID de l'�tudiant � mettre � jour
        Etudiant etudiantAModifier = etudiantRepository.getEtudiantById(idAUpdater);
        if (etudiantAModifier != null) {
            etudiantAModifier.setNom("NouveauNom");
            etudiantRepository.updateEtudiant(etudiantAModifier);
            System.out.println("\n�tudiant mis � jour : " + etudiantAModifier);
        } else {
            System.out.println("\n�tudiant non trouv� pour la mise � jour.");
        }

        // Test de la m�thode deleteEtudiant()
        int idASupprimer = 2; // Remplacez 2 par l'ID de l'�tudiant � supprimer
        etudiantRepository.deleteEtudiant(idASupprimer);
        System.out.println("\n�tudiant avec ID " + idASupprimer + " supprim�.");

        // Test de la m�thode getEtudiantById()
        int idAChercher = 3; // Remplacez 3 par l'ID de l'�tudiant � chercher
        Etudiant etudiantCherche = etudiantRepository.getEtudiantById(idAChercher);
        if (etudiantCherche != null) {
            System.out.println("\n�tudiant trouv� : " + etudiantCherche);
        } else {
            System.out.println("\n�tudiant non trouv�.");
        }
    }
}
