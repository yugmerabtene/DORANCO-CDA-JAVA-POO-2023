package maniprest;

//Classe avec encapsulation
public class Encapsulation {
 private double solde; // Variable priv�e pour le solde

 // Constructeur
 public Encapsulation(double soldeInitial) {
     solde = soldeInitial;
 }

 // M�thode pour obtenir le solde
 public double getSolde() {
     return solde;
 }

 // M�thode pour effectuer un d�p�t
 public void deposer(double montant) {
     if (montant > 0) {
         solde += montant;
         System.out.println("D�p�t de " + montant + " effectu�.");
     } else {
         System.out.println("Montant invalide.");
     }
 }

 // M�thode pour effectuer un retrait
 public void retirer(double montant) {
     if (montant > 0 && montant <= solde) {
         solde -= montant;
         System.out.println("Retrait de " + montant + " effectu�.");
     } else {
         System.out.println("Montant invalide ou solde insuffisant.");
     }
 }

 public static void main(String[] args) {
     Encapsulation compte = new Encapsulation(1000.0);

     System.out.println("Solde actuel : " + compte.getSolde());

     compte.deposer(500.0);
     System.out.println("Nouveau solde apr�s d�p�t : " + compte.getSolde());

     compte.retirer(300.0);
     System.out.println("Nouveau solde apr�s retrait : " + compte.getSolde());
 }
}

