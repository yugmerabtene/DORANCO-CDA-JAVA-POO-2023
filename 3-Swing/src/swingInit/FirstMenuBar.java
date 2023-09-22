package swingInit;

import javax.swing.*;

public class FirstMenuBar {

  public static void main(String argv[]) {

    // Création de la fenêtre JFrame
    JFrame f = new JFrame("ma fenetre");
    f.setSize(300, 100);

    // Création du bouton "Mon bouton"
    JButton b = new JButton("Mon bouton");

    // Ajout du bouton au contenu de la fenêtre
    f.getContentPane().add(b);

    // Création de la barre de menu
    JMenuBar menuBar = new JMenuBar();

    // Définition de la barre de menu de la fenêtre
    f.setJMenuBar(menuBar);

    // Création d'un menu "Fichier"
    JMenu menu = new JMenu("Fichier");

    // Ajout d'un élément de menu (menuItem) au menu (c'est manquant dans le code original)
    // Exemple :
    JMenuItem menuItem = new JMenuItem("Ouvrir");
    menu.add(menuItem);

    // Ajout du menu à la barre de menu
    menuBar.add(menu);

    // Rendre la fenêtre visible
    f.setVisible(true);
  }
}

