package shapesInterface;

//Classe Rectangle implémentant GeometricShape :
public class Rectangle implements GeometricShape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

