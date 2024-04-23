package teoria;

import java.util.Arrays;
import java.util.Scanner;

public class RicercaBinariaTest {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int chiave;
        int[] vettore = new int[20];
        
        RicercaBinaria.riempimento(vettore);
        RicercaBinaria.riordino(vettore);
        System.out.println(Arrays.toString(vettore));
        
        System.out.println("Inserire la chiave di ricerca: ");
        chiave = in.nextInt();
        
        int controllo = RicercaBinaria.ricercaBinaria(vettore, chiave);
        if (controllo == -1) {
            System.out.println("La chiave non è stata trovata");
        } else {
            System.out.println("La chiave è stata trovata nella posizione: " + controllo);
        }
        
    }
    
}
