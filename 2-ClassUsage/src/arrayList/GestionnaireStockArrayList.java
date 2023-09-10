package arrayList;
import java.util.List;

//Classe pour gérer le stock de produits (utilisant ArrayList)
public class GestionnaireStockArrayList {

 // Méthode pour ajouter un produit au stock (utilisant ArrayList)
 public static void ajouterProduit(List<Stockable> stock, String nomProduit, int quantite) {
     for (Stockable produit : stock) {
         if (produit.getNom().equals(nomProduit)) {
             produit.setQuantite(produit.getQuantite() + quantite);
             return;
         }
     }
     stock.add(new Produit(nomProduit, quantite));
 }

 // Méthode pour retirer un produit du stock (utilisant ArrayList)
 public static void retirerProduit(List<Stockable> stock, String nomProduit, int quantite) {
     for (Stockable produit : stock) {
         if (produit.getNom().equals(nomProduit)) {
             if (produit.getQuantite() >= quantite) {
                 produit.setQuantite(produit.getQuantite() - quantite);
             } else {
                 System.out.println("Stock insuffisant pour " + nomProduit);
             }
             return;
         }
     }
     System.out.println(nomProduit + " n'est pas en stock.");
 }

 // Méthode pour afficher le stock de produits (utilisant ArrayList)
 public static void afficherStock(List<Stockable> stock) {
     System.out.println("Stock des produits :");
     for (Stockable produit : stock) {
         System.out.println(produit.getNom() + ": " + produit.getQuantite());
     }
 }
}
