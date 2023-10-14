package operazioniMatematiche;

import java.util.Scanner;

public class SommaTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double n1,n2;
        
        System.out.print("Inserisci il primo numero: ");
        n1 = in.nextDouble();
       
        System.out.print("Inserisci il secondo numero: ");
        n2 = in.nextDouble();
        
        Somma som = new Somma (n1,n2);
        
        System.out.print("Dati in input: ");
        System.out.print(som.info());
        
        System.out.print("Dati di output: ");
        System.out.print("Somma: " + som.esegui());

    }
    
}
