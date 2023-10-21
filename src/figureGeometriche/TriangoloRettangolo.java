package figureGeometriche;

/**
 * La classe TriangoloRettangolo serve per calcolare perimetro e area di un triangolo rettangolo
 * @author luca.negriolli 3INA 2023
 * @version 1.0
 */

public class TriangoloRettangolo {
    private double base;
    private double altezza;
    private double lato;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setAltezza(double)}<br>
     * {@link #setBase(double)}<br>
     * {@link #setLato(double)}<br>
     */
    
    public TriangoloRettangolo(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param base
     * @param altezza
     * @param lato 
     */
    
    public TriangoloRettangolo(double base, double altezza,double lato) {
        this.base    = base;
        this.altezza = altezza;
        this.lato    = lato;
    }
    
    /**
     * Restituisce il valore della base
     * @return 
     */
    
    public double getBase(){
        return base;
    }
    
    /**
     * Imposta/modifica il valore della base
     * @param base 
     */
    
    public void setBase(double base){
        this.base = base;
    }
    
    /**
     * Restituisce il valore dell'altezza
     * @return 
     */
    
    public double getAltezza(){
        return altezza;
    }
    
    /**
     * Imposta/modifica il valore dell'altezza
     * @param altezza 
     */
    
    public void setAltezza(double altezza){
        this.altezza = altezza;
    }
    
    /**
     * Restituisce il valore del lato
     * @return 
     */
    
    public double getLato(){
        return lato;
    }
    
    /**
     * Imposta/modifica il valore della lato
     * @param lato 
     */
    
    public void setLato(double lato){
        this.lato = lato;
    }
    
    /**
     * Restituisce il valore del perimetro
     * @return 
     */
    
    public double perimetro(){
        double perimetro;
        
        perimetro = base + altezza + lato;
        
        return perimetro;
    }
    
    /**
     * Restituisce il valore dell'area
     * @return 
     */
    
    public double area(){
        double area;
        
        area = base*altezza/2;
        
        return area;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    
    public String info(){
        String testo;
        
        testo = "base: "    + base       + "\n" +
                "altezza: " + altezza    + "\n" + 
                "lato: "    + lato       + "\n";
                
        return testo;
    }
}
