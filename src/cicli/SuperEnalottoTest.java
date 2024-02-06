package cicli;

import java.util.Scanner;
import java.util.Random;
        
public class SuperEnalottoTest {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int totNumeri = 9;
        int numero1 = r.nextInt(totNumeri);
        int numero2 = r.nextInt(totNumeri);
        int numero3 = r.nextInt(totNumeri); 
        int numero4 = r.nextInt(totNumeri);
        int numero5 = r.nextInt(totNumeri);
        int numero6 = r.nextInt(totNumeri);
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        
        System.out.print("Inserire i 6 numeri, buona fortuna!!");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        n4 = in.nextInt();
        n5 = in.nextInt();
        n6 = in.nextInt();
        
        SuperEnalotto sp1 = new SuperEnalotto(n1,n2,n3,n4,n5,n6);
        
        System.out.print(sp1.confronto(numero1, numero2, numero3, numero4, numero5, numero6));      
    }
    
}
