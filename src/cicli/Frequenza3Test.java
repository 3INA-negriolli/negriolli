package cicli;

import java.util.Formatter;
import java.util.Random;


public class Frequenza3Test {

     public static String frequenza(){
        Formatter f = new Formatter();
        
        Random r = new Random();
        
        String testo = "N. - FA - FR - FP\n";
                
        int totNumeri = 10000;
        
        int nNumeri = 9;
        
        int contatore = 0;
       
        
        for(int i = 1; i <= nNumeri; i++){
                contatore = r.nextInt(totNumeri);
            
            
            double fR = (double)contatore/totNumeri;
            double fP = fR*100;
            
            f.format("%d   %2d  %4.2f  %5.2f\n", i, contatore, fR, fP);
        }
        
        testo += f;
        
        return testo;
    }
   
    public static void main(String[] args) {
        System.out.println(Frequenza3Test.frequenza());
    }
    
}
