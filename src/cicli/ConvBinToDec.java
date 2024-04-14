package cicli;

import java.util.Arrays;

/**
 * ConvBinToDec (conversione da binario a decimale)
 * @author luca.negriolli
 * @version 3INA
 */
public class ConvBinToDec {

    private int numBin[] = new int[8];

    public ConvBinToDec() {
    }

    public int[] getNumBin() {
        return numBin;
    }

    public void setNumBin(int[] numBin) {
        for (int i = 0; i < numBin.length; i++) {
            this.numBin[i] = numBin[i];
        }
    }

    public int convertitore() {
        int numDec = 0;
        int i = 0;

        for (i = 0; i < numBin.length; i++) {

            if (numBin[i] == 1) {
                numDec += Math.pow(2, i);
            }
        }
        
        return numDec;
    }
    
    public String info(){
        String testo = "";
        
        testo = "Il numero binario è: " + Arrays.toString(numBin);
        
        return testo;
    }

}
