package cicli;

import java.util.Scanner;

public class VettoreNewTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nPosizioni = 2;
        int posizione = 7;
        int valore;
        int dim = 10;
        int vett[] = new int[dim];

        VettoreNew v1 = new VettoreNew(vett);

        /*
        v1.caricaVettoreRandom();
        v1.ordinaVettore();
        System.out.println(v1.visualizzaVettore());
        
        System.out.println("Inserisci il valore da rimuovere: ");
        valore = in.nextInt();
        
        v1.rimuoviElementoPerValore(valore);
        System.out.println(v1.visualizzaVettore());
        
        
        v1.modificaElemento(posizione, valore);
        System.out.println(v1.visualizzaVettore());
        v1.rimuoviElementoPerPosizione(posizione);
        System.out.println(v1.visualizzaVettore());
         */
        
        v1.caricaVettoreRandom();
        v1.ordinaDecrescente();
        System.out.println(v1.visualizzaVettore());
        v1.shiftDx(nPosizioni);
        System.out.println(v1.visualizzaVettore());
    }

}
