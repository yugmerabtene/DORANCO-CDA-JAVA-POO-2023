package hashMap;

import java.util.Map;

//Classe pour g�rer le stock de produits (utilisant HashMap)
public class GestionnaireStockHashMap {

 // M�thode pour ajouter un produit au stock (utilisant HashMap)
 public static void ajouterProduit(Map<String, Stockable> stock, String nomProduit, int quantite) {
     if (stock.containsKey(nomProduit)) {
         Stockable produit = stock.get(nomProduit);
         produit.setQuantite(produit.getQuantite() + quantite);
     } else {
         stock.put(nomProduit, new Produit(nomProduit, quantite));
     }
 }

 // M�thode pour retirer un produit du stock (utilisant HashMap)
 public static void retirerProduit(Map<String, Stockable> stock, String nomProduit, int quantite) {
     if (stock.containsKey(nomProduit)) {
         Stockable produit = stock.get(nomProduit);
         if (produit.getQuantite() >= quantite) {
             produit.setQuantite(produit.getQuantite() - quantite);
         } else {
             System.out.println("Stock insuffisant pour " + nomProduit);
         }
     } else {
         System.out.println(nomProduit + " n'est pas en stock.");
     }
 }

 // M�thode pour afficher le stock de produits (utilisant HashMap)
 public static void afficherStock(Map<String, Stockable> stock) {
     System.out.println("Stock des produits :");
     for (Map.Entry<String, Stockable> entry : stock.entrySet()) {
         System.out.println(entry.getKey() + ": " + entry.getValue().getQuantite());
     }
 }
}

