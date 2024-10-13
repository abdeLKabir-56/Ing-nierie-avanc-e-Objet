public class Region1 implements RegleValidationAge {


    @Override
    public boolean peutBoireAlcool(int age) {
        return age >= 18;
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
