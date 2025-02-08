package TPSIT;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Obiettivo: Simula una gara tra due thread. Ogni thread "corre" (stampa un
 * messaggio) e dorme per un tempo casuale. Il thread principale deve aspettare
 * che entrambi i thread finiscano prima di dichiarare il vincitore. Task: 1.
 * Thread 1 e Thread 2: Dormono per un tempo casuale tra 1 e 3 secondi, poi
 * stampano "Thread X ha finito!". 2. Main: Usa join() per aspettare entrambi i
 * thread e stampa "Gara terminata!".
 *
 * @author luca.negriolli 4INA
 * @version 1.0
 */
public class Sincronizzazione extends Thread {
    String nome;

    public Sincronizzazione(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        Random random = new Random();
        int pausa = 1000 + random.nextInt(2000); // Random time between 1 and 3 seconds
        try {
            Thread.sleep(pausa);
            System.out.println(nome + " ha finito!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
