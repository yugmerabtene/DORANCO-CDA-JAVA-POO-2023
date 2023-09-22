package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        // Spécifiez le chemin complet du fichier
        String cheminFichier = "C:\\Users\\Yug\\Desktop\\javaInitCoursDoranco\\0-MiscTests\\montexte.txt";

        try {
            // Création d'un objet FileWriter pour écrire dans le fichier
            // Note : Utilisez le deuxième argument du FileWriter pour indiquer si vous souhaitez ajouter du contenu au fichier existant (true) ou le remplacer (false).
            FileWriter fichierWriter = new FileWriter(cheminFichier, true);

            // Création d'un objet BufferedWriter pour améliorer les performances d'écriture
            BufferedWriter bufferedWriter = new BufferedWriter(fichierWriter);

            // Écrire du texte dans le fichier
            bufferedWriter.write("Ceci est une ligne de texte.");
            bufferedWriter.newLine(); // Ajouter une nouvelle ligne
            bufferedWriter.write("Ceci est une autre ligne de texte.");

            // Fermer le fichier
            bufferedWriter.close();

            // Lire le fichier
            FileReader fichierReader = new FileReader(cheminFichier);
            BufferedReader bufferedReader = new BufferedReader(fichierReader);

            String ligne;
            System.out.println("Contenu du fichier :");
            while ((ligne = bufferedReader.readLine()) != null) {
                System.out.println(ligne);
            }

            // Fermer le fichier
            bufferedReader.close();

            // Supprimer le fichier
            /**
            File fichier = new File(cheminFichier);
            if (fichier.delete()) {
                System.out.println("Le fichier a été supprimé avec succès.");
            } else {
                System.out.println("Échec de la suppression du fichier.");
            }
            **/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
