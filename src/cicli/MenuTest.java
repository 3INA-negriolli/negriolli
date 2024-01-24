package cicli;

import java.util.Scanner;

public class MenuTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Menu m = null;
        int valore = 0;
        int numeroLati = 0;
        float lato;
        boolean istanza = false;
        boolean set = false;

        do {

            System.out.println("MENU");
            System.out.println("1 - Costruttore senza Parametri");
            System.out.println("2 - Costruttore con Parametri");
            System.out.println("3 - Visualizzazione valore Lato");
            System.out.println("4 - Inserimento valore lato");
            System.out.println("5 - Visualizzazione valore perimetro");
            System.out.println("6 - Saluti");
            System.out.println("7 - Uscita");

            System.out.print("Inserire il valore desiderato: ");
            valore = in.nextInt();

            switch (valore) {
                case 1:
                    m = new Menu();
                    istanza = true;
                    break;
                case 2:
                    System.out.println("Inserire il numero di lati: ");
                    numeroLati = in.nextInt();

                    System.out.println("Inserire la lunghezza dei lati: ");
                    lato = in.nextFloat();

                    m = new Menu(numeroLati, lato);
                    istanza = true;
                    set = true;
                    break;
                case 3:
                    System.out.println(m.getLato());
                case 4:
                    System.out.println("Inserire il numero di lati: ");
                    numeroLati = in.nextInt();
                    m.setLato(numeroLati);
                    break;
                case 5:
                    if (istanza && set && m.isPoligono()) {
                        System.out.println(m.perimetro());
                    }else{
                        System.out.println("Dati errati, reinserire");
                    }
                    break;
                case 6:
                    System.out.println("Arrivederci e Buona Giornata");
                    break;
                case 7:
                    valore = 4;
                    break;
                default:
                    System.out.println("Scelta Errata!!");
            }

        } while (valore != 4);
    }
}
