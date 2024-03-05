package teoria;

import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arrayPariMinimo = {0, 2, 4, 6, 8, 10, 12, 14, 16};
        int n = arrayPariMinimo.length;
        String rit = "";
        String rit1 = "";
        for (int i = 0; i < arrayPariMinimo.length; i += 2) {
            rit += " " + arrayPariMinimo[i];
            rit1 = rit;
        }
        System.out.println(rit1);

        int i = 2;
        int uscita = 1;

        do {
            rit += " " + arrayPariMinimo[i];
            i = n - 1;
            uscita++;

        } while (uscita != 2);

        System.out.print(rit);

        for (i = 1; i < arrayPariMinimo.length; i++) {
            int min = arrayPariMinimo[0];
            if (min < arrayPariMinimo[i]) {
                min = arrayPariMinimo[i];
            }
        
        System.out.println("Il minimo è: " + min);

        }

    }
}
