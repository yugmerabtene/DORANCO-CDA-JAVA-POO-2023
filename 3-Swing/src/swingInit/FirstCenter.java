package swingInit;

import javax.swing.*;
import java.awt.*;

public class FirstCenter {

public static void main(String argv[]) {
 // Création d'une instance de JFrame (fenêtre)
 JFrame f = new JFrame("ma fenetre");
 
 // Définition de la taille de la fenêtre (300 pixels de largeur, 100 pixels de hauteur)
 f.setSize(300, 100);
 
 // Création d'un bouton avec le texte "Mon bouton"
 JButton b = new JButton("Mon bouton"); 
 
 // Ajout du bouton à la zone de contenu de la fenêtre
 f.getContentPane().add(b);

 // Définition de l'opération par défaut lorsque l'utilisateur ferme la fenêtre
 f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

 // Obtention de la taille de l'écran par défaut
 Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
 
 // Définition de la position de la fenêtre pour la centrer sur l'écran
 f.setLocation(dim.width/2 - f.getWidth()/2, dim.height/2 - f.getHeight()/2);

 // Rendre la fenêtre visible
 f.setVisible(true);
}
}

