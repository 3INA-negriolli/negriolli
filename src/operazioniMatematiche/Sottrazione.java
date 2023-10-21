package operazioniMatematiche;

/**
 * La classe Sottrazione serve a sottrarre due numeri reali
 * @author luca.negriolli 3INA 2023
 * @version 1.0
 */

public class Sottrazione {
    public float n1;
    public float n2;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setN1(float)}<br>
     * {@link #setN2(float)}<br>
     */
    
    public Sottrazione(){
        
    }
    
    /**
     * Costruttore con parametri
     * @param n1
     * @param n2 
     */

    public Sottrazione(float n1,float n2) {
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
        return n1;
    }
    
    /**
     * Imposta/modifica il valore del seconda numero
     * @param n2 
     */
    
    public void setN2(float n2){
        this.n2 = n2;
    }
    
    /**
     * Restituisce il valore della sottrazione
     * @return 
     */
    
    public float esegui(){
        float sottrazione; 
        
        sottrazione = n1 - n2;
        
        return sottrazione;
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
