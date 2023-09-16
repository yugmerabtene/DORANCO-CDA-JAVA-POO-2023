package jdbc;

import java.util.List;

public interface EtudiantRepository {
    List<Etudiant> getAllEtudiants();       // Obtenir la liste complète des étudiants
    Etudiant getEtudiantById(int id);       // Obtenir un étudiant par son ID
    void addEtudiant(Etudiant etudiant);    // Ajouter un nouvel étudiant
    void updateEtudiant(Etudiant etudiant); // Mettre à jour les informations d'un étudiant
    void deleteEtudiant(int id);            // Supprimer un étudiant par son ID
}
