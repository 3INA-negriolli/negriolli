package numero;

import java.util.Scanner;

public class Numero2Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n1;
        
        System.out.println("Inserire un numero: ");
        n1 = in.nextInt();
                
        Numero2 n = new Numero2(n1);
        
        System.out.println("Il numero è " + n.positivoNegativoUgualeAZero());
        System.out.println("Il numero è " + n.positivoNegativoUgualeAZero1());
        System.out.println("Il numero è " + n.positivoNegativoUgualeAZero2());
        System.out.println("Il numero è " + n.positivoNegativoUgualeAZero3());
    }    
}
