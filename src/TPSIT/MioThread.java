package TPSIT;

public class MioThread extends Thread {

    private String nome;
    private int pausa; // Durata in millisecondi per il metodo sleep()

    public MioThread(String nome, int pausa) {
        this.nome = nome;
        this.pausa = pausa;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("[" + nome + "] Iterazione " + i);
            
            // Pausa del thread
            
            try {
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                System.out.println("[" + nome + "]"); // Interrotto durante lo sleep.
                e.printStackTrace();
            }
            
            // Yield: suggerimento allo scheduler di dare la CPU ad altri thread

            System.out.println("[" + nome + "] Eseguo yield...");
            Thread.yield();
        }
        System.out.println("[" + nome + "] Terminato.");
    }
}
