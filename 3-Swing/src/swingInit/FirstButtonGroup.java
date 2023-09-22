package swingInit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FirstButtonGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creer une nouvelle JFRAME 
		JFrame f = new JFrame("Ma fentre");
		// Definir la taille 
		f.setSize(300, 400);
		// Panneau pour contenir tout les elements 
		JPanel panel = new JPanel();
		// Creer un groupe de boutton 
		ButtonGroup group = new ButtonGroup();
		// Boutton radio
		JRadioButton bouton1 = new JRadioButton("Button 1");
		//  ajout du premier boutton radio au groupe  de boutons
		
		group.add(bouton1);
		// ajouter le premier bouton radio au panneau
		panel.add(bouton1);
		
		// ajout du panneau dans la JFrame fenetre 
		f.getContentPane().add(panel);
		
	// rendre la fentre visible 
		f.setVisible(true);

		

	}

}
