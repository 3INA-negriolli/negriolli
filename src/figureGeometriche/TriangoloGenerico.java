package figureGeometriche;


/**
 * dati i lati di un triangolo, stabilire il tipo, perimetro e area
 * inoltre verificare se è possibile costruire un triangolo
 * Un triangolo é possibile solo se la lunghezza di ciascun lato è maggiore della somma delle altre due
 * @author negriolli.luca 3INA 2023
 * @verion 1.0
 */
public class TriangoloGenerico {
    public float l1, l2 ,l3;

    /**
     * Costruttore senza parametri <br>
     * {@link #setL1(float) }      <br>
     * {@link #setL2(float) }      <br>
     * {@link #setL3(float) }      <br>
     */
    public TriangoloGenerico() {
    }

    /**
     * Costruttore con i parametri
     * @param l1
     * @param l2
     * @param l3
     */
    
    public TriangoloGenerico(float l1, float l2, float l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    /**
     * Metodo che restituisce il valore del primo lato
     * @return 
     */
    public float getL1() {
        return l1;
    }

    /**
     * Imposta/Modifica il valore del primo lato
     * @param l1 l1
     */
    public void setL1(float l1) {
        this.l1 = l1;
    }

    /**
     * Metodo che restituisce il valore del secondo lato
     * @return 
     */
    public float getL2() {
        return l2;
    }

    /**
     * Imposta/Modifica il valore del primo lato
     * @param l2 l2
     */
    public void setL2(float l2) {
        this.l2 = l2;
    }

    /**
     * Metodo che restituisce il valore del terzo lato
     * @return 
     */
    public float getL3() {
        return l3;
    }

    /**
     * Imposta/Modifica il valore del primo lato
     * @param l3 l3
     */
    public void setL3(float l3) {
        this.l3 = l3;
    }
    
    /**
     * Metodo che restituisce il valore degli attributi
     * @return 
     */
    public String info(){
        String info;
        info = "lato 1: " + l1 + "\n" +
               "lato 2: " + l1 + "\n" +
               "lato 3: " + l1 + "\n";
        return info;
    }
    
    /**
     * Metodo che calcola il valore del perimetro del triangolo
     * @return 
     */
    public float perimetro(){
        float perimetro;
        perimetro = l1 + l2 + l3;
        return perimetro;
    }
    
    /**
     * Metodo che restituisce il valore del semiperimetro del triangolo
     * @return 
     */
    private float semiPerimetro(){
        float semiPerimetro;
        semiPerimetro = perimetro()/2;
        return semiPerimetro;
    }
    
    /**
     * Metodo che restituisce il valore dell'area del triangolo
     * @return 
     */
    public float area(){
        float area;
        float sP = semiPerimetro();
        area = (float) Math.sqrt(sP*(sP-l1)*(sP-l2)*(sP-l3));
        return area;
    }
    
    /**
     * Medoto che restituisce il tipo di triangolo
     * @return 
     */
    public String tipo(){
        String tipo = "";
        if ((l1 == l2)&&(l2 == l3))
            tipo = "equilatero";
        if ((l1 == l2 && l2 != l3)||(l1 == l3 && l1 != l2)||(l2 == l3 && l3 != l1)) 
            tipo = "isoscele";
        if ((l1 != l2) && (l2 != l3) && (l1 != l3)) 
            tipo = "scaleno";
        return tipo;
    }
    
    public String tipo1(){
        String tipo;
        if ((l1 == l2)&&(l2 == l3)){
            tipo = "equilatero";
        } else if ((l1 == l2 && l2 != l3)||(l1 == l3 && l1 != l2)||(l2 == l3 && l3 != l1)) {
            tipo = "isoscele";
        } else {
            tipo = "scaleno";
        }
        return tipo;
    }

    public String tipo2(){
        String tipo ;
        if ((l1 == l2)&&(l2 == l3)){
            tipo = "equilatero";
        } else {
            if ((l1 == l2 && l2 != l3)||(l1 == l3 && l1 != l2)||(l2 == l3 && l3 != l1)) {
                tipo = "isoscele";
            } else {
                tipo = "scaleno";
            }
        }
        return tipo;
    }
    
    public boolean IlTriangoloPossibile(){
        boolean possibile = false;
        if ((l1+l2 < l3) && (l2+l3 < l1) && (l1+l3 < l2)){
            possibile = true;
        }   
        return possibile;
    }
}
