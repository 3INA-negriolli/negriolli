package cicli;

import java.time.LocalDate;

import java.util.Arrays;

/**
 * 
 * @author dennis.faes
 */
public class Data {
    private int giorno, mese, anno;

    public Data() {
        LocalDate d = LocalDate.now();
        anno = d.getYear();
        giorno = d.getDayOfMonth();
        mese = d.getMonthValue();
    }

    public Data(int giorno, int mese, int anno){
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno; 
    }

    public int getGiorno() {
        return giorno;
    }

    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }

    public int getMese() {
        return mese;
    }

    public void setMese(int mese) {
        this.mese = mese;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public boolean isDataValida(int g, int m, int a){
        boolean isAnno = false;
        boolean isMese = false;
        boolean isGiorno = false;
        boolean isData = false;
        
        if ((anno >= 1000) && (anno<= 9999))
            isAnno = true;
        
        if ((mese >= 1) && (mese <= 12))
            isMese = true;
        
        switch (mese){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if ((giorno >= 1) && (giorno <= 31)){
                    isGiorno = true;
                }
                break;
            case 4: case 6: case 9: case 11:
                if ((giorno >= 1) && (giorno <= 30)){
                    isGiorno = true;
                }
                break;
            case 2:
                if (isBisestile() == true){
                    if ((giorno >= 1) && (giorno <= 29))
                        isGiorno = true;
                } else {
                    if ((giorno >= 1) && (giorno <= 28))
                        isGiorno = true;
                }
        }
        
        if (isAnno == true && isMese == true && isGiorno == true){
            isData = true;
        }

        return isData;
    }
    
    public boolean isBisestile(){
        boolean is = false;
        
        if (anno%400 == 0 || (anno%4 == 0 && !(anno%100 == 0))){
            is = true;
        }
        
        return is;
    }
    
    public int nGiorni(int giorno1, int mese1, int anno1){
        int nGiorni = 0;
        
        int [] primaData = {this.giorno,this.mese,this.anno};
        int [] secondaData = {giorno1,mese1,anno1};
        
        while(true){
            if(Arrays.toString(primaData).equals(Arrays.toString(secondaData))){
                break;
            }
            nGiorni++;
            giorno += 1;
            if(isDataValida() == false){
                giorno = 0;
                mese += 1;
                if (mese == 13){
                    mese = 0;
                    anno++;
                }
            }
        }
        return nGiorni;
    }
    
    public String info(){
        String data = "";
        if (isDataValida() == true){
            if (giorno >= 1  && giorno <= 9){
                data += "0" + giorno + "/";
            } else {
                data += giorno + "/";
            }
            if (mese >= 1  && mese <= 9){
                data += "0" + mese + "/" + anno;
            } else {
                data += mese + "/" + anno;
            }
        } else {
            data = "Data non valida";
        }
        
        return data;
    }  
}
