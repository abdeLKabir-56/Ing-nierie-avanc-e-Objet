public class Region3 implements RegleValidationAge {

    @Override
    public boolean peutBoireAlcool(int age) {
        return age >= 19;
    }

    @Override
    public boolean peutUtiliserFesseBouk(int age) {
        return age >= 13;
    }

    @Override
    public boolean peutEtreEluMaire(int age) {
        return age >= 21;
    }
}
