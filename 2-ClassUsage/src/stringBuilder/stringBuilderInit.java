package stringBuilder;

public class stringBuilderInit {
    public static void main(String[] args) {
        // Utilisation de String (inefficace)
        String concatString = ""; // Crée une chaîne vide pour la concaténation ultérieure

        // Commencez par String
        long startTimeString = System.nanoTime(); // Enregistre l'heure de début de l'opération avec String

        for (int i = 0; i < 10000; i++) {
            concatString += "some text"; // Concaténation de chaînes avec l'opérateur '+' (inefficace) dans une boucle
        }

        long endTimeString = System.nanoTime(); // Enregistre l'heure de fin de l'opération avec String
        long durationWithString = endTimeString - startTimeString; // Calcule la durée de l'opération

        System.out.println("Utilisation de String (inefficace) :");
        System.out.println("Avec String : " + durationWithString + " nanosecondes"); // Affiche la durée de l'opération

        // Utilisation de StringBuilder (efficace)
        StringBuilder stringBuilder = new StringBuilder(); // Crée un objet StringBuilder pour la concaténation efficace

        // Commencez par StringBuilder
        long startTimeStringBuilder = System.nanoTime(); // Enregistre l'heure de début de l'opération avec StringBuilder

        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("some text"); // Utilisation de StringBuilder dans une boucle
        }

        long endTimeStringBuilder = System.nanoTime(); // Enregistre l'heure de fin de l'opération avec StringBuilder
        long durationWithStringBuilder = endTimeStringBuilder - startTimeStringBuilder; // Calcule la durée de l'opération

        System.out.println("\nUtilisation de StringBuilder (efficace) :");
        
        System.out.println("Avec StringBuilder : " + durationWithStringBuilder + " nanosecondes"); 
        
    }
}
