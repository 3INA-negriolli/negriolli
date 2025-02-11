package TPSIT;

/**
 * Supponiamo di voler simulare una gara di corsa tra tre corridori (A, B e C)
 * utilizzando thread in Java. Ogni corridore deve percorrere una certa distanza
 * e il vincitore sarà il corridore che raggiunge per primo la linea di
 * traguardo. Ogni corridore dovrebbe avere un nome e una distanza totale da
 * percorrere. Nel metodo run() di ciascun corridore, simula la corsa
 * controllando periodicamente la distanza percorsa e aggiornando lo stato del
 * corridore. Ad esempio, puoi far avanzare il corridore di una certa quantità
 * di metri in ogni iterazione e stampare il progresso. Crea un oggetto Thread
 * per ciascun corridore e avviali.
 *
 * @author luca.negriolli 4INA
 * @version 1.0
 */
public class Gara extends Thread {

    private String nomeCorridore;
    private int distanza;

    public Gara(String nomeCorridore, int distanza) {
        this.nomeCorridore = nomeCorridore;
        this.distanza = distanza;
    }

    @Override
    public void run() {

        //try catch per le eccezioni
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(distanza / 10);
                System.out.println("siamo ad " + i + " decimi della corsa");
            }

        } catch (InterruptedException e) {
            System.out.println("thread interrotto");
        }
        //quando finisce stampa ha stampa nome + ha finito

        System.out.println(nomeCorridore + " ha finito");
    }

}


