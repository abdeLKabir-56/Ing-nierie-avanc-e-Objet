package SmartGarden;

public class TerreAnalyse {
    private String tauxHumidite;
    private String acidite;
    private String base;
    private String les3seuils;

    // Méthode pour faire sonner l'alarme en cas d'anomalie
    public String sonner() {
        return "Analyse de la terre: seuil critique atteint.";
    }

    // Méthode placeholder pour alerter
    public String alerter(String msg) {
        return msg;
    }
}