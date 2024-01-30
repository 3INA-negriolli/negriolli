package teoria;

/**
 * Classe che calcola la tabellina di un numero inserito in input
 *
 * @author luca.negriolli 2023 3INA
 * @version 1.0
 */
public class Tabellina {

    private int n;

    /**
     * Costruttore senza parametri {@link #setNumero(int)}<br>
     */
    public Tabellina() {
    }

    /**
     * Costruttore con i parametri
     *
     * @param n
     */
    public Tabellina(int n) {
        this.n = n;
    }

    /**
     * Restituisce il valore del numero inserito
     *
     * @return
     */
    public int getNumero() {
        return n;
    }

    /**
     * Imposta/ Modifica il valore del numero
     *
     * @param n
     */
    public void setNumero(int n) {
        this.n = n;
    }

    /**
     * Metodo che restituisce la tabellina del numero richiesto in input
     *
     * @return
     */
    public String tabellina() {
        String testo = "";
        int i = 1;
        int risultato;
        while (i < 11) {
            risultato = n * i;
            testo += n + "*" + i + " è uguale a " + risultato + "\n";
            i++;
        }
        return testo;
    }

    public String pari() {
        String ris;
        int risultato = n;
        while (risultato > 1) {
            risultato = risultato - 2;
        }
        if (risultato == 1) {
            ris = "Il numero è Dispari";
        } else {
            ris = "Il numero è Pari";
        }
        return ris;
    }
    
    /**
     * Metodo che restituisce il numero di cifre che compongono il numero stesso
     * @return 
     */
    public String nCifre() {
        String testo = "";
        int conta = 0;
        if (n == 0) {
            testo = "il numero ha una cifra";
        } else {
            while (n != 0) {
                n = n / 10;
                conta++;
            }
            testo += "Il numero ha " + conta + " cifre";

        }
        return testo;
    }

    /**
     * Metodo che restituisce il fattoriale di un numero
     *
     * @return
     */
    public String fattoriale() {
        String testo;
        int fattoriale = 1;
        if (n == 0) {
            fattoriale = 0;
        } else {
            for (int i = 1; i < (n + 1); i++) {
                fattoriale *= i;
            }
        }
        testo = "Il fattoriale di " + n + " è " + fattoriale;
        return testo;
    }

    /**
     * Restituisce il valore degli attributi
     *
     * @return String
     */
    public String info() {
        String testo;
        testo = "Il n è: " + n;
        return testo;
    }
}
