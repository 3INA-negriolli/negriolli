package TPSIT;

public class Contatore extends Thread {

    private static int valore = 0; // Contatore condiviso tra tutti i thread
    private static final Object LOCK = new Object(); // Oggetto lock per sincronizzare

    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (LOCK) { // Sincronizzazione dei thread durante l'incremento
                valore++;
            }
        }
    }

    public static int getValore() {
        return valore;
    }
}
