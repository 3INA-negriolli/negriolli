package figureGeometriche;

import java.util.Scanner;

public class TriangoloGenericoTest {

    
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        
        float l1, l2, l3;
        
        System.out.println("Inserire il valore del primo lato: ");
        l1 = in.nextFloat();
        
        System.out.println("Inserire il valore del secondo lato: ");
        l2 = in.nextFloat();
        
        System.out.println("Inserire il valore del terzo lato: ");
        l3 = in.nextFloat();
        
        TriangoloGenerico t = new TriangoloGenerico(l1, l2, l3);
        
        t.setUnitaMisura("m");
        
        System.out.println(t.info());
        System.out.println("Il perimetro è: " + t.perimetro()+ " " + t.getUnitaMisura());
        System.out.println("L'area è:       " + t.area());
        System.out.println("Il triangolo è: " + t.tipo());
        System.out.println("Il triangolo è: " + t.tipo1());
        System.out.println("Il triangolo è: " + t.tipo2());
        
        String testo;
        testo = t.IlTriangoloPossibile()? "si" : "no";
        
        System.out.println(testo);
    }
}