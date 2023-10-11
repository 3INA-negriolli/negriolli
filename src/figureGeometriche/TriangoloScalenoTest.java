package figureGeometriche;

import java.util.Scanner;

public class TriangoloScalenoTest {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double lato1;
        double lato2;
        double lato3;
        double area;
        double altezza;
        double perimetro;
        
        System.out.print("Inserire il valore del primo lato  : ");
        lato1 = in.nextDouble();
        
        System.out.print("Inserire il valore del secondo lato: ");
        lato2 = in.nextDouble();
        
        System.out.print("Inserire il valore del terzo lato  : ");
        lato3 = in.nextDouble();
        
        TriangoloScaleno triangoloS = new TriangoloScaleno(lato1,lato2,lato3);
        
        lato1     = triangoloS.lato1;
        lato2     = triangoloS.lato2;
        lato3     = triangoloS.lato3;
        area      = triangoloS.areaTriangolo();
        altezza   = triangoloS.altezzaTriangolo();
        perimetro = triangoloS.perimetroTriangolo();
        
        System.out.println("Primo lato         : " + lato1);
        System.out.println("Secondo lato       : " + lato2);
        System.out.println("Terzo lato         : " + lato3);
        System.out.println("Area triangolo     : " + area);
        System.out.println("Perimetro triangolo: " + perimetro);
        System.out.println("Altezza            : " + altezza);
        
    }
    
}
