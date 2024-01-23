package cicli;

import java.util.Scanner;

public class NumeriPariEDispariTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numero;
        int menu;
        
        System.out.print("Inserire il valore del numero: ");
        numero = in.nextInt();
        
        NumeriPariEDispari n = new NumeriPariEDispari(numero);
        
        System.out.println(n.menu());
        System.out.print("Inserire il numero della decisione: ");
        menu = in.nextInt();
        
        switch(menu){
            case 1:
                System.out.println(n.primiNNumeriPari());
                break;
            case 2:
                System.out.println(n.primiNNumeriDispari());
                break;
            default:
                System.out.println("Il valore inserito è errato");
        }
    } 
}
