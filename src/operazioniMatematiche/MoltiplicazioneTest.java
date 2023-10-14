package operazioniMatematiche;

import java.util.Scanner;

public class MoltiplicazioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float n1, n2;
        
        System.out.print("Inserisci il primo numero: ");
        n1 = in.nextFloat();
       
        System.out.print("Inserisci il secondo numero: ");
        n2 = in.nextFloat();
        
        Moltiplicazione mol = new Moltiplicazione (n1,n2);
        
        System.out.println("Dati in input: ");
        System.out.print(mol.info());
        
        System.out.println("Dati di output: ");
        System.out.print("Moltiplicazione: " + mol.esegui());
    }
    
}


