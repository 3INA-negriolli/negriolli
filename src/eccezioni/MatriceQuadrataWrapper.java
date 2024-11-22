package eccezioni;

/**
 * Verifica sulle Matrici
 *
 * @author Luca Negriolli 4INA 15/11/2024
 * @version 1.0
 */
import java.util.Random;

public class MatriceQuadrataWrapper {

    private Integer[][] matrice;
    private Integer n;

    public MatriceQuadrataWrapper() {
    }

    MatriceQuadrataWrapper(Integer n) throws Exception {
        if (n != null) {
            if (n >= 2) {
                this.n = n;
                matrice = new Integer[n][n];
            }else{
                throw new Exception("n >= di 2");
            }
        } else {
            throw new Exception("n deve essere diverso da null");
        }
    }

    /**
     * Metodo get che restituisce la matrice
     *
     * @return
     */
    public Integer[][] getMatrice() {
        return matrice;
    }

    /**
     * Metodo get che restituisce n
     *
     * @return
     */
    public Integer getN() {
        return n;
    }

    public void caricaRandom() {
        Random r = new Random();

        for (Integer i = 0; i < matrice.length; i++) {
            for (Integer j = 0; j < matrice.length; j++) {
                matrice[i][j] = r.nextInt(99) + 1;
            }
        }

    }

    public String visualizza() {
        String testo = "┌" + "      ┬    " + "  ┐";

        for (Integer i = 0; i < matrice.length; i++) {
            testo += "\n" + "";
            for (Integer j = 0; j < matrice.length; j++) {
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
    public boolean modificaElemento(Integer r, Integer c, Integer val) {
        boolean modificato = false;

        for (Integer i = 0; i < matrice.length; i++) {
            for (Integer j = 0; j < matrice.length; j++) {
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
        Integer temp;

    }

    /**
     * Estrae gli elementi della diagonale principale
     *
     * @return
     */
    public Integer[] elementiDiagonalePrincipale() {
        Integer[] elementi = new Integer[matrice.length];
        Integer temp = 0;
        Integer j = 0;

        for (Integer i = 0; i < matrice.length; i++) {
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
    public Integer[] elementiDiagonaleSecondaria() {
        Integer[] elementi = new Integer[matrice.length];
        Integer temp = 0;
        Integer j = matrice.length - 1;
        Integer k = 0;

        for (Integer i = 0; i < matrice.length; i++) {
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
    public Integer determinante() {
        Integer determinante = 0;

        determinante = (elementiDiagonalePrincipale()[0] * elementiDiagonalePrincipale()[1]) - (elementiDiagonaleSecondaria()[0] * elementiDiagonaleSecondaria()[1]);

        return determinante;
    }

}
