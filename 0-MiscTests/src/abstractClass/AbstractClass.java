package abstractClass;



//D�finition de la classe abstraite "Forme"
abstract class Forme {
// Attributs
protected String couleur;

// Constructeur
public Forme(String couleur) {
   this.couleur = couleur;
}

// M�thode abstraite pour calculer la surface (doit �tre impl�ment�e dans les classes d�riv�es)
public abstract double calculerSurface();
}

//Classe d�riv�e "Cercle" qui �tend la classe abstraite "Forme"
class Cercle extends Forme {
// Attribut sp�cifique � la classe Cercle
private double rayon;

// Constructeur
public Cercle(String couleur, double rayon) {
   super(couleur);
   this.rayon = rayon;
}

// Impl�mentation de la m�thode abstraite pour calculer la surface d'un cercle
@Override
public double calculerSurface() {
   return Math.PI * Math.pow(rayon, 2);
}
}

//Classe d�riv�e "Rectangle" qui �tend la classe abstraite "Forme"
class Rectangle extends Forme {
// Attributs sp�cifiques � la classe Rectangle
private double longueur;
private double largeur;

// Constructeur
public Rectangle(String couleur, double longueur, double largeur) {
   super(couleur);
   this.longueur = longueur;
   this.largeur = largeur;
}

// Impl�mentation de la m�thode abstraite pour calculer la surface d'un rectangle
@Override
public double calculerSurface() {
   return longueur * largeur;
}
}

public class AbstractClass {
public static void main(String[] args) {
   // Cr�ation d'objets de type "Cercle" et "Rectangle"
   Cercle cercle = new Cercle("Rouge", 5.0);
   Rectangle rectangle = new Rectangle("Bleu", 4.0, 6.0);

   // Appel de la m�thode "calculerSurface()" pour chaque objet
   System.out.println("Surface du cercle : " + cercle.calculerSurface());
   System.out.println("Surface du rectangle : " + rectangle.calculerSurface());
}
}

