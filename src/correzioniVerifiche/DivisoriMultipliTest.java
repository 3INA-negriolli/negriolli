package correzioniVerifiche;

import correzioniVerifiche.DivisoriMultipli;
import java.util.Scanner;

public class DivisoriMultipliTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0;
        int m = 0;
        int scelta = 0;
        int uscita = 1;

        do {
            System.out.println(DivisoriMultipli.menu());

            System.out.println("Inserire la scelta: ");
            scelta = in.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Inserire il Numero: ");
                    n = in.nextInt();
                    break;
                case 2:
                    System.out.println("Inserire il numero di multipli da sommare: ");
                    m = in.nextInt();
                    break;
                case 3:
                    System.out.println("Il numero di divisori è: " + DivisoriMultipli.numeroDivisori(n));
                    break;
                case 4:
                    System.out.println("La somma dei multipli vale: " + DivisoriMultipli.sommaMultipli(m, n));
                    break;
                case 5:
                    System.out.println("Arrivederci e Buona Giornata!");
                    uscita = 0;
                    break;
                default:
                    System.out.println("Scelta sbagliata, reinserire");
                    break;
            }
        } while (uscita != 0);

    }

}
