package shapesInterface;

// Classe Circle implémentant GeometricShape :
public class Circle implements GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Cercle";
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
