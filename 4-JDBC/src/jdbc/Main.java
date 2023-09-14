package jdbc;

import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Créez une instance de la classe de repository
        EtudiantRepository etudiantRepository = new EtudiantRepositoryImpl();

        // Test de la méthode getAllEtudiants()
        List<Etudiant> etudiants = etudiantRepository.getAllEtudiants();
        System.out.println("Liste de tous les étudiants :");
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }

        // Test de la méthode addEtudiant()
        Etudiant nouvelEtudiant = new Etudiant(0, "John", "Doe", new Date(), "john.doe@example.com", "12345");
        etudiantRepository.addEtudiant(nouvelEtudiant);
        System.out.println("\nNouvel étudiant ajouté : " + nouvelEtudiant);

        // Test de la méthode updateEtudiant()
        int idAUpdater = 1; // Remplacez 1 par l'ID de l'étudiant à mettre à jour
        Etudiant etudiantAModifier = etudiantRepository.getEtudiantById(idAUpdater);
        if (etudiantAModifier != null) {
            etudiantAModifier.setNom("NouveauNom");
            etudiantRepository.updateEtudiant(etudiantAModifier);
            System.out.println("\nÉtudiant mis à jour : " + etudiantAModifier);
        } else {
            System.out.println("\nÉtudiant non trouvé pour la mise à jour.");
        }

        // Test de la méthode deleteEtudiant()
        int idASupprimer = 2; // Remplacez 2 par l'ID de l'étudiant à supprimer
        etudiantRepository.deleteEtudiant(idASupprimer);
        System.out.println("\nÉtudiant avec ID " + idASupprimer + " supprimé.");

        // Test de la méthode getEtudiantById()
        int idAChercher = 3; // Remplacez 3 par l'ID de l'étudiant à chercher
        Etudiant etudiantCherche = etudiantRepository.getEtudiantById(idAChercher);
        if (etudiantCherche != null) {
            System.out.println("\nÉtudiant trouvé : " + etudiantCherche);
        } else {
            System.out.println("\nÉtudiant non trouvé.");
        }
    }
}
