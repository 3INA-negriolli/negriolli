package correzioniVerifiche;

/**
 * Verifica sulle Matrici
 *
 * @author Luca Negriolli 4INA 15/11/2024
 * @version 1.0
 */
import java.util.Random;

public class MatriceQuadrata {

    private int[][] matrice;
    private int n;

    MatriceQuadrata(int n) {
        this.n = n;
        matrice = new int[n][n];
    }

    /**
     * Metodo get che restituisce la matrice
     *
     * @return
     */
    public int[][] getMatrice() {
        return matrice;
    }

    /**
     * Metodo get che restituisce n
     *
     * @return
     */
    public int getN() {
        return n;
    }

    public void caricaRandom() {
        Random r = new Random();

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                matrice[i][j] = r.nextInt(99) + 1;
            }
        }

    }

    public String visualizza() {
        String testo = "┌" + "      ┬    " + "  ┐";

        for (int i = 0; i < matrice.length; i++) {
            testo += "\n" + "";
            for (int j = 0; j < matrice.length; j++) {
                testo += "│" + matrice[i][j] + " ";
            }
        }

        testo += "\n" + "└" + "      ┴    " + "  ┘";

        return testo;
    }

    /**
     * Metodo che inserite le coordinate di un elemento nella matrice ne
     * sostituisce il contenuto con quello del parametro
     *
     * @param r
     * @param c
     * @param val
     * @return
     */
    public boolean modificaElemento(int r, int c, int val) {
        boolean modificato = false;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                if (i == r && j == c) {
                    matrice[i][j] = val;
                    modificato = true;
                }
            }
        }

        return modificato;
    }

    /**
     * Riorganizza in ordine crescente gli elementi presenti in ogni riga della
     * matrice.
     */
    public void ordinaPerRiga() {
        int temp;

    }

    /**
     * Estrae gli elementi della diagonale principale
     *
     * @return
     */
    public int[] elementiDiagonalePrincipale() {
        int[] elementi = new int[matrice.length];
        int temp = 0;
        int j = 0;

        for (int i = 0; i < matrice.length; i++) {
            temp = matrice[i][i];
            elementi[j] = temp;
            j++;
        }

        return elementi;
    }

    /**
     * Estrae gli elementi della diagonale secondaria
     *
     * @return
     */
    public int[] elementiDiagonaleSecondaria() {
        int[] elementi = new int[matrice.length];
        int temp = 0;
        int j = matrice.length - 1;
        int k = 0;

        for (int i = 0; i < matrice.length; i++) {
            temp = matrice[i][j];
            elementi[k] = temp;
            j--;
            k++;
        }

        return elementi;
    }

    /**
     * Calcola il determinate di una matrice 2x2
     *
     * @return
     */
    public int determinante() {
        int determinante = 0;

        determinante = (elementiDiagonalePrincipale()[0] * elementiDiagonalePrincipale()[1]) - (elementiDiagonaleSecondaria()[0] * elementiDiagonaleSecondaria()[1]);

        return determinante;
    }

}
