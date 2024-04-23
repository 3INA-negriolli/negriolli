package cicli;

/**
 * 
 * @author luca.negriolli 3INA 2024
 * @version 1.0
 */
public class ConvBinToDecString {

    private String numBin;

    public ConvBinToDecString() {
    }

    public ConvBinToDecString(String numBin) {
        this.numBin = numBin;
    }

    public String getBinario() {
        return numBin;
    }

    public void setBinario(String numBin) {
        this.numBin = numBin;
    }
    
    public int conversione(){
        int decimale = 0, bit;
        int i = numBin.length() - 1;//indice del bit, si parte da destra
        int j = 0;//indice dell'esponente
        while(i >= 0){
            bit = this.numBin.charAt(i) - '0';//il - '0' serve per convertirlo in intero invece che in codice ascii
            i--;
            if(bit == 1){
                decimale += Math.pow(2, j);
            }
            j++;
        }
        return decimale;
    }
    
}