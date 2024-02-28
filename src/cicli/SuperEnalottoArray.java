package cicli;

/**
 * Classe che simula il Super Enalotto, sta volta con gli array
 *
 * @author luca.negriolli 3INA 2024
 * @version 1.0
 */
public class SuperEnalottoArray {

    int numeri[] = new int[6];

    public SuperEnalottoArray() {
    }

    public String generatore() {
        String rit = "";
        int i = 0;
        for (i = 0; i < 6; i++) {
            numeri[i] = (int) ((Math.random() * 99) + 1);
        }
        return rit;
    }
}
