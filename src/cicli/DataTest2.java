package cicli;

import java.util.Scanner;

public class DataTest2 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a;
        int m;
        int g;
        
        System.out.println("Inserire il giorno, il mese e l'anno: ");
        a = in.nextInt();
        m = in.nextInt();
        g = in.nextInt();
        
        Data d = new Data(g,m,a);
                
        System.out.println("La data è: ");
        System.out.println(d.info());
        System.out.println("L'anno è bisestile: " + d.isBisestile());
        
    }
    
}
