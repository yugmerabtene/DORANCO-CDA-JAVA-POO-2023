package swingInit;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Cr�e et ex�cute l'application Swing sur le thread de l'interface utilisateur
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Cr�e une instance de GuessingGameLogic (jeu) et d�marre le jeu
                GuessingGame game = new GuessingGameLogic();
                game.startGame();
            }
        });
    }
}
