package stringBuilder;

public class stringBuilderInit {
	public static void main(String[] args) {
        // �tape 1 : Cr�ation d'un objet StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // �tape 2 : Ajout de contenu
        stringBuilder.append("Hello, "); // Ajoute "Hello, "
        stringBuilder.append("world!"); // Ajoute "world!"

        // �tape 3 : Conversion en cha�ne de caract�res
        String finalString = stringBuilder.toString();

        // �tape 4 : Affichage de la cha�ne finale
        System.out.println(finalString); // Affiche "Hello, world!"
    }

}
