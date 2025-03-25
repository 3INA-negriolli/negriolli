package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class MerendaTest {

    public static void main(String[] args) {
        Merenda a = new Merenda("Marco");
        Merenda b = new Merenda("Matteo");
        Merenda c = new Merenda("Bolo");
        
        a.start();
        b.start();
        c.start();
    }

}
