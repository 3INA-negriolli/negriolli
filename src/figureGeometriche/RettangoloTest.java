package figureGeometriche;

import java.util.Scanner;

public class RettangoloTest {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float altezza;
        float base;
        float area;
        float perimetro;
        
        System.out.print("Inserire la base: ");
        base = in.nextFloat();
        
        System.out.print("Inserire l'altezza: ");
        altezza = in.nextFloat();
        
        Rettangolo rettangolo = new Rettangolo (base,altezza);
        
        altezza = rettangolo.altezza;
        base = rettangolo.base;
        area = rettangolo.areaRettangolo();
        perimetro = rettangolo.perimetroRettangolo();
        
        System.out.println("Base: " + base);
        System.out.println("Altezza: " + altezza);
        System.out.println("Perimetro del rettangolo: " + perimetro);
        System.out.println("Area del rettangolo: " + area);
        
   
    }
    
}
