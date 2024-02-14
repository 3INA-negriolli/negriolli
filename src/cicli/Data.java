package cicli;

/**
 * Classe che scrive una data controllando se è valida
 *
 * @author luca.negriolli 3INA 2024
 * @version 1.0
 */
public class Data {

    private int a;
    private int m;
    private int g;

    public Data() {
    }

    public Data(int a, int m, int g) {
        this.a = a;
        this.m = m;
        this.g = g;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public boolean isValida() {
        boolean is = false;

        if (a < 1000 || a > 9999) {
            is = false;
        }

        if (m < 1 || m > 12) {
            is = false;
        }

        if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (g >= 1 && g <= 30) {
                is = true;
            }
        }

        if (m == 1 || m == 2 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (g >= 1 && g <= 31) {
                is = true;
            }
        }

        if (a % 4 == 0) {
            if (m == 2) {
                if (g >= 1 && g <= 28) {
                    is = true;
                }
            }
        }

        return is;
    }

    public boolean isBisestile() {
        boolean is = false;
        
        if (a % 400 == 0 || (a % 4 == 0 && !(a % 100 == 0))) {
            is = true;
        }else{
            is = false;
        }
    
        return is;
    }

    public String info() {
        String testo = "";

        if (isValida() == true) {
            if (g >= 1 && g <= 9) {
                testo += "0" + g + "/";
            } else {
                testo = g + "/" + m + "/" + a;
            }
            if (m >= 1 && m <= 9) {
                testo += "0" + m + "/" + a;
            } else {
                testo = g + "/" + m + "/" + a;
            } 
        } else {
            testo = "Data Invalida";
        }
        return testo;
    }

}
