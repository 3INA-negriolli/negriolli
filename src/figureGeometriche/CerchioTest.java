package figureGeometriche;

import java.util.Scanner;

public class CerchioTest {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float raggio;
        float area;
        float circonferenza;
        
        System.out.print("Inserire il raggio: ");
        raggio = in.nextFloat();
        
        Cerchio cerchio = new Cerchio (raggio);
        
        raggio = cerchio.raggio;
        area = cerchio.areaCerchio();
        circonferenza = cerchio.circonferenzaCerchio();
        
        System.out.println("Il raggio è: " + cerchio.raggio);
        System.out.println("L'area del cerchio è: " + area);
        System.out.println("La circonferenza è: " + circonferenza);
              
       
    }
    
}
