package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class ProduttoreTest {
    public static int buffer;
    
    public static void main(String[] args) {
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        
        Thread p = new Thread(new Produttore("Produttore",pieno,vuoto));
        Thread c = new Thread(new Consumatore("Consumatore",pieno,vuoto));
        
        p.start();
        c.start();
    }
    
}
