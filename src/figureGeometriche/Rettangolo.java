package figureGeometriche;

/**
 * La classe Rettangolo serve per misurare l'area ed il perimetro di un rettangolo
 * @author luca.negriolli 3INA 2023
 * @version 1.0
 */

public class Rettangolo {
    public float base;
    public float altezza;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setAltezza(float)}<br>
     * {@link #setBase(float)}<br>
     */
    
    public Rettangolo(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param base
     * @param altezza 
     */
    
    public Rettangolo (float base, float altezza) {
        this.altezza = altezza;
        this.base = base;
    }
    
    /**
     * Restituisce il valore della base
     * @return 
     */
    
    public float getBase(){
        return base;
    }
    
    /**
     * Imposta/modifica il valore della base
     * @param base 
     */
    
    public void setBase(float base){
        this.base = base;
    }
    
    /**
     * Restituisce il valore dell'altezza
     * @return 
     */
    
    public float getAltezza(){
        return altezza;
    }
    
    /**
     * Imposta/modifica il valore dell'altezza
     * @param altezza 
     */
    
    public void setAltezza(){
        this.altezza = altezza;
    }
    
    /**
     * Restituisce il valore dell'area
     * @return 
     */
    
    public float areaRettangolo() {
        float area;
        area = base*altezza;
        return area;
    }
    
    /**
     * Restituisce il valore del perimetro
     * @return 
     */
    
    public float perimetroRettangolo(){
        float perimetro;
        perimetro = (base*2) + (altezza*2);
        return perimetro;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    
    public String info(){
        String testo;
        
        testo = "Base: "    + base    + "\n" +
                "Altezza: " + altezza + "\n";
        
        return testo;
    }
    
}
