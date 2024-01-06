package verificaN2;

/**
 * Scrivere una classe che, dato in ingresso il numero n dei lati di un poligono
 * regolare (con n compreso tra 3 e 6) e la lunghezza l del lato maggiore di 0 (zero),
 * stabilire di che tipo di poligono si tratta e calcolarne il perimetro.
 * @author luca.negriolli 3INA 2023
 * @version 1.0
 */

public class Poligono {
    private int nLati;
    private float lunghezza;

    /**
     * Costruttore senza parametri  <br>
     * {@link #setnLati(int)}       <br>
     * {@link #setLunghezza(float)} <br>
     */
    
    public Poligono() {
    }

    /**
     * Costruttore con i parametri
     * @param nLati
     * @param lunghezza 
     */
    
    public Poligono(int nLati, float lunghezza) {
        this.nLati = nLati;
        this.lunghezza = lunghezza;
    }

    /**
     * Restituisce il valore del numero dei lati
     * @return 
     */
    
    public int getNLati() {
        return nLati;
    }

    /**
     * Modifixca/Imposta il numero dei lati
     * @param nLati nLati
     */
    
    public void setNLati(int nLati) {
        this.nLati = nLati;
    }

    /**
     * Restituisce il valore della lunghezza del lato
     * @return 
     */
    
    public float getLunghezza() {
        return lunghezza;
    }

    /**
     * Imposta/Modifica il valore della lunghezza del lato
     * @param lunghezza lunghezza
     */
    
    public void setLunghezza(float lunghezza) {
        this.lunghezza = lunghezza;
    }
    
    /**
     * Metodo che indica il tipo di poligono
     * @return 
     */
    
    public String isPoligono (){
        String testo;
        switch (nLati) {
            case 3:
                testo = "Il poligono é un triangolo equilatero";
                break;
            case 4:
                testo = "Il poligono é un quadrato";
                break;
            case 5:
                testo = "Il poligono é un pentagono";
                break;
            case 6:
                testo = "Il poligono é un esagono";
                break;
            default:
                testo = "Il poligono non è possibile";
        }
        return testo;
    }
    
    /**
     * Metodo che restituisce il valore del perimetro
     * @return 
     */
    
    public String perimetro(){
        String testo;
        float perimetro;
        if ((nLati >= 3) && (nLati <= 6) && (lunghezza > 0)){
            perimetro = lunghezza*nLati;
            testo = "Il perimetro é: " + perimetro;
        } else {
            testo = "Il perimetro non é possibile";
        }
        return testo;
    }
    
    /**
     * Metodo che restituisce il valore degli attributi
     * @return 
     */
    
    public String info(){
        String testo;
        testo = "\n" + "Numero lati: " + nLati +
                "\n" + "Lunghezza lato: " + lunghezza;
        return testo;
    }
    
}
