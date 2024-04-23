package cicli;

import java.util.Scanner;

public class ConvBinToDecStringTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String numBin;
        
        System.out.println("Inserisci il numero binario: ");
        numBin = in.nextLine();
        
        ConvBinToDecString c = new ConvBinToDecString(numBin);

        System.out.println("Il valore convertito in decimale è: " + c.conversione());
    }
    
}
