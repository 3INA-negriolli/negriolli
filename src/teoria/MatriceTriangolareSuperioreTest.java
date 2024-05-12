package teoria;

import java.util.Scanner;

public class MatriceTriangolareSuperioreTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dim;
        int n;

        System.out.println("Inserire la dimensione della matrice quadrata");
        dim = in.nextInt();

        int matrice[][] = new int[dim][dim];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                System.out.println("Inserire il numero: ");
                n = in.nextInt();
                matrice[i][j] = n;
            }
        }

        if (MatriceTriangolareSuperiore.isTriangolareSup(matrice)) {
            System.out.println("La Matrice è triangolare superiore: ");
        } else {
            System.out.println("La Matrice non è triangolare superiore");
        }

    }
}
