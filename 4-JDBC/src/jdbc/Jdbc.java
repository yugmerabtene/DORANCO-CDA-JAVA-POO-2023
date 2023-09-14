package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
    public static void main(String[] args) {
        // Informations de connexion à la base de données
        String jdbcUrl = "jdbc:mysql://localhost:3306/java"; // URL de la base de données (changez-la en fonction de votre configuration)
        String user = "root"; // Nom d'utilisateur MySQL
        String password = ""; // Mot de passe MySQL

        try {
            // Étape 1 : Charger le pilote JDBC MySQL
            // Le pilote JDBC doit être chargé pour que vous puissiez l'utiliser pour vous connecter à MySQL.
            // Ici, nous utilisons la méthode statique forName() pour charger le pilote.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Étape 2 : Établir une connexion à la base de données
            // La méthode getConnection() établit une connexion à la base de données en utilisant l'URL, le nom d'utilisateur et le mot de passe fournis.
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

            // Étape 3 : Vérifier si la connexion a réussi
            // Nous vérifions si la connexion est différente de null pour déterminer si la connexion a réussi.
            if (connection != null) {
                System.out.println("Connexion à la base de données réussie !");
            } else {
                System.out.println("La connexion à la base de données a échoué.");
            }

            // Étape 4 : Utiliser la connexion ici
            // Vous pouvez exécuter des requêtes SQL et effectuer des opérations sur la base de données à partir d'ici.

            // Étape 5 : Fermer la connexion lorsque vous avez fini
            // Il est important de fermer la connexion lorsque vous avez terminé pour libérer les ressources.
            connection.close();
        } catch (ClassNotFoundException e) {
            // Gestion des exceptions liées au chargement du pilote JDBC
            e.printStackTrace();
        } catch (SQLException e) {
            // Gestion des exceptions liées à la connexion à la base de données
            e.printStackTrace();
        }
    }
}
