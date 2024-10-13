package SmartGarden;

public class ReservoirEau {
    private String niveauActuel;
    private String seuilAlerte;
    private final String seuilAtteint = "Seuil atteint";

    public ReservoirEau(String niveauActuel, String seuilAlerte) {
        this.niveauActuel = niveauActuel;
        this.seuilAlerte = seuilAlerte;
    }

    // Méthode pour envoyer une alerte
    public String alerter() {
        return seuilAtteint;
    }

    // Méthode pour faire sonner le réservoir (par exemple quand l'eau est trop haute)
    public String sonner() {
        return "Réservoir sonne: niveau d'eau critique.";
    }
}