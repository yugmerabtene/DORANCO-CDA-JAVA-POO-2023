package arrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListInit {
    public static void main(String[] args) {
        // Étape 1 : Crée une liste pour stocker des capitales sous forme de chaînes de caractères
        List<String> capitalList = new ArrayList<>();

        // Étape 2 : Ajoute des capitales à la liste sous forme de chaînes de caractères
        capitalList.add("England:London");
        capitalList.add("Germany:Berlin");
        capitalList.add("Norway:Oslo");
        capitalList.add("USA:Washington DC");

        // Étape 3 : Accède à la capitale de l'Angleterre dans la liste en utilisant la méthode get()
        String cityOfEngland = null;
        for (String capital : capitalList) {
            String[] keyValue = capital.split(":"); // Divise la capitale en pays et ville
            if (keyValue.length == 2 && keyValue[0].equals("England")) {
                cityOfEngland = keyValue[1];
                break;
            }
        }
        System.out.println("La capitale de l'Angleterre est " + cityOfEngland);

        // Étape 4 : Supprime la capitale de l'Angleterre de la liste
        capitalList.remove("England:London");
        System.out.println("Après suppression de l'Angleterre : " + capitalList);

        // Étape 5 : Obtient le nombre de capitales dans la liste en utilisant la méthode size()
        int nombreDeCapitales = capitalList.size();
        System.out.println("Nombre de capitales : " + nombreDeCapitales);

        // Étape 6 : Parcours la liste avec une boucle for-each en imprimant les noms des pays
        System.out.println("Liste des pays dans la liste :");
        for (String capital : capitalList) {
            String[] keyValue = capital.split(":");
            if (keyValue.length == 2) {
                System.out.println(keyValue[0]);
            }
        }
    }
}
