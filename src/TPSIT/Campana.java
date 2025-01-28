package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class Campana extends Thread {

    private String nomeCampana;
    private int intervallo;

    public Campana(String nomeCampana, int intervallo) {
        this.nomeCampana = nomeCampana;
        this.intervallo = intervallo;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(nomeCampana);
                Thread.sleep(intervallo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
    }
}
