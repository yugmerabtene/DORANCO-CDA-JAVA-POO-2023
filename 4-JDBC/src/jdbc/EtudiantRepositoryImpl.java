package jdbc;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EtudiantRepositoryImpl implements EtudiantRepository {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/java"; // URL de la base de données
    private String user = "root";                                  // Nom d'utilisateur MySQL
    private String password = "";                                  // Mot de passe MySQL

    // Méthode pour obtenir la liste complète des étudiants
    @Override
    public List<Etudiant> getAllEtudiants() {
        List<Etudiant> etudiants = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM etudiants")) {

            while (resultSet.next()) {
                Etudiant etudiant = new Etudiant();
                etudiant.setId(resultSet.getInt("id"));
                etudiant.setNom(resultSet.getString("nom"));
                etudiant.setPrenom(resultSet.getString("prenom"));
                etudiant.setDateNaissance(resultSet.getDate("date_naissance"));
                etudiant.setEmail(resultSet.getString("email"));
                etudiant.setMatricule(resultSet.getString("matricule"));
                etudiants.add(etudiant);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return etudiants;
    }

    // Méthode pour obtenir un étudiant par ID
    @Override
    public Etudiant getEtudiantById(int id) {
        Etudiant etudiant = null;
        try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM etudiants WHERE id = ?")) {

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                etudiant = new Etudiant();
                etudiant.setId(resultSet.getInt("id"));
                etudiant.setNom(resultSet.getString("nom"));
                etudiant.setPrenom(resultSet.getString("prenom"));
                etudiant.setDateNaissance(resultSet.getDate("date_naissance"));
                etudiant.setEmail(resultSet.getString("email"));
                etudiant.setMatricule(resultSet.getString("matricule"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return etudiant;
    }

    // Méthode pour ajouter un nouvel étudiant
    @Override
    public void addEtudiant(Etudiant etudiant) {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO etudiants (nom, prenom, date_naissance, email, matricule) VALUES (?, ?, ?, ?, ?)")) {

            preparedStatement.setString(1, etudiant.getNom());
            preparedStatement.setString(2, etudiant.getPrenom());
            preparedStatement.setDate(3, new java.sql.Date(etudiant.getDateNaissance().getTime()));
            preparedStatement.setString(4, etudiant.getEmail());
            preparedStatement.setString(5, etudiant.getMatricule());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour mettre à jour un étudiant
    @Override
    public void updateEtudiant(Etudiant etudiant) {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(
                "UPDATE etudiants SET nom=?, prenom=?, date_naissance=?, email=?, matricule=? WHERE id=?")) {

            preparedStatement.setString(1, etudiant.getNom());
            preparedStatement.setString(2, etudiant.getPrenom());
            preparedStatement.setDate(3, new java.sql.Date(etudiant.getDateNaissance().getTime()));
            preparedStatement.setString(4, etudiant.getEmail());
            preparedStatement.setString(5, etudiant.getMatricule());
            preparedStatement.setInt(6, etudiant.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour supprimer un étudiant par ID
    @Override
    public void deleteEtudiant(int id) {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM etudiants WHERE id=?")) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
