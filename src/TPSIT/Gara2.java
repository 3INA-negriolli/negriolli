package TPSIT;

import java.util.Random;

/**
 * Si vuole realizzare un programma che simula una corsa dove sei ciclisti si
 * sfidano nella volata finale, visualizzando sullo schermo l'avanzamento di
 * ogni concorrente fino a che tutti giungono al traguardo e la classifica
 * finale.
 *
 * @author luca.negriolli 4INA
 * @version 1.0
 */
public class Gara2 extends Thread{
    private int traguardo = 50;
    private String nome;
    private int distanzaPercorsa = 0;
    private int posizione = 1;

    public Gara2(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (distanzaPercorsa < traguardo) {
            distanzaPercorsa += r.nextInt(4) + 1;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(posizione + ". " + nome);
        posizione++;
    }
}
