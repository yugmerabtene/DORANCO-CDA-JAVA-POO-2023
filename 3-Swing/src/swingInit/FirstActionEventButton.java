package swingInit;


import javax.swing.*;
import java.awt.event.*;

public class FirstActionEventButton {

public static void main(String argv[]) {
 // Cr�ation d'une instance de JFrame (fen�tre Swing)
 JFrame f = new JFrame("ma fenetre");
 
 // D�finition de la taille de la fen�tre (300 pixels de largeur, 100 pixels de hauteur)
 f.setSize(300, 100);
 
 // Cr�ation d'un JPanel (panneau) pour contenir les composants
 JPanel panel = new JPanel(); 

 // Cr�ation d'un JButton (bouton) avec le texte "Bouton1"
 JButton bouton1 = new JButton("Bouton1");
 
 // Ajout d'un gestionnaire d'�v�nements ActionListener au bouton1
 bouton1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      // Lorsque le bouton1 est cliqu�, on quitte l'application en appelant System.exit(0)
      System.exit(0);
    }
 });

 // Ajout du bouton1 au JPanel
 panel.add(bouton1);
 
 // Ajout du JPanel (contenant le bouton1) � la zone de contenu de la fen�tre
 f.getContentPane().add(panel);
 
 // Rendre la fen�tre visible � l'�cran
 f.setVisible(true);
}
}

