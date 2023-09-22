package swingInit;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creation de notre fenetre 
		JFrame f = new JFrame("ma fentre");
		// definir la taille 
		f.setSize(300, 300);
		// creer un panel panneau
		JPanel panel = new JPanel();		
		// creer une Checkbox
		JCheckBox button1 = new JCheckBox("Button1");
		// ajouter la premiere case a cocher au panneau 
		panel.add(button1);
		// ajouter le panneau au contenu de la JFrame
		f.getContentPane().add(panel);
		// Rendre la fentere visible
		f.setVisible(true);

	}

}
