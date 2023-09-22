package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class testCodeApprenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Les informations de connexion a la base donn�e
		String jdbcUrl = "jdbc:mysql://localhost:3306/javadatabase"; // URL de la base de donn�es (changez-la en fonction de votre configuration)
        String user = "root"; // Nom d'utilisateur MySQL
        String password = ""; // Mot de passe MySQL
        
        //Insertion de donn�e
        String nom = "Benoit";
        String prenom = "David";
        String dateNaissance = "1982-12-10";
        String email = "benoitdavid@jaiunmail.com";
        String matricule = "E240";
       
        try {
        	// Ici, nous utilisons la m�thode statique forName() pour charger le pilote.
        	Class.forName("com.mysql.cj.jdbc.Driver");     
            
        	//Etablir la connexion a la base de donn�e
        	Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
        	
        	//Requ^te d'insertion
        	String sql= "INSER INTO etudiants (nom, prenom, dateNaissance, email, matricule) VALUES(?, ?, ?, ?, ?)";
        	
        	PreparedStatement preparedStatement = connection.prepareStatement(sql);
        	
        	preparedStatement.setString(1, nom);
        	preparedStatement.setString(1, prenom);
        	preparedStatement.setString(1, dateNaissance);
        	preparedStatement.setString(1, email);
        	preparedStatement.setString(1, matricule);
        	
        	//Ex�cuter
        	int lignesAffectes = preparedStatement.executeUpdate();
        	
        	if(lignesAffectes >0) {
        		System.out.println("Insertion r�ussie");
        	}else {
        		System.out.println("Insertion �chou�");
        		
        		//fermer la connexion
        		preparedStatement.close();
        		connection.close();
        	}
        	
        	
        }catch(SQLException | ClassNotFoundException errorInfos) {
        	errorInfos.printStackTrace();
        }
		
		
		
	}

}
