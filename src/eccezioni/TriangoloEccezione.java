package eccezioni;

/**
 * dati i lati di un triangolo, stabilire il tipo, perimetro e area inoltre
 * verificare se è possibile costruire un triangolo Un triangolo é possibile
 * solo se la lunghezza di ciascun lato è maggiore della somma delle altre due
 *
 * @author negriolli.luca 4INA 2024
 * @version 1.0
 */
public class TriangoloEccezione {

    final private float NF_TE;
    private float l1, l2, l3;
    private String unitaMisura;

    /**
     * Costruttore senza parametri <br> {@link #setL1(float) }      <br>
     * {@link #setL2(float) }      <br> {@link #setL3(float) }      <br>
     */
    public TriangoloEccezione() {
        NF_TE = 0.289f;
        unitaMisura = "";
    }

    /**
     * Costruttore con i parametri
     *
     * @param l1
     * @param l2
     * @param l3
     */
    public TriangoloEccezione(float l1, float l2, float l3) throws Exception {
        this();
        
        setL1(l1);
        setL2(l2);
        setL3(l3);
    }

    /**
     * Metodo che restituisce il valore del primo lato
     *
     * @return
     */
    public float getL1() {
        return l1;
    }

    /**
     * Imposta/Modifica il valore del primo lato e ne controlla la validità
     *
     * @param l1 l1
     */
    public void setL1(float l1) throws Exception {
        if(l1 > 0){
            this.l1 = l1;
        }else{
            throw new Exception("Lato maggiore di 0");
        }
    }

    /**
     * Metodo che restituisce il valore del secondo lato
     *
     * @return
     */
    public float getL2() {
        return l2;
    }

    /**
     * Imposta/Modifica il valore del primo lato e ne controlla la validità
     *
     * @param l2 l2
     */
    public void setL2(float l2) throws Exception {
        if(l2 > 0){
            this.l2 = l2;
        }else{
            throw new Exception("Lato maggiore di 0");
        }
    }

    /**
     * Metodo che restituisce il valore del terzo lato
     *
     * @return
     */
    public float getL3() {
        return l3;
    }

    /**
     * Imposta/Modifica il valore del primo lato e ne controlla la validità
     *
     * @param l3 l3
     */
    public void setL3(float l3) throws Exception {
        if(l3 > 0){
            this.l3 = l3;
        }else{
            throw new Exception("Lato maggiore di 0");
        }
    }

    public String getUnitaMisura() {
        return unitaMisura;
    }

    /**
     * Si occupa di vedere se la unità di misura è valida
     * @param unitaMisura
     * @throws Exception 
     */
    public void setUnitaMisura(String unitaMisura) throws Exception {
        switch(unitaMisura){
            case "m":
                this.unitaMisura = unitaMisura;
                break;
            case "cm":
                this.unitaMisura = unitaMisura;
                break;
            case "mm":
                this.unitaMisura = unitaMisura;
                break;
            default:
                throw new Exception("Inserire m o cm o mm");
        }
    }

    /**
     * Metodo che restituisce il valore degli attributi
     *
     * @return
     */
    public String info() {
        String info;
        info = "lato 1: " + l1 + "\n"
                + "lato 2: " + l2 + "\n"
                + "lato 3: " + l3 + "\n";
        return info;
    }

    /**
     * Metodo che calcola il valore del perimetro del triangolo
     *
     * @return
     */
    public float perimetro() {
        float perimetro;
        perimetro = l1 + l2 + l3;
        return perimetro;
    }

    /**
     * Metodo che restituisce il valore del semiperimetro del triangolo
     *
     * @return
     */
    private float semiPerimetro() {
        float semiPerimetro;
        semiPerimetro = perimetro() / 2;
        return semiPerimetro;
    }

    /**
     * Metodo che restituisce il valore dell'area del triangolo
     *
     * @return
     */
    public float area() {
        float area;
        float sP = semiPerimetro();
        area = (float) Math.sqrt(sP * (sP - l1) * (sP - l2) * (sP - l3));
        return area;
    }

    /**
     * Medoto che restituisce il tipo di triangolo
     *
     * @return
     */
    public String tipo() {
        String tipo = "";
        if ((l1 == l2) && (l2 == l3)) {
            tipo = "equilatero";
        }
        if ((l1 == l2 && l2 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l3 != l1)) {
            tipo = "isoscele";
        }
        if ((l1 != l2) && (l2 != l3) && (l1 != l3)) {
            tipo = "scaleno";
        }
        return tipo;
    }

    public String tipo1() {
        String tipo;
        if ((l1 == l2) && (l2 == l3)) {
            tipo = "equilatero";
        } else if ((l1 == l2 && l2 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l3 != l1)) {
            tipo = "isoscele";
        } else {
            tipo = "scaleno";
        }
        return tipo;
    }

    public String tipo2() {
        String tipo;
        if ((l1 == l2) && (l2 == l3)) {
            tipo = "equilatero";
        } else {
            if ((l1 == l2 && l2 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l3 != l1)) {
                tipo = "isoscele";
            } else {
                tipo = "scaleno";
            }
        }
        return tipo;
    }

    public boolean IlTriangoloPossibile() {
        boolean possibile = false;
        if ((l1 + l2 < l3) && (l2 + l3 < l1) && (l1 + l3 < l2)) {
            possibile = true;
        }
        return possibile;
    }

    public float apotema() {
        float a;
        //add condizione
        if (tipo().equals("equilatero")) {
            a = l1 * NF_TE;
        } else {
            a = 0;
        }

        return a;
    }

    public float altezza() {
        float altezza = 0;
        if (tipo().equals("equilatero")) {
            altezza = apotema() * 2;
        } else {
            altezza = 0;
        }

        return altezza;
    }

}
