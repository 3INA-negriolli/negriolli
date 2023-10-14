package figureGeometriche;

import java.util.Scanner;

public class QuadratoTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float l;
        
        
        System.out.print("Inserire il lato: ");
        l = in.nextFloat();
        
        Quadrato q = new Quadrato (l);
        
        System.out.println("Dati in input: ");
        System.out.println(q.info());
        
        System.out.println("Dati di output: ");
        System.out.println("Area del quadrato: " + q.calcolaArea());
        System.out.println("Perimetro del quadrato: " + q.calcolaPerimetro());
    }
    
}
