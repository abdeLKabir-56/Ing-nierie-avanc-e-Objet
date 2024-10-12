public class Main {
    public static void main(String[] args) {
        MatriceYong matrice = new MatriceYong(3, 3);

        System.out.println("Tableau initial :");
        matrice.printTabbleau();

        System.out.println("\nAjout d'éléments :");
        matrice.add(5);
        matrice.add(2);
        matrice.add(7);
        matrice.add(1);
        matrice.add(3);
        matrice.printTabbleau();

        System.out.println("\nExtraction du minimum :");
        int min = matrice.extraireMin();
        System.out.println("Minimum extrait : " + min);
        matrice.printTabbleau();

        System.out.println("\nAjout d'un nouvel élément :");
        matrice.add(4);
        matrice.printTabbleau();
    }
}