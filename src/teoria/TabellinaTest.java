package teoria;

import java.util.Scanner;

public class TabellinaTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Inserire il valore del numero: ");
        numero = in.nextInt();
        
        Tabellina t1 = new Tabellina(numero);
        
        System.out.println(t1.tabellina());
        System.out.println(t1.pari());
        System.out.println(t1.nCifre());
        System.out.println(t1.fattoriale());
        
    }
}
