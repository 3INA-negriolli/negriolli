package numero;

import java.util.Scanner;

public class NumeroTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n1,n2;
        
        System.out.print("Inserire il primo numero: ");
        n1 = in.nextInt();
        
        System.out.print("Inserire il secondo numero: ");
        n2 = in.nextInt();
        
        Numero n = new Numero(n1,n2);
        
        System.out.println("Dati in input: ");
        System.out.print(n.info());
        
        System.out.println("Dati in output: ");
        System.out.println("La differenza vale: " + n.differenza());
        
    }
    
}
