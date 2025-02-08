package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class PauseTest {

    public static void main(String[] args) {
        Pause thread1 = new Pause("Thread 1 in esecuzione", 2000);
        Pause thread2 = new Pause("Thread 2 in esecuzione", 1000);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fine programma");
    }

}
