package swingInit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameUi {
    private GuessingGame game;

    public GameUi(GuessingGame game) {
        this.game = game;
    }

    public void createUI() {
        // Crée une fenêtre Swing avec le titre "Devinez le nombre"
        JFrame frame = new JFrame("Devinez le nombre");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ferme l'application lorsque la fenêtre est fermée
        frame.setSize(400, 150); // Définit la taille de la fenêtre à 400x150 pixels
        frame.setLayout(new FlowLayout()); // Utilise un gestionnaire de disposition FlowLayout

        // Crée une étiquette (label) pour afficher un message
        JLabel label = new JLabel("Devinez un nombre entre 0 et 5:");
        
        // Crée un champ de texte pour permettre à l'utilisateur d'entrer sa supposition
        JTextField textField = new JTextField(10); // 10 caractères de large

        // Crée un bouton "Devinez"
        JButton guessButton = new JButton("Devinez");

        // Crée une étiquette (label) pour afficher le résultat (correct, trop bas, trop élevé)
        JLabel resultLabel = new JLabel("");

        // Ajoute un écouteur d'événements au bouton "Devinez"
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Récupère le nombre saisi par l'utilisateur et le convertit en entier
                    int guess = Integer.parseInt(textField.getText());
                    // Appelle la méthode checkGuess du jeu pour vérifier la supposition
                    game.checkGuess(guess);
                } catch (NumberFormatException ex) {
                    // Affiche un message d'erreur si l'entrée n'est pas un nombre valide
                    resultLabel.setText("Veuillez entrer un nombre valide.");
                }
            }
        });

        // Ajoute les composants à la fenêtre
        frame.add(label);
        frame.add(textField);
        frame.add(guessButton);
        frame.add(resultLabel);

        // Rend la fenêtre visible
        frame.setVisible(true);
    }
}
