package SolutionFacture;

import java.util.HashMap;
import java.util.Map;

public class Commender implements Facture {
    private HashMap<Produit, Integer> produits;

    private static double TVA;

    public static double getTVA() {
        return TVA;
    }

    public static void setTVA(double TVA) {
        Commender.TVA = TVA;
    }

    public Commender() {
        this.produits = new HashMap<>();
    }

    public HashMap<Produit, Integer> getProduits() {
        return produits;
    }

    public void addProduit(Produit produit, int quantite) {
        this.produits.put(produit, quantite);
    }

    public double getTotal() {
        double total = 0;
        for (Map.Entry<Produit, Integer> entry : this.produits.entrySet()) {
            total += entry.getKey().getPrix() * entry.getValue();
        }
        return total;
    }

    public double getTotalTTC() {
        return this.getTotal() * (1 + TVA);
    }

    @Override
    public void imprimer() {
        // Laisser vide ou supprimer si l'impression est gérée dans une autre classe
    }

    @Override
    public void saveFacture() {
        // Laisser vide ou supprimer si la sauvegarde est gérée dans une autre classe
    }
}
