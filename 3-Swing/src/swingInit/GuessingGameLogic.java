package swingInit;

import javax.swing.*;
import java.util.Random;

// Classe principale qui implémente l'interface et gère le jeu
public class GuessingGameLogic implements GuessingGame {
    private int randomNumber; // Le nombre aléatoire à deviner
    private int attempts = 0; // Le nombre d'essais effectués par le joueur
    private final int maxAttempts = 5; // Le nombre maximal d'essais autorisés

    // Constructeur de la classe GuessingGameLogic
    public GuessingGameLogic() {
        Random rand = new Random();
        randomNumber = rand.nextInt(6); // Génère un nombre aléatoire entre 0 et 5 inclus
    }

    public void startGame() {
        // Crée une instance de l'interface utilisateur et passe cette instance de jeu
        GameUi ui = new GameUi(this);
        // Crée l'interface utilisateur
        ui.createUI();
    }

    public void checkGuess(int guess) {
        attempts++; // Incrémente le nombre d'essais effectués

        if (guess == randomNumber) {
            // Affiche un message de victoire si la devinette est correcte
            JOptionPane.showMessageDialog(null, "Bravo ! Vous avez deviné le nombre en " + attempts + " essais.");
            System.exit(0); // Termine l'application après avoir deviné correctement
        } else if (attempts >= maxAttempts) {
            // Affiche un message lorsque le nombre maximal d'essais est atteint
            JOptionPane.showMessageDialog(null, "Vous avez atteint le nombre maximal d'essais. Le nombre était " + randomNumber + ".");
            System.exit(0); // Termine l'application après avoir épuisé tous les essais
        } else if (guess < randomNumber) {
            // Indique que la devinette est trop basse
            JOptionPane.showMessageDialog(null, "Trop bas. Essayez encore.");
        } else {
            // Indique que la devinette est trop élevée
            JOptionPane.showMessageDialog(null, "Trop élevé. Essayez encore.");
        }
    }
}
