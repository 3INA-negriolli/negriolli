package numero;


public class Numero2 {

    private int n1;

    public Numero2() {
    }

    public Numero2(int n1) {
        this.n1 = n1;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public String positivoNegativoUgualeAZero() {
        String testo = "";
        if (n1 >= 0) {
            if (n1 == 0) {
                testo = "zero";
            } else {
                testo = "positivo";
            }
        } else {
            testo = "negativo";
        }

        return testo;
    }

    public String positivoNegativoUgualeAZero1() {
        String testo;
        if (n1 > 0) {
            testo = "positivo";
        } else if (n1 == 0) {
            testo = "zero";
        } else {
            testo = "negativo";
        }
        return testo;
    }

    public String positivoNegativoUgualeAZero2() {
        String testo;
        if (n1 > 0) {
            testo = "positivo";
        } else if (n1 == 0) {
            testo = "zero";
        } else {
            testo = "negativo";
        }

        return testo;
    }

    public String positivoNegativoUgualeAZero3() {
        String testo = "";
        if (n1 > 0) {
            testo = "positivo";
        }

        if (n1 == 0) {
            testo = "zero";
        }

        if (n1 < 0) {
            testo = "negativo";
        }

        return testo;
    }
}
