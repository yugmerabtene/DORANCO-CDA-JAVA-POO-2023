package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
    public static void main(String[] args) {
        // Informations de connexion � la base de donn�es
        String jdbcUrl = "jdbc:mysql://localhost:3306/java"; // URL de la base de donn�es (changez-la en fonction de votre configuration)
        String user = "root"; // Nom d'utilisateur MySQL
        String password = ""; // Mot de passe MySQL

        try {
            // �tape 1 : Charger le pilote JDBC MySQL
            // Le pilote JDBC doit �tre charg� pour que vous puissiez l'utiliser pour vous connecter � MySQL.
            // Ici, nous utilisons la m�thode statique forName() pour charger le pilote.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // �tape 2 : �tablir une connexion � la base de donn�es
            // La m�thode getConnection() �tablit une connexion � la base de donn�es en utilisant l'URL, le nom d'utilisateur et le mot de passe fournis.
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

            // �tape 3 : V�rifier si la connexion a r�ussi
            // Nous v�rifions si la connexion est diff�rente de null pour d�terminer si la connexion a r�ussi.
            if (connection != null) {
                System.out.println("Connexion � la base de donn�es r�ussie !");
            } else {
                System.out.println("La connexion � la base de donn�es a �chou�.");
            }

            // �tape 4 : Utiliser la connexion ici
            // Vous pouvez ex�cuter des requ�tes SQL et effectuer des op�rations sur la base de donn�es � partir d'ici.

            // �tape 5 : Fermer la connexion lorsque vous avez fini
            // Il est important de fermer la connexion lorsque vous avez termin� pour lib�rer les ressources.
            connection.close();
        } catch (ClassNotFoundException e) {
            // Gestion des exceptions li�es au chargement du pilote JDBC
            e.printStackTrace();
        } catch (SQLException e) {
            // Gestion des exceptions li�es � la connexion � la base de donn�es
            e.printStackTrace();
        }
    }
}
