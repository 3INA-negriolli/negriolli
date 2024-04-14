package cicli;

import java.util.Scanner;

public class ConvBinToDecTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numBin[] = new int[8];
       
        ConvBinToDec c = new ConvBinToDec();
        
        for(int i = 0; i < numBin.length; i++){
            System.out.print("Inserire il numero binario (una cifra alla volta): ");
            numBin[i] = in.nextInt();
        }
        
        c.setNumBin(numBin);
        
        System.out.println(c.info());
        
        System.out.println("Il numero in decimale vale: " + c.convertitore());
        
        
        
    }
    
}
