import SmartGarden.*;
import PackageSMS.*;

public class Main {
    public static void main(String[] args) {
        // Créer un réservoir et un analyseur de terre
        ReservoirEau reservoir = new ReservoirEau("75%", "80%");
        TerreAnalyse terre = new TerreSMS();  // TerreSMS hérite de TerreAnalyse

        // Utiliser des classes du packageSMS pour envoyer des alertes
        Textable smsClassA = new ClassA();
        Textable smsClassB = new ClassB();

        // Exemple d'alerte depuis le réservoir
        String alerteReservoir = reservoir.alerter();
        System.out.println(smsClassA.alerter(alerteReservoir));  // Utilise ClassA pour alerter

        // Exemple d'alerte depuis l'analyseur de terre
        String alerteTerre = terre.sonner();  // Utilisation de sonner()
        System.out.println(smsClassB.alerter(alerteTerre));  // Utilise ClassB pour alerter
    }
}
