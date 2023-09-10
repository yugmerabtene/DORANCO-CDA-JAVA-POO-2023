package dateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InitDateFormat {
    public static void main(String[] args) {
        // Créez un objet SimpleDateFormat avec le format de date souhaité
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Obtenez la date et l'heure actuelles
        Date date = new Date();

        // Formatez la date en une chaîne de caractères dans le format spécifié
        String dateStr = sdf.format(date);
        System.out.println("Date formatée : " + dateStr);

        // Exemple de chaîne de date à parser
        String dateStrToParse = "09/09/2023 14:30:00";

        try {
            // Parsez la chaîne de date en objet Date
            Date parsedDate = sdf.parse(dateStrToParse);
            System.out.println("Date parsée : " + parsedDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

