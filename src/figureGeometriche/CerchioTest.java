package figureGeometriche;

import java.util.Scanner;

public class CerchioTest {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float raggio;
        
        
        System.out.print("Inserire il raggio: ");
        raggio = in.nextFloat();
        
        Cerchio cerchio = new Cerchio (raggio);
        
        System.out.println("Dati in input: ");
        System.out.println(cerchio.info());
        
        System.out.println("Dati di output: ");
        System.out.println("L'area del cerchio è: " + cerchio.areaCerchio());
        System.out.println("La circonferenza è: "   + cerchio.circonferenzaCerchio());
 
    }
    
}
