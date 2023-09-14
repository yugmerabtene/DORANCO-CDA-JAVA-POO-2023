package swingInit;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GuessingGame game = new GuessingGameLogic();
                game.startGame();
            }
        });
    }
}
