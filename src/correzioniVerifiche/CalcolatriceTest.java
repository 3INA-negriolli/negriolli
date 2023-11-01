package correzioniVerifiche;

import java.util.Scanner;

public class CalcolatriceTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float n1,n2;
        
        System.out.print("Inserire il valore del primo numero: ");
        n1 = in.nextFloat();
        
        System.out.print("Inserire il valore del secondo numero: ");
        n2 = in.nextFloat();
        
        Calcolatrice calc = new Calcolatrice(n1,n2);
        
        System.out.println("Dati in input: ");
        System.out.print(calc.info());
        
        System.out.printf("Dati di output                          :\n");
        System.out.printf("La somma vale                           : %.2f\n", calc.somma());
        System.out.printf("La sottrazione vale                     : %.2f\n", calc.sottrazione());
        System.out.printf("La moltiplicazione vale                 : %.2f\n", calc.moltiplicazione());
        System.out.printf("La divisione vale                       : %.2f\n", calc.divisione());
        System.out.printf("La radice quadrata del primo numero vale: %.2f\n", calc.radQuad());
        System.out.printf("L'arrotondamento vale                   : %.2f\n", calc.valoreArrotondato());
        System.out.printf("La potenza vale                         : %.2f\n", calc.potenza());
        calc.setValAssN1(n1);
        calc.setValAssN2(n2);
        System.out.println(calc.info());
    }
    
}
