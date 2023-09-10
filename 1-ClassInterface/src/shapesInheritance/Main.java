package shapesInheritance;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.getName() + " - Aire : " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println(rectangle.getName() + " - Aire : " + rectangle.calculateArea());
    }
}

