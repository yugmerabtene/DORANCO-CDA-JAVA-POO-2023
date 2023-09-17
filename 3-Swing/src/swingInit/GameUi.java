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
        // Cr�e une fen�tre Swing avec le titre "Devinez le nombre"
        JFrame frame = new JFrame("Devinez le nombre");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ferme l'application lorsque la fen�tre est ferm�e
        frame.setSize(400, 150); // D�finit la taille de la fen�tre � 400x150 pixels
        frame.setLayout(new FlowLayout()); // Utilise un gestionnaire de disposition FlowLayout

        // Cr�e une �tiquette (label) pour afficher un message
        JLabel label = new JLabel("Devinez un nombre entre 0 et 5:");
        
        // Cr�e un champ de texte pour permettre � l'utilisateur d'entrer sa supposition
        JTextField textField = new JTextField(10); // 10 caract�res de large

        // Cr�e un bouton "Devinez"
        JButton guessButton = new JButton("Devinez");

        // Cr�e une �tiquette (label) pour afficher le r�sultat (correct, trop bas, trop �lev�)
        JLabel resultLabel = new JLabel("");

        // Ajoute un �couteur d'�v�nements au bouton "Devinez"
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // R�cup�re le nombre saisi par l'utilisateur et le convertit en entier
                    int guess = Integer.parseInt(textField.getText());
                    // Appelle la m�thode checkGuess du jeu pour v�rifier la supposition
                    game.checkGuess(guess);
                } catch (NumberFormatException ex) {
                    // Affiche un message d'erreur si l'entr�e n'est pas un nombre valide
                    resultLabel.setText("Veuillez entrer un nombre valide.");
                }
            }
        });

        // Ajoute les composants � la fen�tre
        frame.add(label);
        frame.add(textField);
        frame.add(guessButton);
        frame.add(resultLabel);

        // Rend la fen�tre visible
        frame.setVisible(true);
    }
}
