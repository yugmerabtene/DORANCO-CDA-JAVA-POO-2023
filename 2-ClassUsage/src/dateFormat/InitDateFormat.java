package dateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InitDateFormat {
    public static void main(String[] args) {
        // Cr�ez un objet SimpleDateFormat avec le format de date souhait�
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Obtenez la date et l'heure actuelles
        Date date = new Date();

        // Formatez la date en une cha�ne de caract�res dans le format sp�cifi�
        String dateStr = sdf.format(date);
        System.out.println("Date format�e : " + dateStr);

        // Exemple de cha�ne de date � parser
        String dateStrToParse = "09/09/2023 14:30:00";

        try {
            // Parsez la cha�ne de date en objet Date
            Date parsedDate = sdf.parse(dateStrToParse);
            System.out.println("Date pars�e : " + parsedDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

