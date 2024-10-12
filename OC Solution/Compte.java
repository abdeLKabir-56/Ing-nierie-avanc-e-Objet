import java.util.ArrayList;

public class Compte {

    private String id;
    private String dateCreation;
    private double montant;
    private TypeCompte typeCompte;
    private ArrayList<Operation> operations;

    public Compte(String id, String dateCreation, TypeCompte typeCompte) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.typeCompte = typeCompte;
        this.montant = 0;
        this.operations = new ArrayList<>();
    }

    public Compte() {
        this.operations = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public TypeCompte getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(TypeCompte typeCompte) {
        this.typeCompte = typeCompte;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }
}
