package exercice;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendrier calendrier = new Calendrier();

        Personne personne1 = new Personne("elhamoussi", "abdelkabir", new Date(90, 0, 15), "elhamoussi.abdelkabir@gmail.com", "0601234567");
        calendrier.add(personne1);

        // Envoi d'un message d'anniversaire
        calendrier.envoyerMessageAnniversaire(personne1);
    }
}
