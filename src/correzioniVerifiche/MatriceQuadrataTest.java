package correzioniVerifiche;

import java.util.Arrays;
import java.util.Scanner;

public class MatriceQuadrataTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        MatriceQuadrata mQ1 = new MatriceQuadrata(4);
        
        mQ1.caricaRandom();
        System.out.println(mQ1.visualizza());
        mQ1.ordinaPerRiga();
        System.out.println(mQ1.visualizza());
    }
    
}
