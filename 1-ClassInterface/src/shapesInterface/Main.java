package shapesInterface;

public class Main {
    public static void main(String[] args) {
        GeometricShape circle = new Circle(5.0);
        System.out.println(circle.getName() + " - Aire : " + circle.calculateArea());

        GeometricShape rectangle = new Rectangle(4.0, 6.0);
        System.out.println(rectangle.getName() + " - Aire : " + rectangle.calculateArea());
    }
}
