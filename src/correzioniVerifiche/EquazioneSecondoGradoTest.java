package verificaN2;

import java.util.Scanner;

public class EquazioneSecondoGradoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float a, b, c;
        
        System.out.println("Inserire il valore di a: ");
        a = in.nextFloat();

        System.out.println("Inserire il valore di b: ");
        b = in.nextFloat();
        
        System.out.println("Inserire il valore di c: ");
        c = in.nextFloat();

        EquazioneSecondoGrado e = new EquazioneSecondoGrado(a, b, c);
        
        System.out.println("Dati di input: " + e.info());

        System.out.println("Il valore del delta è: " + e.delta());
        System.out.println(e.x1());
        System.out.println(e.x2());
    }
    
}
