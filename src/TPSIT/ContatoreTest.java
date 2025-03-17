package TPSIT;

public class ContatoreTest {

    public static void main(String[] args) {
        Contatore[] threads = new Contatore[10]; // Array per memorizzare i 10 thread

        // Creazione e avvio dei 10 thread
        for (int i = 0; i < 10; i++) {
            threads[i] = new Contatore();
            threads[i].start();
        }

        // Attesa che tutti i thread terminino
        for (int i = 0; i < 10; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Valore finale del contatore: " + Contatore.getValore());
    }
    
}
