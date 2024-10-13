package exercice;

import exercice.IPersonne;

import java.util.ArrayList;
import java.util.List;

public class Calendrier  {
    private List<IPersonne> personnes = new ArrayList<>();

    public void add(IPersonne personne) {
        personnes.add(personne);
    }

    public void envoyerMessageAnniversaire(IPersonne personne) {
        String message = "Joyeux Anniversaire, " + personne.getNom() + "!";
        // Logique pour envoyer le message, par exemple par email ou SMS
        System.out.println(message);
    }

    public List<IPersonne> getPersonnes() {
        return personnes;
    }
}
