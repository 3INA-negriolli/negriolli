package TPSIT;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SincronizzazioneTest {

    public static void main(String[] args) {
        Sincronizzazione thread1 = new Sincronizzazione("Thread 1"); // Creazione dei thread
        Sincronizzazione thread2 = new Sincronizzazione("Thread 2");

        // Avviamento dei thread
        thread1.start();
        thread2.start();

        // Gestione Eccezioni
        try {
            thread1.join(); // Attesa termine del thread
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Gara terminata!");
    }

}
