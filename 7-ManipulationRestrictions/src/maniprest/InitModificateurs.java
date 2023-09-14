package maniprest;

public class InitModificateurs {
    public int variablePublique; // Variable publique
    private int variablePrivee; // Variable privée
    protected int variableProtegee; // Variable protégée

    // Constructeur par défaut
    public InitModificateurs() {
        variablePublique = 1;
        variablePrivee = 2;
        variableProtegee = 3;
    }

    // Méthode publique
    public void methodePublique() {
        System.out.println("Méthode publique");
    }

    // Méthode privée
    private void methodePrivee() {
        System.out.println("Méthode privée");
    }

    // Méthode protégée
    protected void methodeProtegee() {
        System.out.println("Méthode protégée");
    }

    // Méthode par défaut (package-private)
    void methodeParDefaut() {
        System.out.println("Méthode par défaut (package-private)");
    }

    public static void main(String[] args) {
        InitModificateurs exemple = new InitModificateurs();

        System.out.println(exemple.variablePublique); // OK, accessible depuis n'importe où
        // System.out.println(exemple.variablePrivee); // Erreur de compilation, inaccessible depuis d'autres classes
        System.out.println(exemple.variableProtegee);  // OK, accessible depuis des sous-classes
        exemple.methodePublique(); // OK, accessible depuis n'importe où
        // exemple.methodePrivee(); // Erreur de compilation, inaccessible depuis d'autres classes
        exemple.methodeProtegee();  // OK, accessible depuis des sous-classes
        exemple.methodeParDefaut(); // OK, accessible depuis le même package
    }
}
