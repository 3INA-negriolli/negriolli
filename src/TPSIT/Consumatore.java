package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class Consumatore implements Runnable {

    private String nome;
    private Semaforo pieno;
    private Semaforo vuoto;

    public Consumatore(String nome, Semaforo pieno, Semaforo vuoto) {
        this.nome = nome;
        this.pieno = pieno;
        this.vuoto = vuoto;
    }

    @Override
    public void run() {

        int i = 0;

        while (i < 10) {
            pieno.P();
            //inizio sezione critica
            ProduttoreTest.buffer = i;
            System.out.println("Consumatore: " + i);
            //fine sezione critica
            vuoto.V();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            i++;
        }
    }
}
