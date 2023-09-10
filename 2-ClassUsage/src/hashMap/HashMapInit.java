package hashMap;
import java.util.HashMap; // Importe la classe HashMap

public class HashMapInit {
    public static void main(String[] args) {
        // Étape 1 : Crée un objet HashMap pour stocker des paires clé/valeur avec des chaînes de caractères comme clés et valeurs
        HashMap<String, String> capitalCities = new HashMap<>();

        // Étape 2 : Ajoute des paires clé/valeur à la HashMap en utilisant la méthode put()
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Étape 3 : Accède à une valeur dans la HashMap en utilisant la méthode get() et la clé
        String cityOfEngland = capitalCities.get("England");
        System.out.println("La capitale de l'Angleterre est " + cityOfEngland);

        // Étape 4 : Supprime une paire clé/valeur en utilisant la méthode remove() et la clé
        capitalCities.remove("England");
        System.out.println("Après suppression de l'Angleterre : " + capitalCities);

        // Étape 5 : Obtient la taille de la HashMap en utilisant la méthode size()
        int taille = capitalCities.size();
        System.out.println("Nombre de capitales : " + taille);

        // Étape 6 : Parcours la HashMap avec une boucle for-each en imprimant les clés
        System.out.println("Liste des pays dans la HashMap :");
        for (String pays : capitalCities.keySet()) {
            System.out.println(pays);
        }

        // Étape 7 : Parcours la HashMap avec une boucle for-each en imprimant les valeurs
        System.out.println("Liste des capitales dans la HashMap :");
        for (String capitale : capitalCities.values()) {
            System.out.println(capitale);
        }

        // Étape 8 : Parcours la HashMap avec une boucle for-each en imprimant les clés et les valeurs
        System.out.println("Liste des pays et capitales dans la HashMap :");
        for (String pays : capitalCities.keySet()) {
            String capitale = capitalCities.get(pays);
            System.out.println("Pays : " + pays + ", Capitale : " + capitale);
        }

        // Étape 9 : Crée une HashMap avec des clés de type String et des valeurs de type Integer
        HashMap<String, Integer> personnes = new HashMap<>();

        // Étape 10 : Ajoute des paires clé/valeur à la HashMap avec des noms et des âges
        personnes.put("John", 32);
        personnes.put("Steve", 30);
        personnes.put("Angie", 33);

        // Étape 11 : Parcours la HashMap de personnes et imprime les noms et les âges
        System.out.println("Liste des personnes dans la HashMap :");
        for (String nom : personnes.keySet()) {
            int age = personnes.get(nom);
            System.out.println("Nom : " + nom + ", Age : " + age);
        }
    }
}
