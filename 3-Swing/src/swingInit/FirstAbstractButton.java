package swingInit;

import javax.swing.*;
import java.awt.event.*;

//La classe FirstAbstractButton h�rite de JFrame, ce qui signifie qu'elle est une fen�tre Swing
public class FirstAbstractButton extends JFrame {

// Constructeur de la classe
public FirstAbstractButton() {
  // Appel du constructeur de la classe parent JFrame avec un titre pour la fen�tre
  super("titre de l'application");

  // Cr�ation d'un gestionnaire d'�v�nements de fermeture de fen�tre
  WindowListener l = new WindowAdapter() {
    public void windowClosing(WindowEvent e){
      // Lorsque la fen�tre se ferme, on quitte l'application en appelant System.exit(0)
      System.exit(0);
    }
  };
  // Ajout du gestionnaire d'�v�nements � la fen�tre
  addWindowListener(l);

  // Cr�ation d'images ImageIcon pour le bouton dans diff�rents �tats
  ImageIcon imageNormale = new ImageIcon("arrow.gif");
  ImageIcon imagePassage =  new ImageIcon("arrowr.gif");
  ImageIcon imageEnfoncee = new ImageIcon("arrowy.gif");

  // Cr�ation d'un JButton avec un texte et une image par d�faut
  JButton bouton = new JButton("Mon bouton", imageNormale);

  // D�finition de l'image � afficher lorsque le bouton est enfonc�
  bouton.setPressedIcon(imageEnfoncee);

  // D�finition de l'image � afficher lorsque la souris passe sur le bouton
  bouton.setRolloverIcon(imagePassage);

  // Activation de l'affichage de l'image en survol (rollover)
  bouton.setRolloverEnabled(true);

  // Ajout du bouton au contenu de la fen�tre, centr�
  getContentPane().add(bouton, "Center");

  // Cr�ation d'un JPanel (panneau) pour contenir le bouton
  JPanel panneau = new JPanel();
  panneau.add(bouton);

  // D�finition du contenu de la fen�tre pour �tre le panneau
  setContentPane(panneau);

  // D�finition de la taille de la fen�tre
  setSize(200, 100);

  // Rendre la fen�tre visible
  setVisible(true);
}

// Point d'entr�e du programme
public static void main(String [] args){
   // Cr�ation d'une instance de FirstAbstractButton, qui est �galement une JFrame
   JFrame frame = new FirstAbstractButton();
}
}


