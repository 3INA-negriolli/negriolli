package TPSIT;

/**
 * Obiettivo: Crea due thread che stampano messaggi con pause diverse. Il thread
 * principale deve aspettare che entrambi i thread terminino prima di stampare
 * "Fine programma". Processo: 1. Thread 1: Stampa "Thread 1 in esecuzione" e
 * dorme per 2 secondi 2. Thread 2: Stampa "Thread 2 in esecuzione" e dorme per
 * 1 secondo 3. Usa join() nel main per aspettare che entrambi i thread
 * terminino.
 *
 * @author luca.negriolli
 */
public class Pause extends Thread {
    private String messaggio;
    private int pausa;

    public Pause(String messaggio, int pausa) {
        this.messaggio = messaggio;
        this.pausa = pausa;
    }

    @Override
    public void run() {
        try {
            System.out.println(messaggio);
            Thread.sleep(pausa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}