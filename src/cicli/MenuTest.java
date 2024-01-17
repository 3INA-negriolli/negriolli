package cicli;

import java.util.Scanner;

public class MenuTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Menu m;
        
        int valore = 0;
        int numeroLati = 0;
        float lato;
        do {

            System.out.println("MENU");
            System.out.println("1 - Costruttore senza Parametri");
            System.out.println("2 - Costruttore con Parametri");
            System.out.println("3 - Calcolare il Perimetro");
            System.out.println("4 - Per uscire dal Menù");
            
            System.out.print("Inserire il valore desiderato: ");
            valore = in.nextInt();
            
            switch (valore){
                case 1:
                    m = new Menu();
                    break;
                case 2:
                    System.out.println("Inserire il numero di lati: ");
                    numeroLati = in.nextInt();
                    
                    System.out.println("Inserire la lunghezza dei lati: ");
                    lato = in.nextFloat();
                    
                    m = new Menu(numeroLati,lato);
                    break;
                case 3:
                    System.out.println("Il perimetro vale: " + m.perimetro());
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("Scelta Errata!!");
            }
                
        } while(valore != 4);
    }
}
    
