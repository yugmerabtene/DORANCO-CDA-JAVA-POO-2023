package animalsInterface;

//Classe d'animal supplémentaire implémentant Fly et Walk
public class Bird implements Fly, Walk {
 private String name;

 // Constructeur de la classe Bird
 public Bird(String name) {
     this.name = name;
 }

 // Implémentation de la méthode fly() de l'interface Fly
 @Override
 public void fly() {
     System.out.println(name + " vole.");
 }

 // Implémentation de la méthode walk() de l'interface Walk
 @Override
 public void walk() {
     System.out.println(name + " marche.");
 }
}

