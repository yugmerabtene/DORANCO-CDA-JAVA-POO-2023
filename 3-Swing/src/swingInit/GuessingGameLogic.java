package swingInit;

import javax.swing.*;
import java.util.Random;

// Classe principale qui impl�mente l'interface et g�re le jeu
public class GuessingGameLogic implements GuessingGame {
    private int randomNumber; // Le nombre al�atoire � deviner
    private int attempts = 0; // Le nombre d'essais effectu�s par le joueur
    private final int maxAttempts = 5; // Le nombre maximal d'essais autoris�s

    // Constructeur de la classe GuessingGameLogic
    public GuessingGameLogic() {
        Random rand = new Random();
        randomNumber = rand.nextInt(6); // G�n�re un nombre al�atoire entre 0 et 5 inclus
    }

    public void startGame() {
        // Cr�e une instance de l'interface utilisateur et passe cette instance de jeu
        GameUi ui = new GameUi(this);
        // Cr�e l'interface utilisateur
        ui.createUI();
    }

    public void checkGuess(int guess) {
        attempts++; // Incr�mente le nombre d'essais effectu�s

        if (guess == randomNumber) {
            // Affiche un message de victoire si la devinette est correcte
            JOptionPane.showMessageDialog(null, "Bravo ! Vous avez devin� le nombre en " + attempts + " essais.");
            System.exit(0); // Termine l'application apr�s avoir devin� correctement
        } else if (attempts >= maxAttempts) {
            // Affiche un message lorsque le nombre maximal d'essais est atteint
            JOptionPane.showMessageDialog(null, "Vous avez atteint le nombre maximal d'essais. Le nombre �tait " + randomNumber + ".");
            System.exit(0); // Termine l'application apr�s avoir �puis� tous les essais
        } else if (guess < randomNumber) {
            // Indique que la devinette est trop basse
            JOptionPane.showMessageDialog(null, "Trop bas. Essayez encore.");
        } else {
            // Indique que la devinette est trop �lev�e
            JOptionPane.showMessageDialog(null, "Trop �lev�. Essayez encore.");
        }
    }
}
