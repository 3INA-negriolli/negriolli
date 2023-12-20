package verifica;

import java.util.Scanner;

/**
 * Metodo main della classe EquazioneSecondoGrado
 * @author Luca Negriolli 3INA 2023
 */
public class EquazioneSecondoGradoTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double a,b,c,d;
        
        System.out.print("Inserire il valore di a: ");
        a = in.nextDouble();
        
        System.out.print("Inserire il valore di b: ");
        b = in.nextDouble();
        
        System.out.print("Inserire il valore di c: ");
        c = in.nextDouble();
        
        System.out.print("Inserire il valore di d: ");
        d = in.nextDouble();
        
        EquazioneSecondoGrado eq = new EquazioneSecondoGrado(a, b, c, d);
        
        System.out.println("Dati in input:");
        System.out.print(eq.info());
        
        System.out.println("Dati di output:");
        System.out.println("La prima soluzione vale: " + eq.soluzioniX1());
        System.out.println("La seconda soluzione vale: " + eq.soluzioniX2());
    }
    
}
