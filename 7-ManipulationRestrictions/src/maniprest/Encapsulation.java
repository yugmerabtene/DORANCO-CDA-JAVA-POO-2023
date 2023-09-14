package maniprest;

//Classe avec encapsulation
public class Encapsulation {
 private double solde; // Variable privée pour le solde

 // Constructeur
 public Encapsulation(double soldeInitial) {
     solde = soldeInitial;
 }

 // Méthode pour obtenir le solde
 public double getSolde() {
     return solde;
 }

 // Méthode pour effectuer un dépôt
 public void deposer(double montant) {
     if (montant > 0) {
         solde += montant;
         System.out.println("Dépôt de " + montant + " effectué.");
     } else {
         System.out.println("Montant invalide.");
     }
 }

 // Méthode pour effectuer un retrait
 public void retirer(double montant) {
     if (montant > 0 && montant <= solde) {
         solde -= montant;
         System.out.println("Retrait de " + montant + " effectué.");
     } else {
         System.out.println("Montant invalide ou solde insuffisant.");
     }
 }

 public static void main(String[] args) {
     Encapsulation compte = new Encapsulation(1000.0);

     System.out.println("Solde actuel : " + compte.getSolde());

     compte.deposer(500.0);
     System.out.println("Nouveau solde après dépôt : " + compte.getSolde());

     compte.retirer(300.0);
     System.out.println("Nouveau solde après retrait : " + compte.getSolde());
 }
}

