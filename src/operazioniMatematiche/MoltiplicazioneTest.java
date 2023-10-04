package operazioniMatematiche;

import java.util.Scanner;

public class MoltiplicazioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float m;
        float n1;
        float n2;
        
        System.out.print("Inserisci il primo numero: ");
        n1 = in.nextFloat();
       
        System.out.print("Inserisci il secondo numero: ");
        n2 = in.nextFloat();
        
        Moltiplicazione moltiplicazione = new Moltiplicazione (n1,n2);
        
        n1 = moltiplicazione.n1;      
        n2 = moltiplicazione.n2;
        m = moltiplicazione.esegui();
        
        System.out.println("numero1: "+ moltiplicazione.n1);
        System.out.println("numero2: "+ moltiplicazione.n2);
        System.out.println("moltiplicazione: "+ m);
    }
    
}


