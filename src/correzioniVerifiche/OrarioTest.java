package correzioniVerifiche;


import correzioniVerifiche.Orario;
import java.util.Scanner;

public class OrarioTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int ore = 0;
        int minuti = 0;
        int secondi = 0;
        int ore1 = 0;
        int minuti1 = 0;
        int secondi1 = 0;
        
        System.out.println("Inserire le ore: ");
        ore = in.nextInt();
        
        System.out.println("Inserire i minuti: ");
        minuti = in.nextInt();
        
        System.out.println("Inserire i secondi: ");
        secondi = in.nextInt();
        
        Orario o = new Orario(ore,minuti,secondi);
        
        System.out.println("L'orario è: " + o.info());
        System.out.println("L'orario in secondi vale: " + o.calcolaSecondi());
        System.out.println("L'orario in minuti vale: " + o.calcolaMinuti());
        System.out.println("L'orario in ore vale: " + ore);
        
        System.out.println("Inserire le ore del secondo orario: ");
        ore1 = in.nextInt();
        
        System.out.println("Inserire i minuti del secondo orario: ");
        minuti1 = in.nextInt();
        
        System.out.println("Inserire i secondi del secondo orario: ");
        secondi1 = in.nextInt();
        
        System.out.println("La differenza in secondi tra il primo orario e il secondo vale: " + o.diffOrario(ore1, minuti1, secondi1));
        
    }
    
}
