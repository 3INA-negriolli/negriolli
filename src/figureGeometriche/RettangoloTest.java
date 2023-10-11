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
        
        altezza =   rettangolo.altezza;
        base =      rettangolo.base;
        area =      rettangolo.areaRettangolo();
        perimetro = rettangolo.perimetroRettangolo();
         
        System.out.printf("Base                    : %.2f\n ", base);
        System.out.printf("Altezza                 : %.2f\n ", altezza);
        System.out.printf("Perimetro del rettangolo: %.2f\n ", perimetro);
        System.out.printf("Area del rettangolo     : %.2f\n ", area);
    }
    
}
