package ID;



public class Main {
    public static void main(String[] args) {

        Enseignent enseignent = new Enseignent("elhamoussi", "abdelkabir", "Prof");
        Login compteEnseignant = new CompteUniversitaireEnseignent(enseignent);
        compteEnseignant.genererLogin();
        System.out.println("Login Enseignant: " + ((CompteUniversitaireEnseignent) compteEnseignant).getLogin());

        // Création d'un étudiant et génération du login
        Etudiant etudiant = new Etudiant("elhamoussi", "abdelkabir", 12345);
        Login compteEtudiant = new CompteUniversitaireEtudiant(etudiant);
        compteEtudiant.genererLogin();
        System.out.println("Login Etudiant: " + ((CompteUniversitaireEtudiant) compteEtudiant).getLogin());
    }
}
