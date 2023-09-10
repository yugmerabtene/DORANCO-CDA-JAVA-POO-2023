package animalsInterface;

//Classe Animal impl�mentant les interfaces Swim, Fly, Climb et Walk
public class Animal implements Swim, Fly, Climb, Walk {
    private String name;

    // Constructeur de la classe Animal
    public Animal(String name) {
        this.name = name;
    }

    // Impl�mentation de la m�thode swim() de l'interface Swim
    @Override
    public void swim() {
        System.out.println(name + " nage.");
    }

    // Impl�mentation de la m�thode fly() de l'interface Fly
    @Override
    public void fly() {
        System.out.println(name + " vole.");
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