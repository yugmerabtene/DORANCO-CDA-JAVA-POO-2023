package animalsInterface;

//Classe d'animal supplémentaire implémentant Walk
public class Elephant implements Walk {
 private String name;

 // Constructeur de la classe Elephant
 public Elephant(String name) {
     this.name = name;
 }

 // Implémentation de la méthode walk() de l'interface Walk
 @Override
 public void walk() {
     System.out.println(name + " marche.");
 }
}
