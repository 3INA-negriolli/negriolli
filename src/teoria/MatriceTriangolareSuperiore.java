package teoria;

/**
 * Scrivere un programma che, data una matrice quadrata di interi, dica
 * all’utente se la matrice è triangolare superiore oppure no. Si ricordi che
 * una matrice quadrata è triangolare superiore se tutti gli elementi al di
 * sotto della diagonale principale sono uguali a zero.
 *
 * @author luca.negriolli 3INA 2024
 * @version 1.0
 */
public class MatriceTriangolareSuperiore {

    public MatriceTriangolareSuperiore() {
    }

    public static boolean isTriangolareSup(int[][] matrice) {
        boolean ritorno = true;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                if (matrice[i][j] != 0) {
                    ritorno = false;
                }
            }

        }

        return ritorno;
    }

}
