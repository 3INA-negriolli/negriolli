package figureGeometriche;

import java.util.Scanner;

public class QuadratoTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float lato;
        float area;
        float perimetro;
        
        System.out.print("Inserire il lato: ");
        lato = in.nextFloat();
        
        Quadrato quadrato = new Quadrato (lato);
        
        lato = quadrato.l;
        area = quadrato.calcolaArea();
        perimetro = quadrato.calcolaPerimetro();
        
        System.out.println("lato: " + lato);
        System.out.println("area del quadrato: " + area);
        System.out.println("perimetro del quadrato: " + perimetro);
    }
    
}
