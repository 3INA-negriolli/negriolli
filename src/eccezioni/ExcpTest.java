package eccezioni;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import tris.TrisCorretto;
/**
 *
 * @author luca.negriolli 4INA 2024
 */
public class ExcpTest {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){        
        Scanner in = new Scanner(System.in);
        
        String giocatoreX = "c", giocatoreO = "v";
        
        
        try {
           TrisCorretto t = new TrisCorretto(3, giocatoreX, giocatoreO);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        /*
        boolean vincita = true;
        
        while(vincita){
            System.out.print("Il campo è: " + t.info());
            int x,o;
            
            System.out.println("Inserire la posizione della riga: ");
            x = in.nextInt();
            
            System.out.println("Inserire la posizione della colonna: ");
            o = in.nextInt();
            
            String s = t.gioca(x, o);
            
            if(s.equals("X")){
                System.out.println("Il vincitore è il primo giocatore ");
                vincita = false;
            }else if (s.equals("O")){
                System.out.println("Il vincitore è il secondo giocatore ");
                vincita = false;
            }else if (s.equals("=")){
                System.out.println("Parità ");
                vincita = false;
            }else{
                System.out.println("Non ha ancora vinto nessuno");
            }
        
        
        }
        */
    }
    
}
