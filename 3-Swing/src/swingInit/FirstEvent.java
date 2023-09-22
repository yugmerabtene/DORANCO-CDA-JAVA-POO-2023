package swingInit;

import javax.swing.*;
import java.awt.event.*;

public class FirstEvent extends JFrame {

   public FirstEvent() {
     // Appel du constructeur de la classe parente JFrame avec un titre
     super("Titre de l'application");

     // Gestionnaire d'�v�nement pour la fermeture de la fen�tre
     WindowListener windowListener = new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
           System.exit(0); // Ferme l'application lorsque la fen�tre est ferm�e
         }
      };
     addWindowListener(windowListener);

     // Cr�ation d'un bouton
     JButton bouton = new JButton("Mon bouton");

     // Cr�ation d'un panneau et ajout du bouton au panneau
     JPanel panneau = new JPanel();
     panneau.add(bouton);

     // D�finition du contenu de la fen�tre avec le panneau
     setContentPane(panneau);

     // D�finition des dimensions de la fen�tre
     setSize(200, 100);

     // Rendre la fen�tre visible
     setVisible(true);
   }

   public static void main(String[] args) {
      // Cr�ation d'une instance de FirstEvent (votre classe principale)
      JFrame frame = new FirstEvent();
   }
}
