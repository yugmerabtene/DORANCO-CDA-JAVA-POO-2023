package swingInit;

import javax.swing.*;

public class FirstWindow {
    public static void main(String[] args) {
        // Crée une nouvelle fenêtre JFrame
        JFrame frame = new JFrame("Ma première application Swing");
        
        // Définit la taille de la fenêtre
        frame.setSize(400, 300);
        
        // Permet de fermer la fenêtre lorsqu'on clique sur la croix
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crée un label avec du texte
        JLabel label = new JLabel("Bonjour, Swing !");
        
        // Ajoute le label à la fenêtre
        frame.add(label);
        
        // Affiche la fenêtre
        frame.setVisible(true);
    }
}
