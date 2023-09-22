package toString;

//Définition d'une classe "Personne"
class Personne {
 private String nom;
 private int age;

 // Constructeur
 public Personne(String nom, int age) {
     this.nom = nom;
     this.age = age;
 }

 // Redéfinition de la méthode toString()
 @Override
 public String toString() {
     // La méthode toString() renvoie une chaîne de caractères représentant l'objet
     return "Personne [nom=" + nom + ", age=" + age + "]";
 }
}

public class ToString {
 public static void main(String[] args) {
     // Création d'un objet de type "Personne"
     Personne personne = new Personne("Alice", 30);

     // Utilisation de la méthode toString() pour afficher l'objet
     System.out.println(personne.toString());

     // L'appel explicite à toString() n'est pas nécessaire, car il est implicite lors de l'affichage
     System.out.println(personne);

     // Concaténation de la chaîne de caractères renvoyée par toString() avec d'autres chaînes
     String infoPersonne = "Informations : " + personne.toString();
     System.out.println(infoPersonne);
 }
}

