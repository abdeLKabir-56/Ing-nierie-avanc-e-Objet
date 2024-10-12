package SolutionFacture;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SaveFacture {
    private int id;
    private Commender commender;

    public SaveFacture(int id, Commender commender) {
        this.id = id;
        this.commender = commender;
    }

    public void saveFacture() {
        try {
            // create a FileWriter object with the file name
            String file = "Facture_" + this.id + ".txt";
            FileWriter writer = new FileWriter(file);

            // write the string to the file
            for (Map.Entry<Produit, Integer> entry : this.commender.getProduits().entrySet()) {
                writer.write(entry.getKey().toString() + "\t" + entry.getValue() + "\n");
            }
            writer.write("Prix HT = " + this.commender.getTotal() + "\n");
            writer.write("Prix TTC = " + this.commender.getTotalTTC() + "\n");

            // close the writer
            writer.close();

            System.out.println("Facture sauvegardée avec succès dans " + file);

        } catch (IOException e) {
            System.out.println("Une erreur est survenue lors de la sauvegarde.");
            e.printStackTrace();
        }
    }
}
