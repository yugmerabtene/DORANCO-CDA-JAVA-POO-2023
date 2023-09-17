package swingInit;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Crée et exécute l'application Swing sur le thread de l'interface utilisateur
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crée une instance de GuessingGameLogic (jeu) et démarre le jeu
                GuessingGame game = new GuessingGameLogic();
                game.startGame();
            }
        });
    }
}
