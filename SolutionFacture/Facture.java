package SolutionFacture;

import java.util.HashMap;

public interface Facture {
    public double getTotalTTC();
    public double getTotal();
    public void imprimer();
    public void saveFacture();
}
