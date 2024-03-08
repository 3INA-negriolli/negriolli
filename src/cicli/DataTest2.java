package cicli;

import java.util.Scanner;

public class DataTest2 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a;
        int m;
        int g;
        int giorno;
        int mese;
        int anno;
        
        System.out.println("Inserire il giorno, il mese e l'anno: ");
        a = in.nextInt();
        m = in.nextInt();
        g = in.nextInt();
        
        System.out.println("Inserire il giorno, il mese e l'anno della seconda data: ");
        anno = in.nextInt();
        mese = in.nextInt();
        giorno = in.nextInt();
        
        Data2 d = new Data2(g,m,a,giorno,mese,anno);
                
        System.out.println("La prima data è: ");
        System.out.println(d.info());
        System.out.println("La seconda data è: ");
        System.out.println(d.info2());
        System.out.println("La differenza è: " + d.distanzaGiorni());
        
    }
    
}
