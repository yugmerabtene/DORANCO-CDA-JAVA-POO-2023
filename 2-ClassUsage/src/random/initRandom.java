package random;
import java.util.Random;

public class initRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
			
			// Random double 
			Random random = new Random();			
			// Generer un nombre aleatoire 0 / 1			
			double randomNumber = random.nextDouble();	
			System.out.println("le chiffre aleatoire est" + randomNumber);
		
			// Random int 
			int entierAleatoire = random.nextInt(10);
			System.out.println("Nombre Entier aléatoire est : " + entierAleatoire);


	}

}
