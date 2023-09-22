package toString;

//D�finition d'une classe "Personne"
class Personne {
 private String nom;
 private int age;

 // Constructeur
 public Personne(String nom, int age) {
     this.nom = nom;
     this.age = age;
 }

 // Red�finition de la m�thode toString()
 @Override
 public String toString() {
     // La m�thode toString() renvoie une cha�ne de caract�res repr�sentant l'objet
     return "Personne [nom=" + nom + ", age=" + age + "]";
 }
}

public class ToString {
 public static void main(String[] args) {
     // Cr�ation d'un objet de type "Personne"
     Personne personne = new Personne("Alice", 30);

     // Utilisation de la m�thode toString() pour afficher l'objet
     System.out.println(personne.toString());

     // L'appel explicite � toString() n'est pas n�cessaire, car il est implicite lors de l'affichage
     System.out.println(personne);

     // Concat�nation de la cha�ne de caract�res renvoy�e par toString() avec d'autres cha�nes
     String infoPersonne = "Informations : " + personne.toString();
     System.out.println(infoPersonne);
 }
}

