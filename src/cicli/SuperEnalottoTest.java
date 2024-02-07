package cicli;

import java.util.Scanner;
import java.util.Random;
        
public class SuperEnalottoTest {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int totNumeri = 9;
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
              
        System.out.print(SuperEnalotto.confronto(n1,n2,n3,n4,n5,n6));         
    }
    
}
