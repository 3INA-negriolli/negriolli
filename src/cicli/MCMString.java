package cicli;

/**
 * 
 * @author luca.negriolli 3INA 2024
 * @version 1.0
 */
public class MCMString {

    private String num;

    public MCMString() {
    }

    public MCMString(String num) {
        this.num = num;
    }

    public String getNumeri() {
        return num;
    }

    public void setNumeri(String num) {
        this.num = num;
    }
    
    public int mcm(){
        int mcm = 0;
        
        String [] Numeri = this.num.split(",");//separo i singoli numeri, e come elementodi separazione metto la virgola
        
        int [] vetNumeri = new int [Numeri.length];
        for(int i = 0; i < Numeri.length; i++){
            vetNumeri[i] = Integer.parseInt(Numeri[i]); //converto in intero da stringa i singoli elementi dell'array
        }
        
        return mcm;
    }
    
}