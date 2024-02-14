package cicli;

/**
 * Scrivere una classe che, dato un numero intero compreso tra 1 e 20, per tutti
 * gli interi non negativi minori di n, ne restituisca il quadrato.
 *
 * @author Luca.Negriolli 3INA 2024
 * @version 1.0
 */
public class Quadrati {

    private int numero;

    /**
     * Costruttore senza parametri
     *
     */
    public Quadrati() {
    }

    /**
     * Costruttore con i parametri
     *
     * @param numero
     */
    public Quadrati(int numero) {
        this.numero = numero;
    }

    /**
     * Restituisce il valore dell'attributo
     *
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Modifica/Imposta il valore dell'attributo
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Restituisce i quadrati minori del Numero inserito
     *
     * @return
     */
    public String quadratiMinN() {
        String testo = "Numeri" + "\t" + "Quadrato" + "\n";
        int contatore = numero;
        int quadrato;
        while (contatore > 1) {
            quadrato = contatore * contatore;
            testo += contatore + "\t" + quadrato + "\n";
            contatore--;
        }
        return testo;
    }

    /**
     * Restituisce i quadrati maggiori del Numero inserito
     *
     * @return
     */
    public String quadratiMaxN() {
        String testo = "Numeri" + "\t" + "Quadrato" + "\n";
        int contatore = numero;
        int quadrato;
        while (contatore < 20) {           
            quadrato = contatore * contatore;
            testo += contatore + "\t" + quadrato + "\n";
            contatore++;
        }
        return testo;
    }

    /**
     * Metodo che stampa le possibile scelte del menù
     * 
     * @return 
     */
    public String menu() {
        String testo;
        
        testo = "1 - quadrati maggiori di N" + "\n" +
                "2 - quadrati minori di N" + "\n" +
                "3 - esci da programma";
        
        return testo;
    }

    /**
     * Restituisce il valore degli attributi
     *
     * @return
     */
    public String info() {
        String testo;
        testo = "Numero: " + numero;
        return testo;
    }
}
