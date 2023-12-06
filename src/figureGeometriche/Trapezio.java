package figureGeometriche;

/**
 * La classe Trapezio serve per calcolare area e perimetro del trapezio
 * @author luca,negriolli 3INA 2023
 * @version 1.0
 */

public class Trapezio {
    private double latoObliquo;
    private double baseM;
    private double baseMi;
    private double altezza;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setLatoObliquo(double)}<br>
     * {@link #setBaseM(double)}<br>
     * {@link #setBaseMi(double)}<br>
     * {@link #setAltezza(double)}<br>
     */
    
    public Trapezio(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param latoObliquo
     * @param baseM
     * @param baseMi
     * @param altezza 
     */
    
    public Trapezio(double latoObliquo,double baseM,double baseMi, double altezza) {
        this.latoObliquo = latoObliquo;
        this.baseM = baseM;
        this.baseMi = baseMi;
        this.altezza = altezza;
    }
    
    /**
     * Restituisce il valore del lato obliquo
     * @return 
     */
    
    public double getLatoObliquo(){
        return latoObliquo;
    }
    
    /**
     * Imposta/modifica il valore del lato obliquo
     * @param latoObliquo 
     */
    
    public void setLatoObliquo(double latoObliquo){
        this.latoObliquo = latoObliquo;
    }
    
    /**
     * Restituisce il valore della base maggiore
     * @return 
     */
    
    public double getBaseM(){
        return baseM;
    }
    
    /**
     * Imposta/modifica il valore della base maggiore
     * @param baseM 
     */
    
    public void setBaseM(double base){
        this.baseM = baseM;
    }
    
    /**
     * Restituisce il valore della base minore
     * @return 
     */
    
    public double getBaseMi(){
        return baseMi;
    }
    
    /**
     * Imposta/modifica il valore della base minore
     * @param baseMi 
     */
    
    public void setBaseMi(double baseMi){
        this.baseMi = baseMi;
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
     * Restituisce il valore del perimetro
     * @return 
     */
    
    public double perimetro(){
        double perimetro;
        
        perimetro = baseM + baseMi + altezza + (2*latoObliquo);
        
        return perimetro;
        
    }
    
    /**
     * Restituisce il valore dell'area
     * @return 
     */
    
    public double area(){
        double area;
        
        area = ((baseM + baseMi)*altezza)/2;
                
        return area;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    
    public String info(){
        String testo;
        
        testo = "base maggiore: " + baseM         + "\n"  +
                "base minore: "   + baseMi        + "\n"  +
                "lato obliquo: "  + latoObliquo   + "\n"  +
                "altezza: "       + altezza       + "\n";
        
        return testo;
    }
}
