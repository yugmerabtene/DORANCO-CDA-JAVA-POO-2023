package shapesInheritance;

public class Rectangle extends GeometricShape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Redéfinition de la méthode pour obtenir le nom de la forme
    @Override
    public String getName() {
        return "Rectangle";
    }

    // Méthode pour calculer l'aire du rectangle
    public double calculateArea() {
        return width * height;
    }
}
