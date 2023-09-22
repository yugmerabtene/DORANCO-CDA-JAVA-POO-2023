package swingInit;

import javax.swing.*;
import java.awt.*;

public class FirstCenter {

public static void main(String argv[]) {
 // Cr�ation d'une instance de JFrame (fen�tre)
 JFrame f = new JFrame("ma fenetre");
 
 // D�finition de la taille de la fen�tre (300 pixels de largeur, 100 pixels de hauteur)
 f.setSize(300, 100);
 
 // Cr�ation d'un bouton avec le texte "Mon bouton"
 JButton b = new JButton("Mon bouton"); 
 
 // Ajout du bouton � la zone de contenu de la fen�tre
 f.getContentPane().add(b);

 // D�finition de l'op�ration par d�faut lorsque l'utilisateur ferme la fen�tre
 f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

 // Obtention de la taille de l'�cran par d�faut
 Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
 
 // D�finition de la position de la fen�tre pour la centrer sur l'�cran
 f.setLocation(dim.width/2 - f.getWidth()/2, dim.height/2 - f.getHeight()/2);

 // Rendre la fen�tre visible
 f.setVisible(true);
}
}

