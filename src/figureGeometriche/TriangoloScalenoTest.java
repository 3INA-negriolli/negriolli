package figureGeometriche;

import java.util.Scanner;

public class TriangoloScalenoTest {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double lato1, lato2, lato3;
        
        System.out.print("Inserire il valore del primo lato  : ");
        lato1 = in.nextDouble();
        
        System.out.print("Inserire il valore del secondo lato: ");
        lato2 = in.nextDouble();
        
        System.out.print("Inserire il valore del terzo lato  : ");
        lato3 = in.nextDouble();
        
        TriangoloScaleno triangoloS = new TriangoloScaleno(lato1,lato2,lato3);
        
        System.out.println("Dati in input: ");
        System.out.print(triangoloS.info());
       
        System.out.println("Dati di output: ");
        System.out.println("Area triangolo: " + triangoloS.areaTriangolo());
        System.out.println("Perimetro triangolo: " + triangoloS.perimetroTriangolo());
        System.out.println("Altezza: "            + triangoloS.altezzaTriangolo());
        
    }
    
}
