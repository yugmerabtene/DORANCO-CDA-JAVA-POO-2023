package dateFormat;

import java.time.LocalDate; // Importez la classe LocalDate pour travailler avec les dates
import java.time.LocalTime; // Importez la classe LocalTime pour travailler avec l'heure
import java.time.LocalDateTime; // Importez la classe LocalDateTime pour travailler avec les dates et l'heure
import java.time.format.DateTimeFormatter; // Importez la classe DateTimeFormatter pour formater les dates

public class InitDateFormat {
  public static void main(String[] args) {
    // Exemple 1 : Afficher la date actuelle
    LocalDate currentDate = LocalDate.now(); // Cr�ez un objet de date
    System.out.println("Date actuelle : " + currentDate);

    // Exemple 2 : Afficher l'heure actuelle
    LocalTime currentTime = LocalTime.now(); // Cr�ez un objet de temps
    System.out.println("Heure actuelle : " + currentTime);

    // Exemple 3 : Afficher la date et l'heure actuelles
    LocalDateTime currentDateTime = LocalDateTime.now(); // Cr�ez un objet de date et d'heure
    System.out.println("Date et heure actuelles : " + currentDateTime);

    // Exemple 4 : Formater la date et l'heure actuelles
    LocalDateTime formattedDateTime = LocalDateTime.now(); // Cr�ez un objet de date et d'heure
    System.out.println("Avant le formatage : " + formattedDateTime);

    // Cr�ez un objet DateTimeFormatter avec le format souhait�
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    // Utilisez le formateur pour obtenir la date et l'heure au format sp�cifi�
    String formattedDate = formattedDateTime.format(myFormatObj);
    System.out.println("Apr�s le formatage : " + formattedDate);
  }
}
