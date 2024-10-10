package SolutionFacture;

public class Produit {
    private double prix;
    private String libelle;

    public Produit() {
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "prix=" + prix +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
