package TPSIT;

/**
 * Campane asincrone Lo scopo di questo esercizio è di creare tre thread che
 * simulino ognuno il suono di una campana ed osservare come, a causa della
 * schedulazione e dai processi thread che al momento sono nella lista dei
 * processi pronti, l’output può variare. Possiamo dunque osservare un esempio
 * di modalità non deterministica.
 *
 * @author luca.negriolli
 */
public class CampaneAsincrone implements Runnable {

    private String suono;

    public CampaneAsincrone(String suono) {
        this.suono = suono;
    }

    @Override
    public void run() { 
        for (int i = 0; i < 5; i++) { // Ogni campana suona 5 volte
            System.out.print(suono + " ");
            try {
                Thread.sleep((int) (Math.random() * 1000)); // Ritardo casuale
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
