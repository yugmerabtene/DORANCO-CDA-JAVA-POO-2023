package swingInit;

import javax.swing.*;
import java.awt.event.*;

//La classe FirstAbstractButton hérite de JFrame, ce qui signifie qu'elle est une fenêtre Swing
public class FirstAbstractButton extends JFrame {

// Constructeur de la classe
public FirstAbstractButton() {
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

  // Création d'images ImageIcon pour le bouton dans différents états
  ImageIcon imageNormale = new ImageIcon("arrow.gif");
  ImageIcon imagePassage =  new ImageIcon("arrowr.gif");
  ImageIcon imageEnfoncee = new ImageIcon("arrowy.gif");

  // Création d'un JButton avec un texte et une image par défaut
  JButton bouton = new JButton("Mon bouton", imageNormale);

  // Définition de l'image à afficher lorsque le bouton est enfoncé
  bouton.setPressedIcon(imageEnfoncee);

  // Définition de l'image à afficher lorsque la souris passe sur le bouton
  bouton.setRolloverIcon(imagePassage);

  // Activation de l'affichage de l'image en survol (rollover)
  bouton.setRolloverEnabled(true);

  // Ajout du bouton au contenu de la fenêtre, centré
  getContentPane().add(bouton, "Center");

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
   // Création d'une instance de FirstAbstractButton, qui est également une JFrame
   JFrame frame = new FirstAbstractButton();
}
}


