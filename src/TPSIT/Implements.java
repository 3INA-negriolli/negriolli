package TPSIT;

/**
 *
 * @author Utente
 */
public class Implements implements Runnable {

    private int inizio = 0;
    private int fine = 30;
    private static final Object LOCK = new Object();

    public Implements(int inizio, int fine) {
        this.inizio = inizio;
        this.fine = fine;
    }

    @Override
    public void run() {
        synchronized (LOCK) {
            for (int i = inizio; i <= fine; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.err.println("Thread interrotto");
                }
            }
        }
    }

}
