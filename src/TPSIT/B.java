package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class B implements Runnable {

    private final Object lock;

    public B(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("B");
                    lock.notify();
                    lock.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
