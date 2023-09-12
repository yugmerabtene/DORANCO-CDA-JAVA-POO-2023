package stringBuilder;

public class stringBuilderInit {
    public static void main(String[] args) {
        // Utilisation de String (inefficace)
        String concatString = ""; // Cr�e une cha�ne vide pour la concat�nation ult�rieure

        // Commencez par String
        long startTimeString = System.nanoTime(); // Enregistre l'heure de d�but de l'op�ration avec String

        for (int i = 0; i < 10000; i++) {
            concatString += "some text"; // Concat�nation de cha�nes avec l'op�rateur '+' (inefficace) dans une boucle
        }

        long endTimeString = System.nanoTime(); // Enregistre l'heure de fin de l'op�ration avec String
        long durationWithString = endTimeString - startTimeString; // Calcule la dur�e de l'op�ration

        System.out.println("Utilisation de String (inefficace) :");
        System.out.println("Avec String : " + durationWithString + " nanosecondes"); // Affiche la dur�e de l'op�ration

        // Utilisation de StringBuilder (efficace)
        StringBuilder stringBuilder = new StringBuilder(); // Cr�e un objet StringBuilder pour la concat�nation efficace

        // Commencez par StringBuilder
        long startTimeStringBuilder = System.nanoTime(); // Enregistre l'heure de d�but de l'op�ration avec StringBuilder

        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("some text"); // Utilisation de StringBuilder dans une boucle
        }

        long endTimeStringBuilder = System.nanoTime(); // Enregistre l'heure de fin de l'op�ration avec StringBuilder
        long durationWithStringBuilder = endTimeStringBuilder - startTimeStringBuilder; // Calcule la dur�e de l'op�ration

        System.out.println("\nUtilisation de StringBuilder (efficace) :");
        
        System.out.println("Avec StringBuilder : " + durationWithStringBuilder + " nanosecondes"); 
        
    }
}
