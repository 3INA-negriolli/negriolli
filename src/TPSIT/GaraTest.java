package TPSIT;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luca.negriolli
 */
public class GaraTest {

    public static void main(String[] args) {
        Gara c1 = new Gara("Marco", 10000);
        Gara c2 = new Gara("Piero", 13000);
        

        c1.start();
        c2.start();
        
        try {
            c1.join();
            c2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
    }

}
