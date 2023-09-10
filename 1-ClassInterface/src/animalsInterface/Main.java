package animalsInterface;

//Classe principale Main
public class Main {
 public static void main(String[] args) {
     // Création d'une instance d'Animal (Canard)
     Animal duck = new Animal("Canard");
     
     // Appel de la méthode swim() de l'interface Swim
     duck.swim();
     
     // Appel de la méthode fly() de l'interface Fly
     duck.fly();
     
     // Appel de la méthode climb() de l'interface Climb
     duck.climb();
     
     // Appel de la méthode walk() de l'interface Walk
     duck.walk();

     // Création d'une instance de Monkey (Singe)
     Monkey monkey = new Monkey("Singe");
     
     // Appel de la méthode climb() de l'interface Climb (implémentée par Monkey)
     monkey.climb();
     
     // Appel de la méthode walk() de l'interface Walk (implémentée par Monkey)
     monkey.walk();

     // Création d'une instance de Bird (Oiseau)
     Bird bird = new Bird("Oiseau");
     
     // Appel de la méthode fly() de l'interface Fly
     bird.fly();
     
     // Appel de la méthode walk() de l'interface Walk (implémentée par Bird)
     bird.walk();

     // Création d'une instance d'Elephant (Éléphant)
     Elephant elephant = new Elephant("Éléphant");
     
     // Appel de la méthode walk() de l'interface Walk (implémentée par Elephant)
     elephant.walk();

     // Création d'une instance de FlyingSquirrel (Écureuil volant)
     FlyingSquirrel squirrel = new FlyingSquirrel("Écureuil volant");
     
     // Appel de la méthode fly() de l'interface Fly (implémentée par FlyingSquirrel)
     squirrel.fly();
     
     // Appel de la méthode climb() de l'interface Climb (implémentée par FlyingSquirrel)
     squirrel.climb();
     // Appel de la méthode climb() de l'interface Climb (implémentée par FlyingSquirrel)
     squirrel.walk();
 }
}


