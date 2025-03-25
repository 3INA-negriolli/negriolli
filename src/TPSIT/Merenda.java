package TPSIT;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Realizzare un programma che simuli la corsa alla merenda di tre bambini
 * (Carlo, Matilde e Francesco) facendo avanzare casualmente la posizione di
 * ciascuno di essi (tra 1 e 10) e verificando se viene raggiunto il traguardo:
 * il primo che raggiunge i 100m mangia la merenda. Alla partenza stampare ad
 * esempio “E' partirto Carlo!!!”. Ogni volta che un bambino avanza si deve
 * stampare il nome del bambino e la quantità di passi totali che ha effettuato.
 * Dopo ogni spostamento il bambino si riposa e viene visualizzato il seguente
 * messaggio: “non ho finito, ma mi riposo un attimo !”. Quando un bambino ha
 * preso la merenda e cioè ha superato i 100m viene visualizzato ad esempio
 * “Carlo ha preso la merenda!!!”.
 *
 * @author luca.negriolli
 */
public class Merenda extends Thread {

    private String nome;
    private int distanzaPercorsa = 0;
    private final int TRAGUARDO = 100;

    public Merenda(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        while (distanzaPercorsa < TRAGUARDO) {
            try {
                Thread.sleep(100);
                distanzaPercorsa += (int) Math.random() * 9 + 1;
                System.out.println(nome + " ha percorso " + distanzaPercorsa + "m");
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

}
