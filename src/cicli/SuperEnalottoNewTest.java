package cicli;

import java.util.Arrays;
import java.util.Scanner;

public class SuperEnalottoNewTest {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numeriGiocati[] = new int[6];                  
        
        for(int i = 0; i < 6; i++){
            System.out.println("Inserire un numero: ");
            numeriGiocati[i] = in.nextInt();
        }
        
        SuperEnalottoNew se = new SuperEnalottoNew();
        
        se.generatore();
        
        se.setNumeriGiocati(numeriGiocati);
        
        System.out.println("Combinazione Corretta: " + Arrays.toString(se.numeriGenerati));
        System.out.println("Combinazione Inserita: " + Arrays.toString(numeriGiocati));
        System.out.println(se.verificaVittoria());
                                                          
    }
    
}
