import java.util.ArrayList;

public class OperationManager {

    public boolean addOperation(Operation operation, Compte compte) {
        double montant = compte.getMontant();
        ArrayList<Operation> operations = compte.getOperations();

        if (compte.getTypeCompte() == TypeCompte.Courant) {
            if (operation.getTypeOperation() == TypeOperation.Debit) {
                operations.add(operation);
                montant += operation.getMontant();
                compte.setMontant(montant);  // Met à jour le montant du compte
                return true;
            } else {
                if (montant >= operation.getMontant()) {
                    operations.add(operation);
                    montant -= operation.getMontant();
                    compte.setMontant(montant);
                    return true;
                }
                return false;
            }
        } else {  // Compte Épargne
            if (operation.getTypeOperation() == TypeOperation.Debit) {
                operations.add(operation);
                montant += operation.getMontant() * 0.05;  // Applique la règle spécifique pour l'épargne
                compte.setMontant(montant);
                return true;
            } else {
                if (montant >= operation.getMontant() * 0.1 &&
                        java.time.LocalDate.now().getYear() > Integer.parseInt(compte.getDateCreation().split("/")[2])) {
                    operations.add(operation);
                    montant -= operation.getMontant() * 0.1;  // Applique la règle pour l'épargne
                    compte.setMontant(montant);
                    return true;
                }
                return false;
            }
        }
    }
}
