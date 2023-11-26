package operazioniMatematiche;

import java.util.Scanner;

public class Equazione1Test {
    

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float a,b,x = 0;
        
        System.out.print("Inserire a: ");
        a = in.nextFloat();
        
        System.out.print("Inserire b: ");
        b = in.nextFloat();
        
        Equazione1 eq = new Equazione1(x,a,b);
        
        System.out.println("Dati in input");
        System.out.print(eq.info());
        
        System.out.println("Dati di output: ");
        System.out.println("x vale: " + eq.equazionePossibile());
        System.out.println(eq.equazioneImpossibileIndeterminata());
    }
}
