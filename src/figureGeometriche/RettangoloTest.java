package figureGeometriche;

import java.util.Scanner;

public class RettangoloTest {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float base, altezza;
        
        System.out.print("Inserire la base: ");
        base = in.nextFloat();
        
        System.out.print("Inserire l'altezza: ");
        altezza = in.nextFloat();
        
        Rettangolo ret = new Rettangolo (base,altezza);
        
        System.out.println("Dati in input: ");
        System.out.println(ret.info());
         
        System.out.printf("Dati di output: \n");
        System.out.printf("Perimetro del rettangolo: %.2f\n ", ret.perimetroRettangolo());
        System.out.printf("Area del rettangolo    : %.2f\n " ,  ret.areaRettangolo());
    }
    
}
