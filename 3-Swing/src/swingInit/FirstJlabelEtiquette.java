package swingInit;


import javax.swing.*;
import java.awt.*;

public class FirstJlabelEtiquette {

public static void main(String argv[]) {
 // Cr�ation d'une instance de JFrame (fen�tre Swing)
 JFrame f = new JFrame("ma fenetre");
 
 // D�finition de la taille de la fen�tre (100 pixels de largeur, 200 pixels de hauteur)
 f.setSize(100, 200);

 // Cr�ation d'un JPanel (panneau) pour contenir les composants
 JPanel panel = new JPanel(); 
 
 // Cr�ation d'un JLabel (�tiquette) avec le texte "Mon texte dans JLabel"
 JLabel jLabel1 = new JLabel("Mon texte dans JLabel"); 
 
 // Ajout du JLabel jLabel1 au JPanel
 panel.add(jLabel1);

 // Cr�ation d'une ImageIcon � partir du fichier "book.gif"
 ImageIcon icon = new ImageIcon("facebook.gif");
 
 // Cr�ation d'un JLabel jLabel2 avec l'ic�ne charg�e
 JLabel jLabel2 = new JLabel(icon); 
 
 // Ajout du JLabel jLabel2 au JPanel
 panel.add(jLabel2);

 // Cr�ation d'un JLabel jLabel3 avec du texte, une ic�ne et un alignement sp�cifi�
 JLabel jLabel3 = new JLabel("Mon texte", icon, SwingConstants.LEFT); 
 // Ajout d'une couleur
 panel.setBackground(Color.red); 
 // Ajout du JLabel jLabel3 au JPanel
 panel.add(jLabel3);

 // Ajout du JPanel (contenant les JLabels) � la zone de contenu de la fen�tre
 f.getContentPane().add(panel);
 
 // Rendre la fen�tre visible � l'�cran
 f.setVisible(true);
}
}

