package TPSIT;

/**
 * Crea una classe che estende Thread e calcola la somma di numeri in un
 * intervallo definito (ad esempio, da 1 a 100).
 *
 * @author luca.negriolli
 */
public class SommaNumeri extends Thread {

    private int intervallo;

    public SommaNumeri(int intervallo) {
        this.intervallo = intervallo;
    }

    @Override
    public void run() {
        int i = 0;
        int somma = 0;
        
        for (i = 0; i < intervallo; i++) {
            somma += i;
        }
        System.out.println(somma);

    }

}
