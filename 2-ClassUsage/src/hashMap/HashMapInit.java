package hashMap;
import java.util.HashMap; // Importe la classe HashMap

public class HashMapInit {
    public static void main(String[] args) {
        // �tape 1 : Cr�e un objet HashMap pour stocker des paires cl�/valeur avec des cha�nes de caract�res comme cl�s et valeurs
        HashMap<String, String> capitalCities = new HashMap<>();

        // �tape 2 : Ajoute des paires cl�/valeur � la HashMap en utilisant la m�thode put()
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // �tape 3 : Acc�de � une valeur dans la HashMap en utilisant la m�thode get() et la cl�
        String cityOfEngland = capitalCities.get("England");
        System.out.println("La capitale de l'Angleterre est " + cityOfEngland);

        // �tape 4 : Supprime une paire cl�/valeur en utilisant la m�thode remove() et la cl�
        capitalCities.remove("England");
        System.out.println("Apr�s suppression de l'Angleterre : " + capitalCities);

        // �tape 5 : Obtient la taille de la HashMap en utilisant la m�thode size()
        int taille = capitalCities.size();
        System.out.println("Nombre de capitales : " + taille);

        // �tape 6 : Parcours la HashMap avec une boucle for-each en imprimant les cl�s
        System.out.println("Liste des pays dans la HashMap :");
        for (String pays : capitalCities.keySet()) {
            System.out.println(pays);
        }

        // �tape 7 : Parcours la HashMap avec une boucle for-each en imprimant les valeurs
        System.out.println("Liste des capitales dans la HashMap :");
        for (String capitale : capitalCities.values()) {
            System.out.println(capitale);
        }

        // �tape 8 : Parcours la HashMap avec une boucle for-each en imprimant les cl�s et les valeurs
        System.out.println("Liste des pays et capitales dans la HashMap :");
        for (String pays : capitalCities.keySet()) {
            String capitale = capitalCities.get(pays);
            System.out.println("Pays : " + pays + ", Capitale : " + capitale);
        }

        // �tape 9 : Cr�e une HashMap avec des cl�s de type String et des valeurs de type Integer
        HashMap<String, Integer> personnes = new HashMap<>();

        // �tape 10 : Ajoute des paires cl�/valeur � la HashMap avec des noms et des �ges
        personnes.put("John", 32);
        personnes.put("Steve", 30);
        personnes.put("Angie", 33);

        // �tape 11 : Parcours la HashMap de personnes et imprime les noms et les �ges
        System.out.println("Liste des personnes dans la HashMap :");
        for (String nom : personnes.keySet()) {
            int age = personnes.get(nom);
            System.out.println("Nom : " + nom + ", Age : " + age);
        }
    }
}
