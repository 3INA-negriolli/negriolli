package teoria;

/**
 * Classe che calcola la tabellina di un numero inserito in input
 * @author luca.negriolli 2023 3INA
 * @version 1.0
 */
public class Tabellina {
    private int n;

    /**
     * Costruttore senza parametri 
     * {@link #setNumero(int)}<br>
     */
    public Tabellina() {
    }

    /**
     * Costruttore con i parametri
     * @param n
     */
    public Tabellina(int n) {
        this.n = n;
    }

    /**
     * Restituisce il valore del numero inserito
     * @return
     */
    public int getNumero() {
        return n;
    }

    /**
     * Imposta/ Modifica il valore del numero
     * @param n 
     */
    public void setNumero(int n) {
        this.n = n;
    }
    
    /**
     * Metodo che restituisce la tabellina del numero richiesto in input
     * @return 
     */
    public String tabellina(){
        String testo = "";
        int i = 1;
        int risultato ;
        while(i<11){
            risultato = n * i;
            testo +=  n + "*" + i + " è uguale a " + risultato + "\n";
            i++;
        }
        return testo;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return String
     */
    public String info() {
        String testo;
        testo = "il n è: " + n;
        return testo;
    }
}
