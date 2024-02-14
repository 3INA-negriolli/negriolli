package cicli;

import java.util.Scanner;

public class QuadratiCorrezioneTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n;
        System.out.println("Inserire il numero: ");
        n = in.nextInt();
        
        QuadratiCorrezione q = new QuadratiCorrezione();
        
        System.out.println(q.potenze());
        
    }
    
}
