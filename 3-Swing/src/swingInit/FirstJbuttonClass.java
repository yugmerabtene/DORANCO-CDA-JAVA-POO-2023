package swingInit;

import javax.swing.*;
import java.awt.event.*;

//La classe swing3 hérite de JFrame, ce qui signifie qu'elle est une fenêtre Swing
public class FirstJbuttonClass extends JFrame {

// Constructeur de la classe
public FirstJbuttonClass() {
   // Appel du constructeur de la classe parent JFrame avec un titre pour la fenêtre
   super("titre de l'application");

   // Création d'un gestionnaire d'événements de fermeture de fenêtre
   WindowListener l = new WindowAdapter() {
      public void windowClosing(WindowEvent e){
         // Lorsque la fenêtre se ferme, on quitte l'application en appelant System.exit(0)
         System.exit(0);
      }
   };
   // Ajout du gestionnaire d'événements à la fenêtre
   addWindowListener(l);

   // Création d'une ImageIcon à partir du fichier "tips.gif"
   ImageIcon img = new ImageIcon("facebook.gif");

   // Création d'un JButton avec le texte "Mon bouton" et l'image "tips.gif"
   JButton bouton = new JButton("Mon bouton", img);

   // Création d'un JPanel (panneau) pour contenir le bouton
   JPanel panneau = new JPanel();
   panneau.add(bouton);

   // Définition du contenu de la fenêtre pour être le panneau
   setContentPane(panneau);

   // Définition de la taille de la fenêtre
   setSize(200, 100);

   // Rendre la fenêtre visible
   setVisible(true);
}

// Point d'entrée du programme
public static void main(String [] args){
   // Création d'une instance de swing3, qui est également une JFrame
   JFrame frame = new FirstJbuttonClass();
}
}

