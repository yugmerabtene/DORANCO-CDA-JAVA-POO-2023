package animalsInterface;

//Classe d'animal suppl�mentaire impl�mentant Fly et Climb
public class FlyingSquirrel implements Fly, Climb, Walk {
 private String name;

 // Constructeur de la classe FlyingSquirrel
 public FlyingSquirrel(String name) {
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
        System.out.println(name + " Marche.");
    }


    // Impl�mentation de la m�thode climb() de l'interface Climb
 @Override
 public void climb() {

     System.out.println(name + " grimpe.");
 }
}


