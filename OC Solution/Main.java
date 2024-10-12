public class Main {
    public static void main(String[] args) {
        OperationManager operationManager = new OperationManager();

        Compte compteCourant = new Compte("123", "10/10/2020", TypeCompte.Courant);
        Compte compteEpargne = new Compte("456", "05/05/2018", TypeCompte.Epargne);

        Operation debitOperation = new Operation(100, TypeOperation.Debit);
        Operation creditOperation = new Operation(50, TypeOperation.Credit);
        if (operationManager.addOperation(debitOperation, compteCourant)) {
            System.out.println("Débit réussi pour le compte courant. Nouveau montant : " + compteCourant.getMontant());
        } else {
            System.out.println("Débit échoué pour le compte courant.");
        }
        if (operationManager.addOperation(creditOperation, compteEpargne)) {
            System.out.println("Crédit réussi pour le compte épargne. Nouveau montant : " + compteEpargne.getMontant());
        } else {
            System.out.println("Crédit échoué pour le compte épargne.");
        }
    }
}
