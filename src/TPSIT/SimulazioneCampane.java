package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class SimulazioneCampane {

    public static void main(String[] args) {
        Campana campana1 = new Campana("Din", 1000); // suona
        Campana campana2 = new Campana("Don", 1500); // suona
        Campana campana3 = new Campana("Dan", 2000); // suona
        Campana campana4 = new Campana("HIHIHA", 1500); // suona

        campana1.start();
        campana2.start();
        campana3.start();
        campana4.start();

        try {
            // Attendere che tutti i thread terminino in ordine
            campana1.join(); // Attende che il thread campana1 termini

            campana2.join(); // Attende che il thread campana2 termini

            campana3.join(); // Attende che il thread campana3 termini

            campana4.join(); // Attende che il thread campana4 termini

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
