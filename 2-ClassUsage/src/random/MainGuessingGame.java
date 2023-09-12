package random;
import java.util.Scanner;


public class MainGuessingGame {
    public static void main(String[] args) {
        // Crée une instance du jeu en passant le Scanner
        Scanner scanner = new Scanner(System.in);
        GuessingGame game = new GuessingGameLogic(scanner);

        // Lancement du jeu
        game.startGame();

        // Fermeture du scanner
        scanner.close();
    }
}

