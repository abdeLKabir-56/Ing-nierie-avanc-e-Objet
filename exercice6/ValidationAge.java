
public class ValidationAge {
    private RegleValidationAge regleValidation;

    public ValidationAge(RegleValidationAge regleValidation) {
        this.regleValidation = regleValidation;
    }

    public boolean peutBoireAlcool(int age) {
        return regleValidation.peutBoireAlcool(age);
    }

    public boolean peutUtiliserFesseBouk(int age) {
        return regleValidation.peutUtiliserFesseBouk(age);
    }

    public boolean peutEtreEluMaire(int age) {
        return regleValidation.peutEtreEluMaire(age);
    }

    public static void main(String[] args) {
        //Region1
        ValidationAge validation1 = new ValidationAge(new Region1());
        System.out.println("Peut boire en Region1 à 17 ans : " + validation1.peutBoireAlcool(17)); // false

        //Region2
        ValidationAge validation2 = new ValidationAge(new Region2());
        System.out.println("Peut boire en Region2 à 19 ans : " + validation2.peutBoireAlcool(19)); // true

      //Region3
        ValidationAge validation3 = new ValidationAge(new Region3());
        System.out.println("Peut être élu maire en Region3 à 15 ans : " + validation3.peutEtreEluMaire(15)); // true
    }
}
