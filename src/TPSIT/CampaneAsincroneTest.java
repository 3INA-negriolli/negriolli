package TPSIT;

/**
 *
 * @author Utente
 */
public class CampaneAsincroneTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new CampaneAsincrone("Ding"));
        Thread t2 = new Thread(new CampaneAsincrone("Dong"));
        Thread t3 = new Thread(new CampaneAsincrone("Dang"));

        t1.start();
        t2.start();
        t3.start();
    }

}
