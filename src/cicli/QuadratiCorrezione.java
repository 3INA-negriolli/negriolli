package cicli;

/**
 *
 * @author luca.negriolli
 */
public class QuadratiCorrezione {

    private int n;

    public QuadratiCorrezione() {
    }

    public QuadratiCorrezione(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public boolean isValido() {
        boolean is = false;

        if (n > 0 && n <= 20) {
            is = true;
        }

        return is;
    }

    public String potenza() {
        String testo = "";
        int i = 0;

        do {
            n--;
            if (isValido()) {
                testo = testo + "Il quadrato di " + n + "è: " + (n * n) + "\n";
            } else {
                i = 1;
            }
        } while (i < 1);

        return testo;
    }
    
    public String potenze(){
        String testo = "";
        int i = 0;
        int quadrato;
        if(isValido() == true)
            for (i = 0; i < n; i++) {
                quadrato = n*n;
                testo += testo + "Il quadrato di " + n + "è: " + quadrato + "\n";             
            }
        return testo;
    }
    
}

    