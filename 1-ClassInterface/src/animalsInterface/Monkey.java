package animalsInterface;

//Classe d'animal suppl�mentaire impl�mentant Climb et Walk
public class Monkey implements Climb, Walk {
 private String name;

 // Constructeur de la classe Monkey
 public Monkey(String name) {
     this.name = name;
 }

 // Impl�mentation de la m�thode climb() de l'interface Climb
 @Override
 public void climb() {
     System.out.println(name + " grimpe.");
 }

 // Impl�mentation de la m�thode walk() de l'interface Walk
 @Override
 public void walk() {
     System.out.println(name + " marche.");
 }
}
