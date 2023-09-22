package swingInit;

import javax.swing.*;

public class FirstClose {

  public static void main(String argv[]) {

    // Crée une instance de JFrame avec le titre "ma fenetre"
    JFrame f = new JFrame("ma fenetre");
    
    // Définit les dimensions de la fenêtre à 300 pixels de largeur et 100 pixels de hauteur
    f.setSize(300, 100);
    
    // Crée un bouton avec le texte "Mon bouton"
    JButton b = new JButton("Mon bouton");
    
    // Ajoute le bouton au contenu (content pane) de la fenêtre
    f.getContentPane().add(b);

    // Définit le comportement de fermeture de la fenêtre (DISPOSE_ON_CLOSE)
    // DISPOSE_ON_CLOSE : Ferme uniquement la fenêtre, mais l'application continue à s'exécuter
    f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    // Rend la fenêtre visible à l'écran
    f.setVisible(true);
  }
}
