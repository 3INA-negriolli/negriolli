package teoria;

import java.util.Scanner;

public class AlunniTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String c = "";
        String n = "";
        int dim = 0;
        int scelta;
        boolean verifica = true;
        int index = 0;

        Alunni a = new Alunni(dim, index);
        do {
            System.out.println(a.menu());
            
            System.out.println("Inserire la scelta: ");
            scelta = Integer.parseInt(in.nextLine());

            switch (scelta) {
                case 1:
                    System.out.println("Inserire il numero di Studenti: ");
                    a.setDim(Integer.parseInt(in.nextLine()));
                    break;
                case 2:
                    if(a.Inserisci(n, c)){
                    System.out.println("Inserire il nome e il cognome dello studente: ");
                    n = in.nextLine();
                    c = in.nextLine();
                    a.Inserisci(n, c);
                    }
                    break;
                case 3:
                    a.ricercaCognomi();
                    break;
                case 4:
                    verifica = false;
            }

        } while (verifica);

    }

}
