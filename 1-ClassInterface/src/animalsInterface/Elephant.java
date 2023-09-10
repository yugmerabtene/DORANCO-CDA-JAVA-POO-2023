package animalsInterface;

//Classe d'animal suppl�mentaire impl�mentant Walk
public class Elephant implements Walk {
 private String name;

 // Constructeur de la classe Elephant
 public Elephant(String name) {
     this.name = name;
 }

 // Impl�mentation de la m�thode walk() de l'interface Walk
 @Override
 public void walk() {
     System.out.println(name + " marche.");
 }
}
