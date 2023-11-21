package numero;

/**
 * Costruire una classe che, dato un numero intero, stabilisca se è pari o dispari e se è maggiore, minore o uguale a 0.
 * @author dennis.faes 3INA 2023
 * @version 1.0
 */
public class Numero1 {
    private int n1;
    
    /**
     * costruttore senza parametri <br>
     * {@link #setNumero1 } <br>
     */
    public Numero1 (){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param n1 n1
     */
    public Numero1 (int n1){
        this.n1 = n1;
    }
    
    /**
     * Restituisce il valore del primo numero
     * @return 
     */
    public int getNumero1 (){
        return n1;
    }
    
    /**
     * Imposta/modifica il valore del primo numero
     * @param n1 n1
     */
    public void setNumero1 (int n1){
        this.n1 = n1;
    }
    
    /**
     * Metodo che restituisce come risultato se il numero e pari o è dispari
     * @return 
     */
    public String pariDispari (){
        String esito;
        
        if (n1%2 == 0){
            esito = "pari";
        } else {
            esito = "dispari";
        }
        return esito;
    }
    
    /**
     * Metodo che restituisce come risultato se il numero è maggiore, minore o uguale a 0
     * @return 
     */
    public String maggioreMinoreUguale (){
        String esito;
        if (n1 > 0){
            esito = "maggiore";
        } else if (n1 == 0) {
            esito = "uguale a 0";
        } else {
            esito = "minore";
        }
        return esito;
    }
    
    /**
     * Metodo che restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String info;
        info = "Il valore del primo numero è: " + n1;
        return info;
    }
    
}
