package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class MioThreadTest {

    public static void main(String[] args) {
        System.out.println("Main: Inizio esecuzione.");
// Creazione dei thread con tempi di pausa diversi
        MioThread thread1 = new MioThread("Thread-1", 500); // 500ms
        MioThread thread2 = new MioThread("Thread-2", 300); // 300ms
        MioThread thread3 = new MioThread("Thread-3", 700); // 700ms

        //Avvio dei Thread
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            System.out.println("Main: Attendo la terminazione di Thread - 1");
            thread1.join();
            System.out.println("Main: Attendo la terminazione di Thread - 2");
            thread2.join();
            System.out.println("Main: Thread-1 ha terminato.");
        } catch (InterruptedException e) {
            System.out.println("Main: Interrotto durante l'attesa di Thread - 1");
            e.printStackTrace();
        }
    }
}
