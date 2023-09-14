package jdbc;

import java.util.List;

public interface EtudiantRepository {
    List<Etudiant> getAllEtudiants();
    Etudiant getEtudiantById(int id);
    void addEtudiant(Etudiant etudiant);
    void updateEtudiant(Etudiant etudiant);
    void deleteEtudiant(int id);
}
