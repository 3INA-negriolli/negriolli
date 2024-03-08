package cicli;

/**
 *
 * @author david.ober
 */
public class Data2 {

    private int g;
    private int m;
    private int a;
    private int giorno;
    private int mese;
    private int anno;

    public Data2() {
    }

    public Data2(int g, int m, int a, int giorno, int mese, int anno) {
        this.g = g;
        this.m = m;
        this.a = a;
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
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

    public boolean isValido() {
        boolean valido = false;
        if (a < 1000 || a > 9999) {
            valido = false;

        }
        if (m < 1 || m > 12) {
            valido = false;
        }

        if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (g >= 1 || g <= 30) {
                valido = true;
            }
        }
        if (m == 1 || m == 2 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (g >= 1 || g <= 31) {
                valido = true;
            }
        }

        return valido;
    }

    public boolean isValido2() {
        boolean valido = false;
        if (anno < 1000 || anno > 9999) {
            valido = false;

        }
        if (mese < 1 || mese > 12) {
            valido = false;
        }

        if (mese == 4 || mese == 6 || mese == 9 || mese == 11) {
            if (giorno >= 1 || giorno <= 30) {
                valido = true;
            }
        }
        if (mese == 1 || mese == 2 || mese == 3 || mese == 5 || mese == 7 || mese == 8 || mese == 10 || mese == 12) {
            if (giorno >= 1 || giorno <= 31) {
                valido = true;
            }
        }

        return valido;
    }

    public boolean isBisestile() {
        boolean is = true;
        if (a % 400 == 0 || (a % 4 == 0 && !(a % 100 == 0))) {
            is = true;
        } else {
            is = false;
        }
        return is;
    }

    public boolean isBisestile2() {
        boolean is = true;
        if (anno % 400 == 0 || (anno % 4 == 0 && !(anno % 100 == 0))) {
            is = true;
        } else {
            is = false;
        }
        return is;
    }

    public String info() {
        String testo = "";
        if (isValido() == true) {
            if (g >= 1 && g <= 9) {
                testo = testo = "0" + g + "/";
            } else {
                testo = g + "/" + m + "/" + a;
            }
            if (m >= 1 && m <= 9) {
                testo += "0" + m + "/" + a;
            } else {
                testo = g + "/" + m + "/" + a;
            }
        } else {
            testo = "data non valida";
        }
        return testo;
    }

    public String info2() {
        String testo = "";
        if (isValido2() == true) {
            if (giorno >= 1 && giorno <= 9) {
                testo = testo = "0" + giorno + "/";
            } else {
                testo = giorno + "/" + mese + "/" + anno;
            }
            if (mese >= 1 && mese <= 9) {
                testo += "0" + mese + "/" + anno;
            } else {
                testo = giorno + "/" + mese + "/" + anno;
            }
        } else {
            testo = "data non valida";
        }
        return testo;
    }

    public int distanzaGiorni() {
        int gDiff = 0;
        int mesi[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int mesi2[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int nGData1 = 0;
        int nGData2 = 0;
        if (isBisestile() == true) {
            mesi[1] = 29;
        }
        if (isBisestile2() == true) {
            mesi[1] = 29;
        }
        nGData1 = g + a * 365 + (mesi[m + 1] * m);
        nGData2 = giorno + anno * 365 + (mesi[mese + 1] * mese);
        if (nGData1 > nGData2) {
            gDiff = nGData1 - nGData2;
        } else {
            gDiff = nGData2 - nGData1;
           
        }
        return gDiff;
    }
}
/*
   
    public int distanzaGiorni(int g , int m , int a) {
        int gDiff = 0;
        int mesi[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int mesi2[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isBisestile() == true) {
            mesi[1] = 29;
        }
        if (isBisestile2() == true) {
            mesi[1] = 29;
        }
        giorno = anno*365;
        giorno += g;
       
        return gDiff;
    }
}
*/
