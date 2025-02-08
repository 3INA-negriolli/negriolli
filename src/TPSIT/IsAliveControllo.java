package TPSIT;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Obiettivo: Crea un thread che dorme per 3 secondi. Nel main, verifica se il
 * thread è ancora in esecuzione usando isAlive() e stampa lo stato ogni
 * secondo. Processo: 1. Thread: Dorme per 3 secondi. 2. Main: Usa un ciclo per
 * controllare isAlive() ogni secondo e stampa "Thread in esecuzione" o "Thread
 * terminato".
 *
 * @author luca.negriolli 4INA
 * @version 1.0
 */
public class IsAliveControllo extends Thread {
    int pausa;

    public IsAliveControllo(int pausa) {
        this.pausa = pausa;
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(pausa);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
