package TPSIT;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luca.negriolli
 */
public class Produttore implements Runnable {

    private String nome;
    private Semaforo pieno;
    private Semaforo vuoto;

    public Produttore(String nome, Semaforo pieno, Semaforo vuoto) {
        this.nome = nome;
        this.pieno = pieno;
        this.vuoto = vuoto;
    }

    @Override
    public void run() {

        int i = 0;

        while (i < 10) {
            vuoto.P();
            //inizio sezione critica
            ProduttoreTest.buffer = i;
            System.out.println("Produttore: " + i);
            //fine sezione critica
            pieno.V();
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            i++;
        }
    }

}
