package swingInit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

// Créer une interface de base pour le jeu
interface GuessingGame {
    void startGame(); // Méthode pour démarrer le jeu
    void checkGuess(int guess); // Méthode pour vérifier la devinette
}

// Classe principale qui implémente l'interface et gère le jeu
class NumberGuessingGame implements GuessingGame {
    private int randomNumber; // Le nombre aléatoire à deviner
    private int attempts = 0; // Le nombre d'essais effectués par le joueur
    private final int maxAttempts = 5; // Le nombre maximal d'essais autorisés

    // Constructeur de la classe NumberGuessingGame
    public NumberGuessingGame() {
        // Générer un nombre aléatoire entre 1 et 100
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1; // La plage de nombres est de 1 à 100 inclus
    }

    @Override
    public void startGame() {
        // Créer une fenêtre Swing pour le jeu
        JFrame frame = new JFrame("Devinez le nombre"); // Création d'une fenêtre Swing avec un titre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Définir l'action de fermeture de la fenêtre
        frame.setSize(400, 150); // Définir la taille de la fenêtre
        frame.setLayout(new FlowLayout()); // Utiliser un gestionnaire de disposition de type FlowLayout

<<<<<<< HEAD
        JLabel label = new JLabel("Devinez un nombre entre 1 et 5:"); // Création d'une étiquette
=======
        JLabel label = new JLabel("Devinez un nombre entre 1 et 100:"); // Création d'une étiquette
>>>>>>> 680418f76e447f067831ba86fa019ede3de40649
        JTextField textField = new JTextField(10); // Création d'un champ de texte pour l'entrée du nombre
        JButton guessButton = new JButton("Devinez"); // Création d'un bouton de devinette
        JLabel resultLabel = new JLabel(""); // Création d'une étiquette pour afficher les résultats

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int guess = Integer.parseInt(textField.getText()); // Récupération de la devinette depuis le champ de texte
                    checkGuess(guess); // Appel de la méthode pour vérifier la devinette
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Veuillez entrer un nombre valide."); // Affichage d'un message d'erreur en cas d'entrée non valide
                }
            }
        });

        // Ajout des composants à la fenêtre
        frame.add(label);
        frame.add(textField);
        frame.add(guessButton);
        frame.add(resultLabel);
        frame.setVisible(true); // Rendre la fenêtre visible
    }

    @Override
    public void checkGuess(int guess) {
        attempts++; // Incrémente le nombre d'essais
        if (guess == randomNumber) {
            JOptionPane.showMessageDialog(null, "Bravo ! Vous avez deviné le nombre en " + attempts + " essais."); // Affiche un message de victoire
            System.exit(0); // Termine l'application après avoir deviné correctement
        } else if (attempts >= maxAttempts) {
            JOptionPane.showMessageDialog(null, "Vous avez atteint le nombre maximal d'essais. Le nombre était " + randomNumber + "."); // Affiche un message de fin de partie
            System.exit(0); // Termine l'application après avoir épuisé tous les essais
        } else if (guess < randomNumber) {
            JOptionPane.showMessageDialog(null, "Trop bas. Essayez encore."); // Indique que la devinette est trop basse
        } else {
            JOptionPane.showMessageDialog(null, "Trop élevé. Essayez encore."); // Indique que la devinette est trop élevée
        }
    }
}

public class MainGuessingGames {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GuessingGame game = new NumberGuessingGame(); // Création d'une instance de jeu
                game.startGame(); // Démarre le jeu
            }
        });
    }
}
