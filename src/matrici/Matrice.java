package matrici;

import java.util.Arrays;
import java.util.Random;

/**
 *
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
    
    static public int[][] caricaRandom(int[][] matrice){
        Random r = new Random();
        int count = 0;
        
        while(count != matrice.length){
            
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[0].length; j++) {
                    matrice[i][j] = r.nextInt(9)+1;
                }
            }
        }
        
        return matrice;
    }
    
    /*
    static public int[] diagonalePrincipale(int[][] matrice){
        
    }
    
    static public int[] diagonaleSecondaria(int[][] matrice){
        
    }
    */
    
    static public float determinanteMatrice(int[][] matrice){
        float determinante = 0;
        
        
        
        return determinante;
    }

    public static void main(String[] args) {

        int[][] matrice = new int[][]{{4, 8, 7}, {6, 5, 8}, {9, 4, 5}};
        int m1[][] = new int[][] {{4,5,6},{12,45,32},{212,34343,231}};
        int m2[][] = new int[][] {{4,5,6},{12,45,32},{212,3434,231}};

        System.out.println(Arrays.deepToString(Matrice.sommaMatrici(m1, m2)));
        Matrice.caricaRandom(matrice);
        System.out.println(Arrays.deepToString(matrice));
    }

}
