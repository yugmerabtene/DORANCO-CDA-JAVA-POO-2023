package swingInit;


import javax.swing.*;
import java.awt.event.*;

public class FirstActionEventButton {

public static void main(String argv[]) {
 // Création d'une instance de JFrame (fenêtre Swing)
 JFrame f = new JFrame("ma fenetre");
 
 // Définition de la taille de la fenêtre (300 pixels de largeur, 100 pixels de hauteur)
 f.setSize(300, 100);
 
 // Création d'un JPanel (panneau) pour contenir les composants
 JPanel panel = new JPanel(); 

 // Création d'un JButton (bouton) avec le texte "Bouton1"
 JButton bouton1 = new JButton("Bouton1");
 
 // Ajout d'un gestionnaire d'événements ActionListener au bouton1
 bouton1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      // Lorsque le bouton1 est cliqué, on quitte l'application en appelant System.exit(0)
      System.exit(0);
    }
 });

 // Ajout du bouton1 au JPanel
 panel.add(bouton1);
 
 // Ajout du JPanel (contenant le bouton1) à la zone de contenu de la fenêtre
 f.getContentPane().add(panel);
 
 // Rendre la fenêtre visible à l'écran
 f.setVisible(true);
}
}

