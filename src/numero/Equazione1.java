package numero;

/**
 * Classe che serve a risolvere un'equazione di primo grado del tipo ax = b
 * @author negriolli.luca 3INA 2023
 * @version 1.0
 */

public class Equazione1 {
    private float x;
    private float a;
    private float b;  

    public Equazione1() {
        
    }

    public Equazione1(float x, float a, float b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    
    public float equazionePossibile(){
        if(a > 0){
            x = b/a;
        }
        return x;
    }
    
    public String equazioneImpossibileIndeterminata(){
        String esito = " ";
        
        if(a == 0 && b == 0){
            esito = "L'equazione è indeterminata";
        }  
        
        if(a == 0 && b != 0){
            esito = "L'equazione è impossibile";
        }          
        return esito;
    }
    
    public String info(){
        String testo;
        
        testo = "a vale: " + a + "\n" +
                "b vale: " + b + "\n";
        
        return testo;
    }
}

