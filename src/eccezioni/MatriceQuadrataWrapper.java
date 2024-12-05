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
    public Integer numeroIstanze;

    public MatriceQuadrataWrapper() {
    }

    public MatriceQuadrataWrapper(Integer n) throws Exception {
        if (n != null) {
            if (n >= 2) {
                this.n = n;
                matrice = new Integer[n][n];
            } else {
                throw new Exception("n >= di 2");
            }
        } else {
            throw new Exception("n deve essere diverso da null");
        }

        numeroIstanze++;
    }

    public MatriceQuadrataWrapper(MatriceQuadrataWrapper mqw) {
        n = mqw.n;
        matrice = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j] = mqw.matrice[i][j];
            }
        }

        numeroIstanze++;
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

    /**
     * Imposta/Modifica il valore di n
     *
     * @param n
     */
    public void setN(Integer n) throws Exception {
        if (n != null) {
            if (n >= 2) {
                this.n = n;
            } else {
                throw new Exception("n deve essere > 2");
            }
        } else {
            throw new Exception("n deve essere diverso da null");
        }
    }

    /**
     * Riempie la matrice con numeri casuali senza doppioni
     */
    public void caricaRandom() {
        Random r = new Random();

        boolean[] usati = new boolean[100];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                int numeroCasuale;
                do {
                    numeroCasuale = r.nextInt(99) + 1;
                } while (usati[numeroCasuale]);

                matrice[i][j] = numeroCasuale;
                usati[numeroCasuale] = true;
            }
        }
    }

    /**
     * Metodo che visualizza la matrice
     *
     * @return
     */
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
    public boolean modificaElemento(Integer r, Integer c, Integer val) throws Exception {
        boolean modificato = false;

        if (r == null || c == null || val == null || r > matrice.length - 1 || c > matrice.length - 1) {
            throw new Exception("Coordinate o valore inseriti non validi! ");
        } else {
            for (Integer i = 0; i < matrice.length; i++) {
                for (Integer j = 0; j < matrice.length; j++) {
                    if (i == r && j == c) {
                        matrice[i][j] = val;
                        modificato = true;
                    }
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
        for (int i = 0; i < matrice.length; i++) {
            int n = matrice[i].length;
            for (int j = 0; j < n - 1; j++) {
                for (int k = 0; k < n - j - 1; k++) {
                    if (matrice[i][k] > matrice[i][k + 1]) {
                        Integer temp = matrice[i][k];
                        matrice[i][k] = matrice[i][k + 1];
                        matrice[i][k + 1] = temp;
                    }
                }
            }
        }
    }

    /**
     * Estrae gli elementi della diagonale principale
     *
     * @return
     */
    public Integer[] elementiDiagonalePrincipale() throws Exception {
        Integer[] elementi = new Integer[matrice.length];

        if (n == 2) {
            Integer temp = 0;
            Integer j = 0;

            for (Integer i = 0; i < matrice.length; i++) {
                temp = matrice[i][i];
                elementi[j] = temp;
                j++;
            }
        } else {
            throw new Exception("Dimensione non uguale a 2!");
        }

        return elementi;
    }

    /**
     * Estrae gli elementi della diagonale secondaria
     *
     * @return
     */
    public Integer[] elementiDiagonaleSecondaria() throws Exception {
        Integer[] elementi = new Integer[matrice.length];

        if (n == 2) {
            Integer temp = 0;
            Integer j = matrice.length - 1;
            Integer k = 0;

            for (Integer i = 0; i < matrice.length; i++) {
                temp = matrice[i][j];
                elementi[k] = temp;
                j--;
                k++;
            }
        } else {
            throw new Exception("Dimensione non uguale a 2!");
        }

        return elementi;
    }

    /**
     * Calcola il determinate di una matrice 2x2
     *
     * @return
     */
    public Integer determinante() throws Exception {
        Integer determinante = 0;

        determinante = (elementiDiagonalePrincipale()[0] * elementiDiagonalePrincipale()[1]) - (elementiDiagonaleSecondaria()[0] * elementiDiagonaleSecondaria()[1]);

        return determinante;
    }

    public boolean verificaUguaglianza(MatriceQuadrataWrapper mqw) throws Exception {
        boolean rit = true;

        if (n != mqw.n) {
            throw new Exception("Matrici di lunghezza diversa");
        } else {
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice.length; j++) {
                    if (matrice[i][j] != mqw.matrice[i][j]) {
                        rit = false;
                    }
                }
            }
        }

        return rit;
    }

    public static void main(String[] args) {
        Integer ogg = 3;
        try {
            MatriceQuadrataWrapper mqw = new MatriceQuadrataWrapper(ogg);
            mqw.caricaRandom();
            System.out.println(mqw.determinante());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
