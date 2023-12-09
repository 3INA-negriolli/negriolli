package biglietto;

import java.util.Scanner;

public class BigliettoFerroviarioTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float tariffa;
        String ruolo;
        
        System.out.print("Inserire la tariffa: ");
        tariffa = in.nextFloat();
        
        System.out.print("Inserire il ruolo: ");
        ruolo = in.nextLine();
        ruolo = in.nextLine();
        
        BigliettoFerroviario bf = new BigliettoFerroviario(tariffa,ruolo);
        
        System.out.println("Dati in input: ");
        System.out.println(bf.info());
        
        System.out.println("Dati di output: ");
        System.out.println("Ecco il costo del biglietto scontato: " + bf.costoBiglietto() + "€");
        
    }
    
}
