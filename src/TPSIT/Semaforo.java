package TPSIT;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luca.negriolli
 */
public class Semaforo {

    private int valore;

    public Semaforo(int valore) {
        this.valore = valore;
    }

    synchronized public void P() {
        while (valore == 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
        valore--;
    }

    synchronized public void V() {
        valore++;
        notify();
    }

}
