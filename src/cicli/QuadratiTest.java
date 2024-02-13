package cicli;

import java.util.Scanner;

public class QuadratiTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;
        int menu;
        boolean verifica = true;

        do {
            do {
                System.out.println("Inserire un numero da 1 a 20: ");
                numero = in.nextInt();
            } while ((numero <= 0) || (numero > 20));

            Quadrati q1 = new Quadrati(numero);

            System.out.println(q1.menu());
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.println(q1.quadratiMaxN());
                    break;
                case 2:
                    System.out.println(q1.quadratiMinN());
                    break;
                case 3:
                    verifica = false;
                    break;
                default:
                    System.out.println("Il numero non è corretto");
            }
        } while (verifica);
    }
}
