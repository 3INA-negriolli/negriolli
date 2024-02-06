package teoria;

import java.util.Scanner;

public class IndovinaTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valore = 0;

        do {

            int numero = (int) Math.random() * 10 + 1;

            int a;
            int scelta;

            System.out.print("Inserire il Numero: ");
            a = in.nextInt();

            Indovina i = new Indovina();

            System.out.print(i.continuo(numero, a));

            System.out.print("\n Vuoi continuare? (1 = si, 0 = no)");
            scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    System.out.print("Inserire il Numero: ");
                    a = in.nextInt();
                    break;
                case 0:
                    valore = 1;
                    break;
                default:
                    System.out.print("Scelta non Valida!");
                    break;

            }

        } while (valore == 0);

    }

}
