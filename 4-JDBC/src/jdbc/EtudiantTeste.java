package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EtudiantTeste {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// Les information de connexion à la base de données 
		String jdbcUrl = "jdbc:mysql://localhost:3306/java"; // URL de la base de données (changez-la en fonction de votre configuration)
        String user = "root"; // Nom d'utilisateur MySQL
        String password = ""; // Mot de passe MySQL
        
        // les donnees à inserer 
        String nom = "Benoit";
        String prenom = "David";
        String date_naissance = "1982-12-10";
        String email = "benoitdavid@jaiunmail.com";
        String matricule = "E240";
        
        try {
        	// charger le pilote
        	 Class.forName("com.mysql.cj.jdbc.Driver");
        	// etablir la connexion a la base de donnée
        	Connection connection =  DriverManager.getConnection(jdbcUrl, user, password);
        	
        	// requette d'insertion 
        	String sql = "INSERT INTO etudiants (nom, prenom, date_naissance, email, matricule) "
        			+ "VALUES (?, ?, ?, ?, ?)";
        	PreparedStatement preparedStatement = connection.prepareStatement(sql);        	
        	
        	preparedStatement.setString(1, nom);
        	preparedStatement.setString(2, prenom);
        	preparedStatement.setString(3, date_naissance);
        	preparedStatement.setString(4, email);
        	preparedStatement.setString(5, matricule);
        	
        	// executer 
        	int lignesAffectees = preparedStatement.executeUpdate();
        	
        	if ( lignesAffectees > 0) {
        		System.out.println("L'insertion a réussi");
        	}else {
        		System.out.println("L'insertion a échoué");
        		
        	}

    		// fermer la connexion 
    		preparedStatement.close();
    		connection.close();	
        	
        	
        	
        }catch (SQLException e) {
        	e.printStackTrace();
        }
        
        
        
        
        

	}

}
