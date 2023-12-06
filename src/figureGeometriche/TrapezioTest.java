package figureGeometriche;

import java.util.Scanner;

public class TrapezioTest {

   
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double bM,bMi,lO,h;
        
        System.out.print("Base maggiore: ");
        bM = in.nextDouble();
        
        System.out.print("Base minore: ");
        bMi = in.nextDouble();
        
        System.out.print("Lato obliquo: ");
        lO = in.nextDouble();
        
        System.out.print("Altezza: ");
        h = in.nextDouble();
        
        Trapezio trap = new Trapezio(bM,bMi,lO,h);
        
        System.out.print("Dati in input: ");
        System.out.print(trap.info());
        
        System.out.print("Dati in output: ");
        System.out.print("Perimetro: " + trap.perimetro());
        System.out.print("Area: " + trap.area());
        
        
    }
    
}
