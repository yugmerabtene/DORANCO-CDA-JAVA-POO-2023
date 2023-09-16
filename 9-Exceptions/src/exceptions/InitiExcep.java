package exceptions;

public class InitiExcep {

    public static void main(String[] args) {
        // Cr�e un tableau de trois �l�ments
        int[] tableau = new int[3];

        try {
            // Essaie d'acc�der � un �l�ment en dehors des limites du tableau
            int valeur = tableau[4]; // Cela g�n�rera une exception
            System.out.println("Cette ligne ne sera pas ex�cut�e");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Attrape l'exception qui se produit
            System.out.println("Une exception s'est produite : " + e.getMessage());
        } finally {
            // Le bloc "finally" est ex�cut� quel que soit le r�sultat (exception ou non)
            System.out.println("Ex�cution du bloc 'finally'");
        }

        // Le programme continue � s'ex�cuter apr�s la gestion de l'exception
        System.out.println("Le programme continue son ex�cution.");
    }
}
