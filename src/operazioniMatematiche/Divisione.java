package operazioniMatematiche;

/**
 * La classe Divisione serve a dividere due numeri reali
 * @author luca.negriolli 3INA
 * @version 1.0
 */

public class Divisione {
    
    public float n1;
    public float n2;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setN1(float)}<br>
     * {@link #setN2(float)}<br>
     */
    
    public Divisione(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param n1
     * @param n2 
     */
    
    public Divisione(float n1,float n2) {
        this.n1 = n1;
        this.n2 = n2;           
    }
    
    /**
     * Restituisce il valore del primo numero
     * @return 
     */
    
    public float getN1(){
        return n1;
    }
    
    /**
     * Imposta/modifica il valore del primo numero
     * @param n1 
     */
    
    public void setN1(float n1){
        this.n1 = n1;
    }
    
    /**
     * Restituisce il valore del secondo numero
     * @return 
     */
    
    public float getN2(){
        return n2;
    }
    
    /**
     * Imposta/modifica il valore del secondo numero
     * @param n2 
     */
    
    public void setN2(float n2){
        this.n2 = n2;
    }
    
    /**
     * Restituisce il valore della divisione
     * @return 
     */
    
    public float esegui(){
        float divisione;
        
        divisione = n1 / n2;
        
        return divisione;
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
    

