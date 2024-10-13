package exercice;

import exercice.IPersonne;

import java.util.Date;
import java.util.List;

public class Personne implements IPersonne {
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;
    private String telMobile;

    public Personne() {
    }

    public Personne(String nom, String prenom, Date dateNaissance, String email, String telMobile) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telMobile = telMobile;
    }

    @Override
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String calculerAge() {
        Date now = new Date();
        int year = now.getYear() - dateNaissance.getYear();
        int month = now.getMonth() - dateNaissance.getMonth();
        if (month >= 12) {
            year = year + 1;
            month = month - 12;
        }
        return year + "-" + month;
    }
}
