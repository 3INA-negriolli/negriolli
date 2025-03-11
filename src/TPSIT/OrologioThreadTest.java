package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class OrologioThreadTest {

    public static void main(String[] args) {
        Thread threadOrologio = new Thread(new OrologioThread());
        threadOrologio.start();
    }

}
