package correzioniVerifiche;

import java.util.Arrays;

/**
 *
 * @author luca.negriolli 3INA 2024
 * @version 1.0
 */
public class Matematica {

    public Matematica() {
    }

    private static boolean isValidoBin(int[] numeri) {
        boolean valido = false;

        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] == 0 || numeri[i] == 1) {
                valido = true;
            }
        }

        return valido;
    }

    private static boolean isValidoDec(int numero) {
        boolean valido = false;

        if (numero < 256 && numero >= 0) {
            valido = true;
        }

        return valido;
    }

    /* public static int mcm(int[] numeri) {
        int mcm = 0;
        int mul = 1;

        for (int i = 0; i < numeri.length; i++) {
            mul++;
            numeri[i] * mul;

        }

    }
     */
    public static int MCD(int[] numeri) {
        int div = 3;
        int mcd = 0;
        int i = 0;
        boolean trovato = false;

        do {
            if (numeri[i] % div == 0) {
                i++;
            }

            if (i == numeri.length - 1) {
                mcd = div;
            }

            if (i == numeri.length - 1 && mcd != div) {
                i = 0;
                div++;
            }

        } while (mcd != div);

        return mcd;
    }

    public static int convBinToDec(int[] numeri) {
        int j = 7;
        int numDec = 0;

        if (isValidoBin(numeri)) {
            for (int i = 0; i < numeri.length; i++) {
                if (numeri[i] == 1) {
                    numDec += (int) Math.pow(2, j);
                }
                j--;
            }
        } else {
            numDec = -1;
        }

        return numDec;
    }

    public static int[] convDecToBin(int numero) {
        int[] numBin = new int[8];
        int j = 7;

        if (isValidoDec(numero)) {
            for (int i = 0; i < numBin.length; i++) {
                if (numero % 2 != 0) {
                    numBin[j] = 1;
                    numero /= 2;
                } else {
                    numBin[j] = 0;
                    numero /= 2;

                }
                j--;
            }
        } else {
            numBin[j] = -1;
        }
        return numBin;
    }

}
