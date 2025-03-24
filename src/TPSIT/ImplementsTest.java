package TPSIT;

/**
 *
 * @author Utente
 */
public class ImplementsTest {

    public static void main(String[] args) {
        Implements stampa1 = new Implements(1, 10);
        Implements stampa2 = new Implements(11, 20);
        Implements stampa3 = new Implements(21, 30);

        Thread thread1 = new Thread(stampa1);
        Thread thread2 = new Thread(stampa2);
        Thread thread3 = new Thread(stampa3);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.err.println("Thread interrotto durante il join");
        }
    }

}
