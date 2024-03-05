package cicli;

import java.util.Arrays;

/**
 * Classe che simula il Super Enalotto, sta volta con gli array
 *
 * @author luca.negriolli 3INA 2024
 * @version 1.0
 */
public class SuperEnalottoArray {

    int numeriGenerati[] = new int[6];
    int numeriGiocati[] = new int[6];

    public SuperEnalottoArray() {
    }

    public int generatore() {
        int i = 0;
        for (i = 0; i < 6; i++) {
            numeriGenerati[i] = (int) ((Math.random() * 99) + 1);
        }
        return numeriGenerati[i];
    }
    
    public void controlloNDiversi(){
        int i = 0;
        
        for(i = 0; i < 6; i++){
            if(numeriGenerati[i] != numeriGenerati[i+1]){
                
            }else{
                numeriGenerati[i] = (int) ((Math.random() * 99) + 1);
            }
        }
    }
    
    public  String verificaVittoria() {
        String rit = "";
        boolean ver = false;
        Arrays.sort(numeriGenerati);
        Arrays.sort(numeriGiocati);
        
        if(Arrays.equals(numeriGenerati, numeriGiocati)){
            ver = true;
        }
        
        if(ver == true){
            rit = "Hai Vinto!!!";
        }else{
            rit = "Hai Perso";
        }
        
        return rit;
    }
    
}
