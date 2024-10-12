import java.util.ArrayList;

public class MatriceYong implements Matrice, Tableau {
    private static final int INF = Integer.MAX_VALUE;
    private int n;
    private int m;
    private ArrayList<ArrayList<Integer>> matrice;

    public MatriceYong(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrice = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>(m);
            for (int j = 0; j < m; j++) {
                row.add(INF);
            }
            this.matrice.add(row);
        }
    }

    @Override
    public boolean add(Object o) {
        int key = (Integer)(o);
        if (getElement(n - 1, m-1) != INF) {
            System.out.println("Le tableau de Young est plein.");
            return false;
        }
        // Insérer la clé dans la dernière position (case en bas à droite)
        this.setElement(n-1, m-1, key);
        // Maintenir la propriété du tableau de Young
        int i = n - 1;
        int j = m - 1;
        while (i > 0 || j > 0) {
            int top = (i > 0) ? this.getElement(i - 1,j-1) : INF;
            int left = (j > 0) ? this.getElement(i - 1,j) : INF;

            if (key < top && key < left) {
                break;  // Key is in the right place
            } else if (top < left) {
                this.setElement(i - 1,j, top);
                i--;
            } else {
                this.setElement(i - 1,j, left);
                j--;
            }
        }
        this.setElement(i - 1,j,key);
        return true;
    }

    @Override
    public int extraireMin() {
        if(this.getElement(0,0) == INF ){
            return INF;
        }
        else{
            int min = this.getElement(0,0);
            equilibrerTableau(0,0);
            return min;
        }
    }

    @Override
    public void printTabbleau() {
        for(int i = 0; i < n; i++){
            for(int j= 0; j< m; j++){

                if(this.getElement(i,j)==INF){
                    System.out.print("INF" + ";");
                }
                else{
                    System.out.print(this.getElement(i,j) + ";");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void equilibrerTableau(int i, int j) {
        int down = (i + 1 < n) ? this.getElement(i + 1,j) : INF;
        int right = (j + 1 < m) ? this.getElement(i,j + 1) : INF;

        if (down == INF && right == INF) {
            return; // Fin de la descente
        }

        if (down < right) {
            this.setElement(i,j,down);
            equilibrerTableau(i + 1, j);
        } else {
            this.setElement(i,j,right);
            equilibrerTableau(i, j + 1);
        }
    }

    private int getElement(int i, int j) {
        return matrice.get(i).get(j);
    }

    private void setElement(int i, int j, int valeur) {
        matrice.get(i).set(j, valeur);
    }
}