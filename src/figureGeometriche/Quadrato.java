package figureGeometriche;

/**
 * La classe Quadrato serve per calcolare l'area e il perimetro di un quadrato
 * @author luca.negriolli 3INA 2023
 * @version 1.0
 */

public class Quadrato {
    public float l;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setL(float)}<br>
     */
    
    public Quadrato(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param l 
     */
    
    public Quadrato (float l) {
        this.l = l;
    }
    
    /**
     * Restituisce il valore del lato
     * @return 
     */
    
    public float getL(){
        return l;
    }
    
    /**
     * Imposta/modifica il valore del lato
     */
    
    public void setL(){
        this.l = l;
    }
    
    /**
     * Restutisce il valore dell'area 
     * @return 
     */
    
    public float calcolaArea (){
        float area;
        area = l*l;
        return area;
    }
    
    /**
     * Restituisce il valore del perimetro
     * @return 
     */
    
    public float calcolaPerimetro(){
        float perimetro;
        perimetro = l+l+l+l;
        return perimetro;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    
    public String info(){
        String testo;
        
        testo = "Lato: " + l;
        
        return testo;
    }
    
 }
