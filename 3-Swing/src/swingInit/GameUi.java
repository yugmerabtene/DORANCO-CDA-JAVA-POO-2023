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
        JFrame frame = new JFrame("Devinez le nombre");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Devinez un nombre entre 0 et 5:");
        JTextField textField = new JTextField(10);
        JButton guessButton = new JButton("Devinez");
        JLabel resultLabel = new JLabel("");

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int guess = Integer.parseInt(textField.getText());
                    game.checkGuess(guess);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Veuillez entrer un nombre valide.");
                }
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(guessButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}

