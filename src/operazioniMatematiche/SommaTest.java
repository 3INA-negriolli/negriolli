package operazioniMatematiche;

import java.util.Scanner;

public class SommaTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float s;
        float n1;
        float n2;
        
        System.out.print("Inserisci il primo numero: ");
        n1 = in.nextFloat();
       
        System.out.print("Inserisci il secondo numero: ");
        n2 = in.nextFloat();
        
        Somma somma = new Somma (n1,n2);
        
        n1 = somma.n1;      
        n2 = somma.n2;
        s = somma.esegui();
        
        System.out.println("numero1: "+ somma.n1);
        System.out.println("numero2: "+ somma.n2);
        System.out.println("somma: "+ s);
    }
    
}
