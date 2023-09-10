package animalsInterface;

//Classe d'animal suppl�mentaire impl�mentant Fly et Walk
public class Bird implements Fly, Walk {
 private String name;

 // Constructeur de la classe Bird
 public Bird(String name) {
     this.name = name;
 }

 // Impl�mentation de la m�thode fly() de l'interface Fly
 @Override
 public void fly() {
     System.out.println(name + " vole.");
 }

 // Impl�mentation de la m�thode walk() de l'interface Walk
 @Override
 public void walk() {
     System.out.println(name + " marche.");
 }
}

