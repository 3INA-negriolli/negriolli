package correzioniVerifiche;

/**
 * Classe che dato un numero intero n, calcolare il numero dei suoi divisori
 * positivi. (while) Dato un numero intero n, calcolare la somma dei primi m
 * multipli di n. (for)
 *
 * @author luca.negriolli 3INA 2024
 * @version 1.0
 */

public class DivisoriMultipli {

    public DivisoriMultipli() {
    }

    public static int numeroDivisori(int n) {
        int i = 0;
        int nDiv = 0;
        int d = 0;

        while (i < n) {
            i++;
            d++;
            if (n % d == 0) {
                nDiv++;
            }
        }

        return nDiv;
    }

    public static int sommaMultipli(int m, int n) {
        int i = 0;
        int multiplo = 0;
        int sMultipli = 0;

        for (i = 0; i < m; i++) {
            multiplo = n * (n + 1);
            sMultipli += multiplo;
            i++;
        }

        return sMultipli;
    }

    public static String menu() {
        String testo;

        testo = "1 - Inserimento numero" + "\n"
                + "2 - Inserimento numero di multipli da sommare" + "\n"
                + "3 - Visualizzazione del Numero di Divisori" + "\n"
                + "4 - Visualizzazione della Somma dei Multipli" + "\n"
                + "5 - Uscita" + "\n";

        return testo;
    }

}
