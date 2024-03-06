package cicli;

import java.util.Scanner;

public class DataTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int giorno, mese, anno, giorno1, mese1, anno1;
        /*
        do{
            System.out.println("Inserire il giorno: ");
            giorno = in.nextInt();
        
            System.out.println("Inserire il mese: ");
            mese = in.nextInt();
        
            System.out.println("Inserire il anno: ");
            anno = in.nextInt();
        
            Data d1 = new Data(giorno, mese, anno);
            d = d1;

            System.out.println(d1.info());
            
        }while(d.isDataValida(giorno,mese,anno) == false);
        */
        do{
            System.out.println("Inserire il giorno: ");
            giorno = in.nextInt();
        
            System.out.println("Inserire il mese: ");
            mese = in.nextInt();
        
            System.out.println("Inserire il anno: ");
            anno = in.nextInt();
            
            System.out.println("Inserire il giorno: ");
            giorno1 = in.nextInt();
        
            System.out.println("Inserire il mese: ");
            mese1 = in.nextInt();
        
            System.out.println("Inserire il anno: ");
            anno1 = in.nextInt();
            
            Data d = new Data(giorno, mese, anno);
            
            System.out.println(d.nGiorni(giorno1, mese1, anno1));
            System.out.println(d.info());
        }while(d.isDataValida() == false || d.isDataValida() == false);
        
        
    }
}
