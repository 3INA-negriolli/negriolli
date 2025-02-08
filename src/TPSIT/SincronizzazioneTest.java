package TPSIT;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SincronizzazioneTest {

    public static void main(String[] args) {
        Sincronizzazione thread1 = new Sincronizzazione("Thread 1");
        Sincronizzazione thread2 = new Sincronizzazione("Thread 2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Gara terminata!");
    }

}
