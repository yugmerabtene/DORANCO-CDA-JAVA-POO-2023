package animalsInterface;

//Classe d'animal supplémentaire implémentant Climb et Walk
public class Monkey implements Climb, Walk {
 private String name;

 // Constructeur de la classe Monkey
 public Monkey(String name) {
     this.name = name;
 }

 // Implémentation de la méthode climb() de l'interface Climb
 @Override
 public void climb() {
     System.out.println(name + " grimpe.");
 }

 // Implémentation de la méthode walk() de l'interface Walk
 @Override
 public void walk() {
     System.out.println(name + " marche.");
 }
}
