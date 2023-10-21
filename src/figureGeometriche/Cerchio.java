package figureGeometriche;

/**
 * La classe Cerchio serve per misurare la circonferenza e l'area di un cerchio
 * @author luca.negriolli 3INA 2023
 * @version 1.0
 */

public class Cerchio {
    public float raggio;
    
    /**
     * Costruttore senza parametri
     * {@link #setRaggio(float)}<br>
     */
    
    public Cerchio(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param raggio 
     */
    
    public Cerchio (float raggio){
        this.raggio = raggio;
    }
    
    /**
     * Restituisce il valore del raggio
     * @return 
     */
    
    public float getRaggio(){
        return raggio;
    }
    
    /**
     * Imposta/modifica il valore del raggio
     * @param raggio 
     */
    
    public void setRaggio(float raggio){
        this.raggio = raggio;
    }
    
    /**
     * Restituisce il valore dell'area
     * @return 
     */
    
    public float areaCerchio(){
        float area;
        area = 3.14f*(raggio*raggio);
        return area;    
    }
    
    /**
     * Restituisce il valore della circonferenza
     * @return 
     */
    
    public float circonferenzaCerchio(){ // funzione per calcolare la circonferenza
        float circonferenza;
        circonferenza = 2*3.14f*raggio;
        return circonferenza;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    
    public String info(){
        String testo;
        
        testo = "Raggio: " + raggio;
        
        return testo;
    }
    
}
