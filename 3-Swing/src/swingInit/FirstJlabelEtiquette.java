package swingInit;


import javax.swing.*;
import java.awt.*;

public class FirstJlabelEtiquette {

public static void main(String argv[]) {
 // Création d'une instance de JFrame (fenêtre Swing)
 JFrame f = new JFrame("ma fenetre");
 
 // Définition de la taille de la fenêtre (100 pixels de largeur, 200 pixels de hauteur)
 f.setSize(100, 200);

 // Création d'un JPanel (panneau) pour contenir les composants
 JPanel panel = new JPanel(); 
 
 // Création d'un JLabel (étiquette) avec le texte "Mon texte dans JLabel"
 JLabel jLabel1 = new JLabel("Mon texte dans JLabel"); 
 
 // Ajout du JLabel jLabel1 au JPanel
 panel.add(jLabel1);

 // Création d'une ImageIcon à partir du fichier "book.gif"
 ImageIcon icon = new ImageIcon("facebook.gif");
 
 // Création d'un JLabel jLabel2 avec l'icône chargée
 JLabel jLabel2 = new JLabel(icon); 
 
 // Ajout du JLabel jLabel2 au JPanel
 panel.add(jLabel2);

 // Création d'un JLabel jLabel3 avec du texte, une icône et un alignement spécifié
 JLabel jLabel3 = new JLabel("Mon texte", icon, SwingConstants.LEFT); 
 // Ajout d'une couleur
 panel.setBackground(Color.red); 
 // Ajout du JLabel jLabel3 au JPanel
 panel.add(jLabel3);

 // Ajout du JPanel (contenant les JLabels) à la zone de contenu de la fenêtre
 f.getContentPane().add(panel);
 
 // Rendre la fenêtre visible à l'écran
 f.setVisible(true);
}
}

