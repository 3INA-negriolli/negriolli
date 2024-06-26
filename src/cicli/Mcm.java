package cicli;

/**
 *
 * @author luca.negriolli
 */
public class Mcm {

    private int n1;
    private int n2;

    public Mcm(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    private int mcd(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        return n1;
    }

    public int mcm() {
        int mcm = 0;

        mcm = Math.abs(n1 * n2) / mcd(n1, n2);

        return mcm;
    }

    public String info() {
        String testo = "";

        testo = "Il primo numero vale: " + n1 + "\n"
                + "Il secondo numero vale: " + n2 + "\n";

        return testo;
    }

}
