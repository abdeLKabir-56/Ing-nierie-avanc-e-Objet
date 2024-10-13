package ID;

public class CompteUniversitaireEnseignent implements Login {
    private Enseignent enseignent;
    private String login;

    public CompteUniversitaireEnseignent(Enseignent enseignent) {
        super();
        this.enseignent = enseignent;
    }
    @Override
    public void genererLogin(){
        String login = this.enseignent.getPrenom()+"."+this.enseignent.getNom() + this.enseignent.getGrade()+"@usms.ma";
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}