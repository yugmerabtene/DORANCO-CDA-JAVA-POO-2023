package hashMap;

//Classe représentant un produit pouvant être stocké
public class Produit implements Stockable {
 private String nom;
 private int quantite;

 public Produit(String nom, int quantite) {
     this.nom = nom;
     this.quantite = quantite;
 }

 @Override
 public String getNom() {
     return nom;
 }

 @Override
 public int getQuantite() {
     return quantite;
 }

 @Override
 public void setQuantite(int quantite) {
     this.quantite = quantite;
 }
}
