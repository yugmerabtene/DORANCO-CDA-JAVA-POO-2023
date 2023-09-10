package arrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListInit {
    public static void main(String[] args) {
        // �tape 1 : Cr�e une liste pour stocker des capitales sous forme de cha�nes de caract�res
        List<String> capitalList = new ArrayList<>();

        // �tape 2 : Ajoute des capitales � la liste sous forme de cha�nes de caract�res
        capitalList.add("England:London");
        capitalList.add("Germany:Berlin");
        capitalList.add("Norway:Oslo");
        capitalList.add("USA:Washington DC");

        // �tape 3 : Acc�de � la capitale de l'Angleterre dans la liste en utilisant la m�thode get()
        String cityOfEngland = null;
        for (String capital : capitalList) {
            String[] keyValue = capital.split(":"); // Divise la capitale en pays et ville
            if (keyValue.length == 2 && keyValue[0].equals("England")) {
                cityOfEngland = keyValue[1];
                break;
            }
        }
        System.out.println("La capitale de l'Angleterre est " + cityOfEngland);

        // �tape 4 : Supprime la capitale de l'Angleterre de la liste
        capitalList.remove("England:London");
        System.out.println("Apr�s suppression de l'Angleterre : " + capitalList);

        // �tape 5 : Obtient le nombre de capitales dans la liste en utilisant la m�thode size()
        int nombreDeCapitales = capitalList.size();
        System.out.println("Nombre de capitales : " + nombreDeCapitales);

        // �tape 6 : Parcours la liste avec une boucle for-each en imprimant les noms des pays
        System.out.println("Liste des pays dans la liste :");
        for (String capital : capitalList) {
            String[] keyValue = capital.split(":");
            if (keyValue.length == 2) {
                System.out.println(keyValue[0]);
            }
        }
    }
}
