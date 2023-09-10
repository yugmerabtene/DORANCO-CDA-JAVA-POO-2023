package swingInit;

import javax.swing.*;

public class FirstWindow {
    public static void main(String[] args) {
        // Cr�e une nouvelle fen�tre JFrame
        JFrame frame = new JFrame("Ma premi�re application Swing");
        
        // D�finit la taille de la fen�tre
        frame.setSize(400, 300);
        
        // Permet de fermer la fen�tre lorsqu'on clique sur la croix
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Cr�e un label avec du texte
        JLabel label = new JLabel("Bonjour, Swing !");
        
        // Ajoute le label � la fen�tre
        frame.add(label);
        
        // Affiche la fen�tre
        frame.setVisible(true);
    }
}
