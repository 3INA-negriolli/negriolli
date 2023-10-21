package operazioniMatematiche;

/**
 * La classe Somma serve a sommare due numeri reali
 * @author luca.negriolli 3INA 2023
 */

public class Somma {
    public double n1;
    public double n2;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setN1(double)}<br>
     * {@link #setN2(double)}<br>
     */
    
    public Somma(){
        
    }
    
    /**
     * Costruttore con parametri
     * @param n1
     * @param n2 
     */
    
    public Somma(double n1,double n2) {
        this.n1 = n1;
        this.n2 = n2;           
    }
    
    /**
     * Restituisce il valore del primo addendo
     * @return 
     */
    
    public double getN1(){
        return n1;
    }
    
    /**
     * Imposta/modifica il valore del primo addendo
     * @param n1
     */
    
    public void setN1(){
        this.n1 = n1;
    }
    
    /**
     * Restituisce il valore del secondo addendo
     * @return 
     */
    
    public double getN2(){
        return n2;
    }
    
    /**
     * Imposta/modifica il valore del secondo addendo
     * @param n2
     */
    
    public void setN2(){
        this.n2 = n2;
    }
    
    /**
     * Restituisce il valore della somma
     * @return 
     */
    
    public double esegui(){
        double somma; 
        
        somma = n1 + n2;
        
        return somma;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    
    public String info(){
        String testo;
        
        testo = "primo numero: " + n1 + "\n"+
                "secondo numero: " + n2 + "\n";
        
        return testo;
    }
}