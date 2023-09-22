package swingInit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FirstJTextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creer une nouvelle fenetre JFrame
		JFrame f = new JFrame("Fentre");
		
	// definir la taille de la fenetre 
		f.setSize(300,100);
		// creer un panneau 
		JPanel panel = new JPanel();
		// creer un champ de texte JTextField
		JTextField textField1 = new JTextField("mon texte");
		
		// Ajouter le champ de texte au panneau 
		panel.add(textField1);
		// ajouter le pannzau au contenu de la fenetre 
		f.getContentPane().add(panel);
		// Visibité de la fenetre 
		f.setVisible(true);	

	}

}
