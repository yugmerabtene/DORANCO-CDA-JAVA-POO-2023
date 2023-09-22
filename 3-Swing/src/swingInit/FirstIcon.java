package swingInit;

import javax.swing.*;

public class FirstIcon {

  public static void main(String argv[]) {

    // Cr�e une instance de JFrame avec le titre "ma fenetre"
    JFrame f = new JFrame("ma fenetre");
    
    // D�finit les dimensions de la fen�tre � 300 pixels de largeur et 100 pixels de hauteur
    f.setSize(300, 100);
    
    // Cr�e un bouton avec le texte "Mon bouton"
    JButton b = new JButton("Mon bouton Je teste les icon");
    
    // Ajoute le bouton au contenu (content pane) de la fen�tre
    f.getContentPane().add(b);

    // D�finit le comportement de fermeture de la fen�tre (DISPOSE_ON_CLOSE)
    // DISPOSE_ON_CLOSE : Ferme uniquement la fen�tre, mais l'application continue � s'ex�cuter
    f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    // Cr�e une instance de ImageIcon � partir d'une image "facebook.png"
    ImageIcon image = new ImageIcon("facebook.gif");
    
    // D�finit l'ic�ne de la fen�tre avec l'image charg�e
    f.setIconImage(image.getImage());
    
    // Rend la fen�tre visible � l'�cran
    f.setVisible(true);
  }
}

