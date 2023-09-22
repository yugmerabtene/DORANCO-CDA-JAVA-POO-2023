package swingInit;

import javax.swing.*;
import java.awt.event.*;

//La classe swing3 h�rite de JFrame, ce qui signifie qu'elle est une fen�tre Swing
public class FirstJbuttonClass extends JFrame {

// Constructeur de la classe
public FirstJbuttonClass() {
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

   // Cr�ation d'une ImageIcon � partir du fichier "tips.gif"
   ImageIcon img = new ImageIcon("facebook.gif");

   // Cr�ation d'un JButton avec le texte "Mon bouton" et l'image "tips.gif"
   JButton bouton = new JButton("Mon bouton", img);

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
   // Cr�ation d'une instance de swing3, qui est �galement une JFrame
   JFrame frame = new FirstJbuttonClass();
}
}

