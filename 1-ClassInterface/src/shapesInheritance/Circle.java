package shapesInheritance;

public class Circle extends GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Redéfinition de la méthode pour obtenir le nom de la forme
    @Override
    public String getName() {
        return "Cercle";
    }

    // Méthode pour calculer l'aire du cercle
    /* 
     * return Math.PI * radius * radius; calcule 
     * l'aire d'un cercle en utilisant la formule mathématique π * r², où π (pi) 
     **/
    public double calculateArea() {
        return Math.PI * radius * radius; 
    }
}
