package verifica;

/**
 * Classe che serve a risolvere un'equazione di secondo grado del tipo ax^2+bx+c=0 
 * @author Luca Negriolli 3INA 2023
 */
public class EquazioneSecondoGrado {
    private double a;
    private double b;
    private double c;
    private double d;
    
    /**
     * Costruttore senza parametri
     */
    public EquazioneSecondoGrado() {
        
    }
    
    /**
     * Costruttore con parametri
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public EquazioneSecondoGrado(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * Metodo che visualizza il valore della variabile a
     * @return 
     */
    public double getA() {
        return a;
    }
    
    /**
     * Metodo che imposta/modifica il valore della variabile a
     * @param a 
     */
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
    
    public String info(){
        String testo;
        
        testo = "a vale: " + a + "\n"+
                "b vale: " + b + "\n"+
                "c vale: " + c + "\n"+
                "d vale: " + d + "\n";
        
        return testo;
    }
    
    public double soluzioniX1(){
        String esito;
        double x1 = 0;
        d = Math.pow(b, 2) - 4*a*c;
        
        if(d > 0)
            x1 = (-b + Math.sqrt(d))/2;
            
        if(d == 0)
            x1 = -b/(2*a);
        
        if(d < 0)
            esito = "Equazione impossibile nei numeri Reali";
        
        return x1;
        }
    
    public double soluzioniX2(){
        String esito;
        double x2 = 0;
        d = Math.pow(b, 2) - 4*a*c;
        
        if(d > 0)
            x2 = (-b - Math.sqrt(d))/2;
            
        if(d == 0)
            x2 = -b/(2*a);
        
        if(d < 0)
            esito = "Equazione impossibile nei numeri Reali";
        
        return x2;
    }
}
    
    
    
    
    
    

