
package cicli;

/**
 * 
 * @author luca.negriolli
 */
public class Gelataio {
    
    private int gusto;
    private int totVenduti;
    
    
    
    
    public String menu(){
        String testo;
        
        testo = "1 - Gusti" + "\n" + 
                "2 - Frequenza Relativa" + "\n" +
                "3 - Frequenza Assoluta" + "\n" + 
                "4 - Frequanza Percentuale" + "\n" +
                "5 - Totali Venduti" + "\n" +
                "6 - Esci" + "\n";
        
        return testo;
    }
    
 
    
}
