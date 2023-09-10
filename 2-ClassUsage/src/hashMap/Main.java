package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Création d'une carte (HashMap) pour stocker les produits
        Map<String, Stockable> stockProduitsMap = new HashMap<>();

        // Ajout de produits au stock (utilisant la hashmap)
        GestionnaireStockHashMap.ajouterProduit(stockProduitsMap, "Pommes", 100);
        GestionnaireStockHashMap.ajouterProduit(stockProduitsMap, "Bananes", 50);
        GestionnaireStockHashMap.ajouterProduit(stockProduitsMap, "Oranges", 75);

        // Retrait de produits du stock (utilisant la hashmap)
        GestionnaireStockHashMap.retirerProduit(stockProduitsMap, "Pommes", 30);
        GestionnaireStockHashMap.retirerProduit(stockProduitsMap, "Fraises", 20);

        // Affichage du stock (utilisant la hashmap)
        GestionnaireStockHashMap.afficherStock(stockProduitsMap);
    }
}
