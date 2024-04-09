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
        String[] giorni = new String[7];
        
        for(int i = 0; i < temperature.length; i++){
            System.out.println("Inserire la temperatura di oggi");
            temperature[i] = in.nextFloat();
        }
        
        Temperature t = new Temperature();
        
        System.out.println("Il giorno con la temperatura maggiore è: " + t.tMax());
        System.out.println("Il giorno con la temperatura minore è: " + t.tMin());
        System.out.println("La temperatura media settimanale è: " + t.tMedia());
        
        
        
        
    }
    
}
