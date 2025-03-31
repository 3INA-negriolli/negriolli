package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class MerendaTest {

    public static void main(String[] args) {
        Thread a = new Thread(new Merenda("Carlo"));
        Thread b = new Thread(new Merenda("Matilde"));
        Thread c = new Thread(new Merenda("Francesco"));
        
        a.start();
        b.start();
        c.start();
    }

}
