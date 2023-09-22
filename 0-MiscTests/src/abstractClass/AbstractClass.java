package abstractClass;



//Définition de la classe abstraite "Forme"
abstract class Forme {
// Attributs
protected String couleur;

// Constructeur
public Forme(String couleur) {
   this.couleur = couleur;
}

// Méthode abstraite pour calculer la surface (doit être implémentée dans les classes dérivées)
public abstract double calculerSurface();
}

//Classe dérivée "Cercle" qui étend la classe abstraite "Forme"
class Cercle extends Forme {
// Attribut spécifique à la classe Cercle
private double rayon;

// Constructeur
public Cercle(String couleur, double rayon) {
   super(couleur);
   this.rayon = rayon;
}

// Implémentation de la méthode abstraite pour calculer la surface d'un cercle
@Override
public double calculerSurface() {
   return Math.PI * Math.pow(rayon, 2);
}
}

//Classe dérivée "Rectangle" qui étend la classe abstraite "Forme"
class Rectangle extends Forme {
// Attributs spécifiques à la classe Rectangle
private double longueur;
private double largeur;

// Constructeur
public Rectangle(String couleur, double longueur, double largeur) {
   super(couleur);
   this.longueur = longueur;
   this.largeur = largeur;
}

// Implémentation de la méthode abstraite pour calculer la surface d'un rectangle
@Override
public double calculerSurface() {
   return longueur * largeur;
}
}

public class AbstractClass {
public static void main(String[] args) {
   // Création d'objets de type "Cercle" et "Rectangle"
   Cercle cercle = new Cercle("Rouge", 5.0);
   Rectangle rectangle = new Rectangle("Bleu", 4.0, 6.0);

   // Appel de la méthode "calculerSurface()" pour chaque objet
   System.out.println("Surface du cercle : " + cercle.calculerSurface());
   System.out.println("Surface du rectangle : " + rectangle.calculerSurface());
}
}

