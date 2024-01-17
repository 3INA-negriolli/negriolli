package cicli;

import java.util.Scanner;

public class Cicli {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String testo;
        
        //precondizionali
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserire il testo: ");
            testo = in.nextLine();
            System.out.println(testo);
        }
        */
        /////////
        /*
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
        */
        
        int numero = 1;
        
        do {
            System.out.println("Inserisci un numero: ");
            numero = in.nextInt();
        } while (numero != 0);
        
            
        }
        
    }
    

