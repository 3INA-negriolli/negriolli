package matrici;

import java.util.Arrays;
import java.util.Random;

/**
 * CLasse con vari metodi per le matrici
 * @author luca.negriolli 4INA
 */
public class Matrice {

    static public int[][] ordina(int[][] matrice) {

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                for (int k = i; k < matrice.length; k++) {
                    for (int z = (k == i ? j : 0); z < matrice[0].length; z++) {
                        if (matrice[i][j] > matrice[k][z]) {
                            int temp = matrice[k][z];
                            matrice[k][z] = matrice[i][j];
                            matrice[i][j] = temp;
                        }
                    }
                }
            }
        }

        return matrice;
    }

    static public int sommaElementi(int[][] matrice) {
        int somma = 0;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                somma += matrice[i][j];
            }
        }

        return somma;
    }

    static public float mediaElementi(int[][] matrice) {
        float somma = 0;
        float media = 0;

        somma = sommaElementi(matrice);

        media = somma / (matrice.length * matrice[0].length);

        return media;
    }

    static public int[][] sommaMatrici(int[][] m1, int[][] m2) {
        int[][] matrice = null;

        if (m1.length == m2.length && m1[0].length == m2[0].length) {
            matrice = new int[m1.length][m1[0].length];

            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    matrice[i][j] = m1[i][j] + m2[i][j];
                }

            }
        } else {
            ;
        }

        return matrice;
    }

    static public int[][] caricaRandom(int[][] matrice) {
        Random r = new Random();
        boolean controllo = false;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {

                do {
                    controllo = false;
                    matrice[i][j] = r.nextInt(99) + 1;
                    for (int k = 0; k < matrice.length; k++) {
                        for (int z = 0; z < matrice[0].length; z++) {
                            if (matrice[i][j] == matrice[k][z]) {
                                controllo = true;
                                matrice[i][j] = r.nextInt(99)+1;
                            }
                        }
                    }
                } while (controllo != true);
            }
        }

        return matrice;
    }

    static public float calcdiagonalePrincipale(int[][] matrice) {
        float dPrinc = 0;

        dPrinc = matrice[0][0] * matrice[1][1];

        return dPrinc;
    }

    static public float calcdiagonaleSecondaria(int[][] matrice) {
        float dSec = 0;

        dSec = matrice[0][1] * matrice[1][0];

        return dSec;
    }

    static public float determinanteMatrice(int[][] matrice) {
        float determinante = 0;

        determinante = calcdiagonalePrincipale(matrice) - calcdiagonaleSecondaria(matrice);

        return determinante;
    }

    public static void main(String[] args) {

        int[][] matrice = new int[3][3];
        int m1[][] = new int[][]{{4, 5, 6}, {12, 45, 32}, {212, 34343, 231}};
        int m2[][] = new int[][]{{4, 5, 6}, {12, 45, 32}, {212, 3434, 231}};

        System.out.println(Arrays.deepToString(Matrice.caricaRandom(matrice)));

    }

}
