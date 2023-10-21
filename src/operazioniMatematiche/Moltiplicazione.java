package operazioniMatematiche;

/**
 * La classe Moltiplicazione serve a moltiplicare due numeri reali
 * @author luca.negriolli 3INA 2023
 * @version 1.0
 */

public class Moltiplicazione {
    public float n1;
    public float n2;
    
    /**
     * Costruttore senza parametri<br> 
     * {@link #setN1(float)}<br>
     * {@link #setN2(float)}<br>
     */
    
    public Moltiplicazione(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param n1
     * @param n2 
     */
    
    public Moltiplicazione(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    /**
     * Restituisce il valore del primo fattore
     * @return 
     */
    
    public float getN1(){
        return n1;
    }
    
    /**
     * Imposta/modifica il valore del primo fattore
     * @param n1 
     */
    
    public void setN1(float n1){
        this.n1 = n1;
    }
    
    /**
     * Restituisce il valore del secondo fattore
     * @return 
     */
    
    public float getN2(){
        return n2;
    }
    
    /**
     * Imposta/modifica il valore del secondo fattore
     * @param n2 
     */
    
    public void setN2(float n2){
        this.n2 = n2;
    }
    
    /**
     * Restituisce il valore della moltiplicazione
     * @return 
     */
    
    public float esegui(){
        float moltiplicazione;
        
        moltiplicazione = n1 * n2;
        
        return moltiplicazione;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    
    public String info(){
        String testo;
        
        testo = "primo numero: "   + n1 + "\n"+
                "secondo numero: " + n2 + "\n";
        
        return testo;
    }
     

            
}
