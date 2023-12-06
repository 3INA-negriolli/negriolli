package correzioniVerifiche;

/**
 * La classe Calcolatrice serve a sommare,sottrarre,moltiplicare o dividere due numeri, permette anche di farne la radice quadrata
 * @author luca.negriolli 3INA 2023
 * @version 1.0
 */

public class Calcolatrice {
    
    public float n1;
    public float n2;
    
    /**
     * Costruttore senza parametri
     */
    
    public Calcolatrice(){
        
    }
    
    /**
     * Costruttore con parametri
     * @param n1
     * @param n2 
     */
    
    public Calcolatrice(float n1, float n2){
        this.n1 = n1;
        this.n2 = n2; 
    }
    
    /**
     * Restituisce e mi permette di visualizzare il valore dell'attributo n1
     * @return 
     */
    
    public float getN1(){
        return n1;
    }
    
    /**
     * Imposta/modifica il valore dell'attributo n1
     * @param n1 
     */
    
    public void setN1(float n1){
        this.n1 = n1;
    }
    
    /**
     * Restituisce e mi permette di visualizzare il valore dell'attributo n2
     * @return 
     */
    
    public float getN2(){
        return n2;
    }
    
    /**
     * Imposta/modifica il valore dell'attributo n2
     * @param n2 
     */
    
    public void setN2(float n2){
        this.n2 = n2;
    }
    
    /**
     * Restituisce la somma tra i due numeri
     * @return 
     */
    
    public float somma(){
        float som;
        
        som = n1 + n2;
        
        return som;
    }
    
    /**
     * Restituisce la sottrazione tra i due numeri
     * @return 
     */
    
    public float sottrazione(){
        float sott;
        
        sott = n1- n2;
        
        return sott;
    }
    
    /**
     * Restituisce la moltiplicazione tra i due numeri
     * @return 
     */
    
    public float moltiplicazione(){
        float moltp;
        
        moltp = n1 *n2;
        
        return moltp;
    }
    
    /**
     * Restituisce la divisione tra i due numeri
     * @return 
     */
    
    public float divisione(){
        float div;
        
        div = n1 / n2;
        
        return div;
    }
    
    /**
     * Restituisce il valore della radice del primo numero 
     * @return 
     */
    
    public float radQuad(){
        float rad;
        
        rad = (float) Math.sqrt(n1);
        
        return rad;
    }
    
    /**
     * Imposta il valore assoluto del primo numero
     * @param n1 
     */
    
    public void setValAssN1(float n1){
        this.n1 = Math.abs(n1);
    }
    
    /**
     * Imposta il valore assoluto del secondo numero
     * @param n2 
     */
    
    public void setValAssN2(float n2){
        this.n2 = Math.abs(n2);
    }
    
    /**    
     * @return Restituisce il valore arrotondato del secondo numero
     */
    
    public double valoreArrotondato(){
        double arrotonda = Math.round(n2);
        
        return arrotonda;
    }  
    
    /**     
     * @return Restituisce la potenza di n1 elevato a n2
     */
    
    public double potenza(){
        double potenza = Math.pow(n1, n2);
        
        return potenza;
    }  
           
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    
    public String info(){
        String testo;
        
        testo = "Il valore del primo numero è: "   + n1 + "\n" +
                "Il valore del secondo numero è: " + n2 + "\n";
                
        return testo;
    }
    
}
