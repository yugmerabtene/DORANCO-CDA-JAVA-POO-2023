package swingInit;

import javax.swing.*;

public class FirstMenuBar {

  public static void main(String argv[]) {

    // Cr�ation de la fen�tre JFrame
    JFrame f = new JFrame("ma fenetre");
    f.setSize(300, 100);

    // Cr�ation du bouton "Mon bouton"
    JButton b = new JButton("Mon bouton");

    // Ajout du bouton au contenu de la fen�tre
    f.getContentPane().add(b);

    // Cr�ation de la barre de menu
    JMenuBar menuBar = new JMenuBar();

    // D�finition de la barre de menu de la fen�tre
    f.setJMenuBar(menuBar);

    // Cr�ation d'un menu "Fichier"
    JMenu menu = new JMenu("Fichier");

    // Ajout d'un �l�ment de menu (menuItem) au menu (c'est manquant dans le code original)
    // Exemple :
    JMenuItem menuItem = new JMenuItem("Ouvrir");
    menu.add(menuItem);

    // Ajout du menu � la barre de menu
    menuBar.add(menu);

    // Rendre la fen�tre visible
    f.setVisible(true);
  }
}

