package cicli;

import java.util.Arrays;
import java.util.Scanner;

public class SuperEnalottoArrayTest {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeriGiocati[] = new int[6];
        int numeriGenerati[] = new int[6];
        
        for (int i = 0; i < 6; i++) {
            numeriGenerati[i] = (int) ((Math.random() * 99) + 1);
        }
        
        for(int i = 0; i < 6; i++){
            System.out.println("Inserire un numero: ");
            numeriGiocati[i] = in.nextInt();
        }
        
        SuperEnalottoArray se = new SuperEnalottoArray();
        
        System.out.println(se.verificaVittoria());
        
        
         
         
        
        
        
    }
    
}
