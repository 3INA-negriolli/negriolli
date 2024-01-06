package verificaN2;

import java.util.Scanner;

public class PoligonoTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int nLati;
        float lunghezza;
        
        System.out.println("Inserire il valore del numero dei lati:      ");
        nLati = in.nextInt();
        
        System.out.println("Inserire il valore della lunghezza del lato: ");
        lunghezza = in.nextFloat(); 
        
        Poligono p = new Poligono(nLati, lunghezza);
        
        System.out.println("Dati di input: " + p.info());
        
        System.out.println(p.isPoligono());
        System.out.println(p.perimetro());
        
    }
    
}
