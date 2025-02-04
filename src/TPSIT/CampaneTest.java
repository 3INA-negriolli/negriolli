package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class CampaneTest {

    public static void main(String[] args) {
        Campane campana1 = new Campane("Din", 1000); // suona
        Campane campana2 = new Campane("Don", 1500); // suona
        Campane campana3 = new Campane("Dan", 2000); // suona
        Campane campana4 = new Campane("HIHIHA", 1500); // suona

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
