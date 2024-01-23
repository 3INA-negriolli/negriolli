package cicli;

/**
 * Classe che restituisce i primi n numeri pari o dispari in base alla scelta
 * effettuata
 *
 * @author negriolli.luca 3INA 2023
 * @version 1.00
 */
public class NumeriPariEDispari {

    private int numero;

    /**
     * Costruttore senza parametri
     */
    public NumeriPariEDispari() {
    }

    /**
     * Costruttore con i parametri
     *
     * @param numero
     */
    public NumeriPariEDispari(int numero) {
        this.numero = numero;
    }

    /**
     * Restituisce il valore del numero
     *
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Imposta/Modifica il valore del numero
     *
     * @param numero numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Metodo che restituisce un menu
     *
     * @return
     */
    public String menu() {
        String testo;
        testo = "1 - visualizzazione dei primi n numeri pari" + "\n" +
                "2 - visualizzazione dei primi n numeri dispari";
        return testo;
    }

    /**
     * Metodo che resituisce i primi n numeri dispari
     *
     * @return
     */
    public String primiNNumeriDispari() {
        String testo = "I primi n numeri dispari sono: ";
        int risultato;
        risultato = numero;
        int i = 0;

        if ((numero % 2) == 0) {
            risultato += 1;
            testo = risultato + "\n";
            i++;
        }

        for (i = i; i < numero; i++) {
            risultato += 2;
            testo += risultato + "\n";
        }
        return testo;
        
    }

    /**
     * Metodo che resituisce i primi n numeri pari
     *
     * @return
     */
    public String primiNNumeriPari() {
        String testo = "I primi n numeri pari sono: ";
        int risultato;
        risultato = numero;
        int i = 0;

        if ((numero % 2) == 1) {
            risultato += 1;
            testo = risultato + "\n";
            i++;
        }

        while (i < numero) {
            risultato += 2;
            testo += risultato + "\n";
            i++;
        }
        return testo;
    }

    /**
     * Metodo che restituisce il valore degli attributi
     *
     * @return
     */
    public String info() {
        String testo;
        testo = "Il numero è: " + numero;
        return testo;
    }
}
