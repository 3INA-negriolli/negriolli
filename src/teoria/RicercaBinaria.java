package teoria;

/**
 *
 * @author luca.negriolli 3INA 2024
 * @version 1.0
 */
public class RicercaBinaria {

    public static void riempimento(int vettore[]) {
        for (int i = 0; i < vettore.length; i++) {
            vettore[i] = (int) (Math.random() * 100);
        }
    }

    public static void riordino(int[] vettore) {
        int j;
        for (int i = 1; i < vettore.length; i++) {
            int temp = vettore[i];
            j = i;
            while (j > 0 && vettore[j - 1] > temp) {
                vettore[j] = vettore[j - 1];
                j--;
            }
            vettore[j] = temp;
        }
    }

    public static int ricercaBinaria(int vettore[], int chiave) {
        int inizio = 0;
        int fine = vettore.length - 1;
        int centro;
        int posChiave = -1;

        while (inizio <= fine && posChiave == -1) {
            centro = (inizio + fine) / 2;
            if (vettore[centro] == chiave) {
                posChiave = centro;

            } else {
                if (vettore[centro] < chiave) {
                    inizio = centro + 1;

                } else {
                    fine = centro - 1;

                }
            }
        }
        return posChiave;
    }

}
