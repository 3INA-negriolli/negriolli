package cicli;

import java.util.Scanner;

/**
 *
 * @author luca.negriolli
 */
public class TemperatureTest {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float[] temperature = new float[7];
        String[] giorni = new String[]{"Lunedi","Martedi","Mercoledi","Giovedi","Venerdi","Sabato","Domenica"};
        
        Temperature t = new Temperature();
        
        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Inserire la temperatura di " + giorni[i]);
            temperature[i] = in.nextFloat();
        }
        
        t.setGradi(temperature);
        
        System.out.println("Il giorno con la temperatura maggiore è: " + t.max());
        System.out.println("Il giorno con la temperatura minore è: " + t.min());
        System.out.println("La temperatura media settimanale è: " + t.tMedia());
        
    }
    
}
