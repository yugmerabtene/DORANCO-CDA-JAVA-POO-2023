package exceptions;

public class InitiExcep {

    public static void main(String[] args) {
        // Crée un tableau de trois éléments
        int[] tableau = new int[3];

        try {
            // Essaie d'accéder à un élément en dehors des limites du tableau
            int valeur = tableau[4]; // Cela générera une exception
            System.out.println("Cette ligne ne sera pas exécutée");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Attrape l'exception qui se produit
            System.out.println("Une exception s'est produite : " + e.getMessage());
        } finally {
            // Le bloc "finally" est exécuté quel que soit le résultat (exception ou non)
            System.out.println("Exécution du bloc 'finally'");
        }

        // Le programme continue à s'exécuter après la gestion de l'exception
        System.out.println("Le programme continue son exécution.");
    }
}
