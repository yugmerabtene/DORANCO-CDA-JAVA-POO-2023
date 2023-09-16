package jdbc;

import java.util.List;

public interface EtudiantRepository {
    List<Etudiant> getAllEtudiants();       // Obtenir la liste compl�te des �tudiants
    Etudiant getEtudiantById(int id);       // Obtenir un �tudiant par son ID
    void addEtudiant(Etudiant etudiant);    // Ajouter un nouvel �tudiant
    void updateEtudiant(Etudiant etudiant); // Mettre � jour les informations d'un �tudiant
    void deleteEtudiant(int id);            // Supprimer un �tudiant par son ID
}
