package swingInit;

import javax.swing.*;

public class FirstIcon {

  public static void main(String argv[]) {

    // Crée une instance de JFrame avec le titre "ma fenetre"
    JFrame f = new JFrame("ma fenetre");
    
    // Définit les dimensions de la fenêtre à 300 pixels de largeur et 100 pixels de hauteur
    f.setSize(300, 100);
    
    // Crée un bouton avec le texte "Mon bouton"
    JButton b = new JButton("Mon bouton Je teste les icon");
    
    // Ajoute le bouton au contenu (content pane) de la fenêtre
    f.getContentPane().add(b);

    // Définit le comportement de fermeture de la fenêtre (DISPOSE_ON_CLOSE)
    // DISPOSE_ON_CLOSE : Ferme uniquement la fenêtre, mais l'application continue à s'exécuter
    f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    // Crée une instance de ImageIcon à partir d'une image "facebook.png"
    ImageIcon image = new ImageIcon("facebook.gif");
    
    // Définit l'icône de la fenêtre avec l'image chargée
    f.setIconImage(image.getImage());
    
    // Rend la fenêtre visible à l'écran
    f.setVisible(true);
  }
}

