package ID;

public class CompteUniversitaireEtudiant implements Login {
    private Etudiant etudiant;
    private String login;

    public CompteUniversitaireEtudiant(Etudiant etudiant) {
        super();
        this.etudiant = etudiant;
    }
    @Override
    public void genererLogin(){
        String login = this.etudiant.getPrenom().charAt(0)+"."+this.etudiant.getNom() + "@usms.ac.ma";
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}