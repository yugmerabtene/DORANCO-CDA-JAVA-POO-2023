package arrayList;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Création d'une liste pour stocker les produits
        List<Stockable> stockProduitsListe = new ArrayList<>();

        // Ajout de produits au stock (utilisant la liste)
        GestionnaireStockArrayList.ajouterProduit(stockProduitsListe, "Pommes", 100);
        GestionnaireStockArrayList.ajouterProduit(stockProduitsListe, "Bananes", 50);
        GestionnaireStockArrayList.ajouterProduit(stockProduitsListe, "Oranges", 75);

        // Retrait de produits du stock (utilisant la liste)
        GestionnaireStockArrayList.retirerProduit(stockProduitsListe, "Pommes", 30);
        GestionnaireStockArrayList.retirerProduit(stockProduitsListe, "Fraises", 20);

        // Affichage du stock (utilisant la liste)
        GestionnaireStockArrayList.afficherStock(stockProduitsListe);
    }
}
