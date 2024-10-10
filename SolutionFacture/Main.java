package SolutionFacture;

public class Main {
    public static void main(String[] args) {
        Produit p1 = new Produit();
        p1.setLibelle("Ordinateur");
        p1.setPrix(1000);

        Produit p2 = new Produit();
        p2.setLibelle("Souris");
        p2.setPrix(50);

        Commender commender = new Commender();
        commender.addProduit(p1, 2);
        commender.addProduit(p2, 5);

        // Imprimer la facture
        ImprimerFacture imprimante = new ImprimerFacture(commender);
        imprimante.imprimer();

        // Sauvegarder la facture
        SaveFacture saveFacture = new SaveFacture(1, commender);
        saveFacture.saveFacture();
    }
}
