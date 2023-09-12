package random;
import java.util.Random;



import java.util.Random;
import java.util.Scanner; // Importez Scanner

public class GuessingGameLogic implements GuessingGame {
    private final int maxAttempts = 5;
    private int randomNumber;
    private int attempts = 0;
    private Scanner scanner; // Ajoutez une variable de type Scanner

    public GuessingGameLogic(Scanner scanner) { // Modifiez le constructeur
        this.scanner = scanner; // Initialisez le scanner
        // G�n�re un nombre al�atoire entre 0 et 5 inclus
        Random rand = new Random();
        randomNumber = rand.nextInt(6);
    }

    @Override
    public void startGame() {
        System.out.println("Bienvenue dans le jeu de devinette de nombre!");
        System.out.println("Devinez un nombre entre 0 et 5.");

        // Boucle principale du jeu
        while (attempts < maxAttempts) {
            int guess = getUserInput(); // R�cup�re la saisie de l'utilisateur
            boolean isCorrect = checkGuess(guess); // V�rifie si la devinette est correcte

            if (isCorrect) {
                System.out.println("Bravo ! Vous avez devin� le nombre en " + attempts + " essais.");
                return; // Termine le jeu
            } else {
                System.out.println("Essai incorrect. Essayez encore.");
            }
        }

        // Si l'utilisateur a �puis� tous les essais
        System.out.println("Vous avez atteint le nombre maximal d'essais. Le nombre �tait " + randomNumber + ".");
    }

    @Override
    public boolean checkGuess(int guess) {
        attempts++; // Incr�mente le nombre d'essais
        if (guess == randomNumber) {
            return true; // La devinette est correcte
        } else if (attempts >= maxAttempts) {
            return false; // Le joueur a �puis� tous les essais
        }
        return false; // La devinette est incorrecte
    }

    public int getUserInput() {
        int guess;

        while (true) {
            try {
                System.out.print("Entrez votre devinette : ");
                guess = scanner.nextInt(); // R�cup�re la saisie de l'utilisateur avec le scanner
                break; // Sort de la boucle si la saisie est un entier valide
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Veuillez entrer un nombre valide.");
                scanner.nextLine(); // Ignorer l'entr�e invalide
            }
        }

        return guess;
    }
}

