package operazioniMatematiche;

import java.util.Scanner;

public class SottrazioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float n1, n2;
        
        System.out.print("Inserisci il primo numero: ");
        n1 = in.nextFloat();
       
        System.out.print("Inserisci il secondo numero: ");
        n2 = in.nextFloat();
        
        Sottrazione sot = new Sottrazione (n1,n2);
        
        System.out.println("Dati in input: ");
        System.out.print(sot.info());
        
        System.out.println("Dati in output: ");
        System.out.print("Sottrazione: " + sot.esegui());
        
    }
    
}