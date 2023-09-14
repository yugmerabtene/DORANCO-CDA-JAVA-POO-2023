package maniprest;

public class InitModificateurs {
    public int variablePublique; // Variable publique
    private int variablePrivee; // Variable priv�e
    protected int variableProtegee; // Variable prot�g�e

    // Constructeur par d�faut
    public InitModificateurs() {
        variablePublique = 1;
        variablePrivee = 2;
        variableProtegee = 3;
    }

    // M�thode publique
    public void methodePublique() {
        System.out.println("M�thode publique");
    }

    // M�thode priv�e
    private void methodePrivee() {
        System.out.println("M�thode priv�e");
    }

    // M�thode prot�g�e
    protected void methodeProtegee() {
        System.out.println("M�thode prot�g�e");
    }

    // M�thode par d�faut (package-private)
    void methodeParDefaut() {
        System.out.println("M�thode par d�faut (package-private)");
    }

    public static void main(String[] args) {
        InitModificateurs exemple = new InitModificateurs();

        System.out.println(exemple.variablePublique); // OK, accessible depuis n'importe o�
        // System.out.println(exemple.variablePrivee); // Erreur de compilation, inaccessible depuis d'autres classes
        System.out.println(exemple.variableProtegee);  // OK, accessible depuis des sous-classes
        exemple.methodePublique(); // OK, accessible depuis n'importe o�
        // exemple.methodePrivee(); // Erreur de compilation, inaccessible depuis d'autres classes
        exemple.methodeProtegee();  // OK, accessible depuis des sous-classes
        exemple.methodeParDefaut(); // OK, accessible depuis le m�me package
    }
}
