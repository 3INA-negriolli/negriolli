package figureGeometriche;

/**
 * La classe TriangoloScaleno serve a calcolare area,perimetro e semiperimetro di un triangolo scaleno
 * @author Utente
 */

public class TriangoloScaleno {
    public double lato1;
    public double lato2;
    public double lato3;
    
    /**
     * Costruttore senza parametri<br>
     * {@link #setLato1(double)}<br>
     * {@link #setLato2(double)}<br>
     * {@link #setLato3(double)}<br>
     */
    
    public TriangoloScaleno(){
        
    }
    
    /**
     * Costruttore con i parametri
     * @param lato1
     * @param lato2
     * @param lato3 
     */
    
    public TriangoloScaleno(double lato1, double lato2, double lato3){
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }
    
    /**
     * Restituisce il valore del primo lato
     * @return 
     */
    
    public double getLato1(){
        return lato1;
    }
    
    /**
     * Imposta/modifica il valore del primo lato
     * @param lato1 
     */
    
    public void setLato1(double lato1){
        this.lato1 = lato1;
    }
    
    /**
     * Restituisce il valore del secondo lato
     * @return 
     */
    
    public double getLato2(){
        return lato2;
    }
    
    /**
     * Imposta/modifica il valore del secondo lato
     * @param lato2 
     */
    
    public void setLato2(double lato2){
        this.lato2 = lato2;
    }
    
    /**
     * Restituisce il valore del terzo lato
     * @return 
     */
    
    public double getLato3(){
        return lato3;
    }
    
    /**
     * Imposta/modifica il valore del terzo lato
     * @param lato3 
     */
    
    public void setLato3(double lato3){
        this.lato3 = lato3;
    }
    
    /**
     * Restituisce il valore del perimetro
     * @return 
     */
    
    public double perimetroTriangolo() {
        double perimetro;
        
        perimetro = lato1+lato2+lato3;
        
        return perimetro;
    }
    
    /**
     * Restituisce il valore del semiperimetro
     * @return 
     */
    
    public double semiperimetroTriangolo() {
        double p = perimetroTriangolo();
        
        double semiperimetro;
        
        semiperimetro = p/2;
        
        return semiperimetro;
    }
    
    /**
     * Restituisce il valore dell'area
     * @return 
     */
    
    public double areaTriangolo() {
        double sp = semiperimetroTriangolo();
        
        double area;
        
        area = Math.sqrt ((sp*(sp - lato1)*(sp - lato2)*(sp - lato3)));
        
        return area;
    }
    
    /**
     * Restituisce il valore dell'altezza
     * @return 
     */
    
    public double altezzaTriangolo() {
        double altezza;
        
        double a = areaTriangolo(); 
        
        altezza = (a*2)/lato1;
        
        return altezza;
    }
    
    /**
     * Restituisce il valore degli attributi
     * @return 
     */
    
    public String info(){
        String testo;
        
        testo = "Primo lato: "   + lato1 + "\n" +
                "Secondo lato: " + lato2 + "\n" +
                "Terzo lato: "   + lato3 + "\n";       
        
        return testo;
    }
      
}
