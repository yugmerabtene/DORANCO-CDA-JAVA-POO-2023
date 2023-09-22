package swingInit;

import javax.swing.*;
import java.awt.event.*;

public class FirstEvent extends JFrame {

   public FirstEvent() {
     // Appel du constructeur de la classe parente JFrame avec un titre
     super("Titre de l'application");

     // Gestionnaire d'événement pour la fermeture de la fenêtre
     WindowListener windowListener = new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
           System.exit(0); // Ferme l'application lorsque la fenêtre est fermée
         }
      };
     addWindowListener(windowListener);

     // Création d'un bouton
     JButton bouton = new JButton("Mon bouton");

     // Création d'un panneau et ajout du bouton au panneau
     JPanel panneau = new JPanel();
     panneau.add(bouton);

     // Définition du contenu de la fenêtre avec le panneau
     setContentPane(panneau);

     // Définition des dimensions de la fenêtre
     setSize(200, 100);

     // Rendre la fenêtre visible
     setVisible(true);
   }

   public static void main(String[] args) {
      // Création d'une instance de FirstEvent (votre classe principale)
      JFrame frame = new FirstEvent();
   }
}
