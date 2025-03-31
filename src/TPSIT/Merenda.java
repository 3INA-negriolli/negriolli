package TPSIT;

import java.util.Random;
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
public class Merenda implements Runnable {

    private String nome;
    private int posizione = 0;
    private static final int TRAGUARDO = 100;
    private static boolean merendaPreso = false;

    public Merenda(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        System.out.println("E' partito " + nome); //Stampa che la persona è partita
        Random random = new Random();

        while (!merendaPreso) {
            int passo = random.nextInt(10) + 1; //Fa random metri
            posizione += passo; //Memorizzo di volta in volta i metri che fa
            System.out.println(nome + " ha avanzato di " + passo + " metri. Totale: " + posizione + "m"); //Restituisco le informazioni

            if (posizione >= TRAGUARDO && !merendaPreso) {
                merendaPreso = true;
                System.out.println(nome + " ha preso la merenda!");
                break;
            }

            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
