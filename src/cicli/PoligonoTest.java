package cicli;

import correzioniVerifiche.*;
import java.util.Scanner;

public class PoligonoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int nLati;
        float lunghezza;
        /*
        System.out.println("Inserire il valore del numero dei lati:      ");
        nLati = in.nextInt();
        
        System.out.println("Inserire il valore della lunghezza del lato: ");
        lunghezza = in.nextFloat(); 
        
        Poligono pl = new Poligono(nLati, lunghezza);
        
        System.out.println("Dati di input: " + pl.info());
        
        System.out.println(pl.isPoligono());
        System.out.println(pl.perimetro());
        */
        
        Poligono p = new Poligono();
        
        do {
            System.out.print("Inserire in numero di lati: ");
            nLati = in.nextInt();
            
            System.out.println("Inserire la lunghezza del lato");
            lunghezza = in.nextFloat();
            p.setLato(lunghezza);
            p.setNumeroLati(nLati);
            
            if (!p.isPoligono())
                System.out.println("Dati errati, reinserire!");
        } while(!p.isPoligono());
    }
}
    
