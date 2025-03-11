package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class A implements Runnable{

    private final Object lock;

    public A(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("A");
                    lock.notify();
                    lock.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

