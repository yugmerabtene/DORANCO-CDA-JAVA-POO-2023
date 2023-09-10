package stringBuilder;

public class stringBuilderInit {
	public static void main(String[] args) {
        // Étape 1 : Création d'un objet StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // Étape 2 : Ajout de contenu
        stringBuilder.append("Hello, "); // Ajoute "Hello, "
        stringBuilder.append("world!"); // Ajoute "world!"

        // Étape 3 : Conversion en chaîne de caractères
        String finalString = stringBuilder.toString();

        // Étape 4 : Affichage de la chaîne finale
        System.out.println(finalString); // Affiche "Hello, world!"
    }

}
