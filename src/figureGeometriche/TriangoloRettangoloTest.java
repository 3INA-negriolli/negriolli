
package figureGeometriche;

import java.util.Scanner;

public class TriangoloRettangoloTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double b, a, l;
        
        System.out.print( "Base     :");
        b = in.nextDouble();
        
        System.out.print("Altezza: ");
        a = in.nextDouble();
        
        System.out.print("Lato   : ");
        l = in.nextDouble();
        
        TriangoloRettangolo t = new TriangoloRettangolo(b,a,l);
        
        System.out.println("Dati in input: ");
        System.out.print(t.info());
        
        System.out.println("Dati di output: ");
        System.out.println("Perimetro: " + t.perimetro());
        System.out.println("Area: " + t.area());
    }
    
}
