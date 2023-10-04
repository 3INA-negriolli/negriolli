package figureGeometriche;

import java.util.Scanner;

public class TriangoloScalenoTest {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float lato1;
        float lato2;
        float lato3;
        float semiperimetro;
        float perimetro;
        float area;
        
        
        System.out.print("Inserire il primo lato: ");
        lato1 = in.nextFloat();
        
        System.out.print("Inserire il secondo lato: ");
        lato2 = in.nextFloat();
        
        System.out.print("Inserire il terzo lato: ");
        lato3 = in.nextFloat();
        
        TriangoloScaleno triangoloscaleno = new TriangoloScaleno (lato1,lato2,lato3);
        
        lato1 = triangoloscaleno.lato1;
        lato2 = triangoloscaleno.lato2;
        lato3 = triangoloscaleno.lato3;
        semiperimetro = triangoloscaleno.semiperimetroTriangolo();
        perimetro = triangoloscaleno.perimetroTriangolo();
        area = triangoloscaleno.areaTriangolo();
        
        System.out.println("Lato1: " + lato1);
        System.out.println("Lato2: " + lato2);
        System.out.println("Lato3: " + lato3);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Semiperimetro: " + semiperimetro);
        System.out.println("Area: " + area);
        
    }
    
}
