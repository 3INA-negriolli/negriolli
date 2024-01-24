package cicli;

import java.util.Scanner;

public class NumeriPariDispari1Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero = 0;
        int menu;
        boolean verifica = false;
        int uscita = 1;

        do {

            System.out.println(NumeriPariDispari1.menu());
            System.out.print("Inserire il numero della decisione: ");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    NumeriPariDispari1 n = new NumeriPariDispari1();
                    System.out.println("Oggetto istanziato");
                    verifica = true;
                case 2:
                    if (verifica) {
                        System.out.print("Inserire il valore del numero: ");
                        numero = in.nextInt();
                        System.out.println(NumeriPariDispari1.primiNNumeriPari(numero));
                    } else {
                        System.out.println("Per poter proseguire instanziare l'oggetto tramite 1");
                    }
                    break;
                case 3:
                    if (verifica == true) {
                        System.out.println(NumeriPariDispari1.primiNNumeriDispari(numero));
                        System.out.print("Inserire il valore del numero: ");
                        numero = in.nextInt();
                    } else {
                        System.out.println("Per poter proseguire instanziare l'oggetto tramite 1");
                    }
                    break;
                    
                case 4:
                    uscita = 0;
                    break;
                default:
                    System.out.println("Il valore inserito è errato");
            }
        }while(uscita != 0);
    
    }
}
