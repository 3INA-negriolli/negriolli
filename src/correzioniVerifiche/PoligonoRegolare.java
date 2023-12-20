package correzioniVerifiche;

/**
 * Classe che serve a calcolare il perimetro di un poligono regolare in base al numero di lati.
 * @author luca.negriolli 3INA 2023
 * @version 1.0
 */
public class PoligonoRegolare {
    private int nLati;
    private float l;
    private String tipo;

    /**
     * Costruttore senza parametri
     */
    public PoligonoRegolare() {
        
    }
    
    /**
     * Costruttore con parametri
     * @param nLati
     * @param l 
     */
    public PoligonoRegolare(int nLati, float l, String tipo) {
        this.nLati = nLati;
        this.l = l;
        this.tipo = tipo;
    }
    
    /**
     * Metodo get della variabile nLati
     * @return 
     */
    public int getnLati() {
        return nLati;
    } 
    
    /**
     * Metodo set della variabile nLati
     * @param nLati 
     */
    public void setnLati(int nLati) {
        this.nLati = nLati;
    }
  
    /**
     * Metodo get della variabile l
     * @return 
     */
    public float getLatoMaggiore() {
        return l;
    }
    
    /**
     * Metodo set della variabile l
     * @param l 
     */
    public void setLatoMaggiore(float l) {
        this.l = l;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Metodo che visualizza i dati in input
     * @return 
     */
    public String info(){
        String testo;
        
        testo = "Il numero di lati è: " + nLati + "\n" +
                "Il valore del lato è: " + l + "\n";
        
        return testo;
    }
    
    public boolean isPoligono(){
        boolean esito = false;
        
        if((nLati >= 3) && (nLati <= 6))
            esito = true;
        
        return esito;
    }
    
    /**
     * Metodo che serve a capire in base al numero di lati di che tipo di poligono regolare si tratta
     * @return 
     */
    public String tipoPoligono(){
        if(isPoligono() == false)
                tipo = "poligono non in elenco...";
        else
        switch(nLati){
            case 3:
                tipo = "triangolo";
                break;
            case 4:
                tipo = "quadrato";
                break;
            case 5:
                tipo = "pentagono";
                break;
            case 6:
                tipo = "esagono";
                break;
        }
            return tipo;  
    }
    
    /**
     * Metodo che serve a calcolare il perimetro del poligono regolare in base al suo numero di lati
     * @return 
     */
    public float calcolaPerimetro(){
        float p = 0;
        
        p = l * nLati;
        
        return p;
    }

}


