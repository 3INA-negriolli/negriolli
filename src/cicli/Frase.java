package cicli;

/**
 *
 * @author luca.negriolli
 */
public class Frase {
    String testo;

    public Frase() {
    }

    public Frase(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }
    
    public String info(){
        String testo;
        
        testo = "Il nome è: " + this.testo + "\n";
        
        return testo;
    }
    
    public String creaFrase(int n){
        String testo = "";
        
        for (int i = 0; i < 10; i++) {
            testo += this.testo + "\n"; 
        }
        
        return testo;
    }
    
    
}
