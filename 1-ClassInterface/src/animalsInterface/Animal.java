package animalsInterface;

//Classe Animal implémentant les interfaces Swim, Fly, Climb et Walk
public class Animal implements Swim, Fly, Climb, Walk {
    private String name;

    // Constructeur de la classe Animal
    public Animal(String name) {
        this.name = name;
    }

    // Implémentation de la méthode swim() de l'interface Swim
    @Override
    public void swim() {
        System.out.println(name + " nage.");
    }

    // Implémentation de la méthode fly() de l'interface Fly
    @Override
    public void fly() {
        System.out.println(name + " vole.");
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