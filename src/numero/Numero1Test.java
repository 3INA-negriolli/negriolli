package numero;

import java.util.Scanner;

public class Numero1Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numero1;
        
        System.out.println("Inserire un numero: ");
        numero1 = in.nextInt();
        
        Numero1 n = new Numero1(numero1);
        
        System.out.println("I dati di input sono: ");
        System.out.println(n.info());
        
        System.out.println("I dati di output sono: ");
        System.out.println(n.info());
        System.out.println("Il numero è: " + n.pariDispari());
        System.out.println("Il numero rispetto a 0 é: " + n.maggioreMinoreUguale());
    }
    
}
