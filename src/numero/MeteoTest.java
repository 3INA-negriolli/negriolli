package numero;

import java.util.Scanner;

public class MeteoTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float temperatura;
        
        System.out.print("Inserire la Temperatura: ");
        temperatura = in.nextFloat();
        
        Meteo m1 = new Meteo(temperatura);
        
        System.out.println("Dati in input:");
        System.out.print(m1.info());
        
        System.out.println("Dati di output:");
        System.out.println("Metodo 1: " + m1.Consiglio1());
        System.out.println("Metodo 2: " + m1.Consiglio2());
        System.out.println("Metodo 3: " + m1.Consiglio3());
        System.out.println("Metodo 4: " + m1.Consiglio4()); 
    }
    
}
