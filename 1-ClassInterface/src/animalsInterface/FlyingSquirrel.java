package animalsInterface;

//Classe d'animal supplémentaire implémentant Fly et Climb
public class FlyingSquirrel implements Fly, Climb, Walk {
 private String name;

 // Constructeur de la classe FlyingSquirrel
 public FlyingSquirrel(String name) {
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
        System.out.println(name + " Marche.");
    }


    // Implémentation de la méthode climb() de l'interface Climb
 @Override
 public void climb() {

     System.out.println(name + " grimpe.");
 }
}


