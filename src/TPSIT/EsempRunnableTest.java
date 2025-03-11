package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class EsempRunnableTest {
    
    public static void main(String[] args) {
        EsempRunnable myRunnable = new EsempRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
    
}
