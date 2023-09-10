package swingInit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

// Cr�er une interface de base pour le jeu
interface GuessingGame {
    void startGame(); // M�thode pour d�marrer le jeu
    void checkGuess(int guess); // M�thode pour v�rifier la devinette
}

// Classe principale qui impl�mente l'interface et g�re le jeu
class NumberGuessingGame implements GuessingGame {
    private int randomNumber; // Le nombre al�atoire � deviner
    private int attempts = 0; // Le nombre d'essais effectu�s par le joueur
    private final int maxAttempts = 5; // Le nombre maximal d'essais autoris�s

    // Constructeur de la classe NumberGuessingGame
    public NumberGuessingGame() {
        // G�n�rer un nombre al�atoire entre 1 et 100
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1; // La plage de nombres est de 1 � 100 inclus
    }

    @Override
    public void startGame() {
        // Cr�er une fen�tre Swing pour le jeu
        JFrame frame = new JFrame("Devinez le nombre"); // Cr�ation d'une fen�tre Swing avec un titre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // D�finir l'action de fermeture de la fen�tre
        frame.setSize(400, 150); // D�finir la taille de la fen�tre
        frame.setLayout(new FlowLayout()); // Utiliser un gestionnaire de disposition de type FlowLayout

<<<<<<< HEAD
        JLabel label = new JLabel("Devinez un nombre entre 1 et 5:"); // Cr�ation d'une �tiquette
=======
        JLabel label = new JLabel("Devinez un nombre entre 1 et 100:"); // Cr�ation d'une �tiquette
>>>>>>> 680418f76e447f067831ba86fa019ede3de40649
        JTextField textField = new JTextField(10); // Cr�ation d'un champ de texte pour l'entr�e du nombre
        JButton guessButton = new JButton("Devinez"); // Cr�ation d'un bouton de devinette
        JLabel resultLabel = new JLabel(""); // Cr�ation d'une �tiquette pour afficher les r�sultats

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int guess = Integer.parseInt(textField.getText()); // R�cup�ration de la devinette depuis le champ de texte
                    checkGuess(guess); // Appel de la m�thode pour v�rifier la devinette
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Veuillez entrer un nombre valide."); // Affichage d'un message d'erreur en cas d'entr�e non valide
                }
            }
        });

        // Ajout des composants � la fen�tre
        frame.add(label);
        frame.add(textField);
        frame.add(guessButton);
        frame.add(resultLabel);
        frame.setVisible(true); // Rendre la fen�tre visible
    }

    @Override
    public void checkGuess(int guess) {
        attempts++; // Incr�mente le nombre d'essais
        if (guess == randomNumber) {
            JOptionPane.showMessageDialog(null, "Bravo ! Vous avez devin� le nombre en " + attempts + " essais."); // Affiche un message de victoire
            System.exit(0); // Termine l'application apr�s avoir devin� correctement
        } else if (attempts >= maxAttempts) {
            JOptionPane.showMessageDialog(null, "Vous avez atteint le nombre maximal d'essais. Le nombre �tait " + randomNumber + "."); // Affiche un message de fin de partie
            System.exit(0); // Termine l'application apr�s avoir �puis� tous les essais
        } else if (guess < randomNumber) {
            JOptionPane.showMessageDialog(null, "Trop bas. Essayez encore."); // Indique que la devinette est trop basse
        } else {
            JOptionPane.showMessageDialog(null, "Trop �lev�. Essayez encore."); // Indique que la devinette est trop �lev�e
        }
    }
}

public class MainGuessingGames {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GuessingGame game = new NumberGuessingGame(); // Cr�ation d'une instance de jeu
                game.startGame(); // D�marre le jeu
            }
        });
    }
}
