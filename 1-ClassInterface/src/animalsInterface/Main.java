package animalsInterface;

//Classe principale Main
public class Main {
 public static void main(String[] args) {
     // Cr�ation d'une instance d'Animal (Canard)
     Animal duck = new Animal("Canard");
     
     // Appel de la m�thode swim() de l'interface Swim
     duck.swim();
     
     // Appel de la m�thode fly() de l'interface Fly
     duck.fly();
     
     // Appel de la m�thode climb() de l'interface Climb
     duck.climb();
     
     // Appel de la m�thode walk() de l'interface Walk
     duck.walk();

     // Cr�ation d'une instance de Monkey (Singe)
     Monkey monkey = new Monkey("Singe");
     
     // Appel de la m�thode climb() de l'interface Climb (impl�ment�e par Monkey)
     monkey.climb();
     
     // Appel de la m�thode walk() de l'interface Walk (impl�ment�e par Monkey)
     monkey.walk();

     // Cr�ation d'une instance de Bird (Oiseau)
     Bird bird = new Bird("Oiseau");
     
     // Appel de la m�thode fly() de l'interface Fly
     bird.fly();
     
     // Appel de la m�thode walk() de l'interface Walk (impl�ment�e par Bird)
     bird.walk();

     // Cr�ation d'une instance d'Elephant (�l�phant)
     Elephant elephant = new Elephant("�l�phant");
     
     // Appel de la m�thode walk() de l'interface Walk (impl�ment�e par Elephant)
     elephant.walk();

     // Cr�ation d'une instance de FlyingSquirrel (�cureuil volant)
     FlyingSquirrel squirrel = new FlyingSquirrel("�cureuil volant");
     
     // Appel de la m�thode fly() de l'interface Fly (impl�ment�e par FlyingSquirrel)
     squirrel.fly();
     
     // Appel de la m�thode climb() de l'interface Climb (impl�ment�e par FlyingSquirrel)
     squirrel.climb();
     // Appel de la m�thode climb() de l'interface Climb (impl�ment�e par FlyingSquirrel)
     squirrel.walk();
 }
}


