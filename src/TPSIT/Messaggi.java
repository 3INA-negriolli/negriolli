package TPSIT;

/**
 * Crea una classe che estende Thread e che, quando viene avviata, stampa un
 * messaggio ogni secondo per 5 secondi.
 *
 * @author luca.negriolli
 */
public class Messaggi extends Thread {

    private int intervallo;
    private String messaggio;

    public Messaggi(String messaggio) {
        this.messaggio = messaggio;
        this.intervallo = intervallo;
    }
    
    @Override
    public void run(){
        try {
            while (true) {
                while(intervallo != 5000){
                    System.out.println(messaggio);
                    Thread.sleep(1000);
                    intervallo += 1000;
                }
                
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    
}
