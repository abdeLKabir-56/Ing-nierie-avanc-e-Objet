package SolutionFacture;

import java.util.Map;

public class ImprimerFacture {
    private Commender commender;

    public ImprimerFacture(Commender commender) { // Constructeur pour passer Commender
        this.commender = commender;
    }

    public void imprimer() {
        double prix;
        for (Map.Entry<Produit, Integer> entry : this.commender.getProduits().entrySet()) {
            prix = entry.getKey().getPrix() * entry.getValue();
            System.out.println(entry.getKey() + "\t" + entry.getValue() + " : " + prix);
        }
        System.out.println("Prix HT = " + this.commender.getTotal());
        System.out.println("Prix TTC = " + this.commender.getTotalTTC());
    }
}
