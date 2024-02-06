package cicli;

/**
 * Classe che realizza il gioco del SuperEnalotto
 * @author Luca.Negriolli 3INA 2023
 * @version 1.0
 */
public class SuperEnalotto {
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    private int n6;
    
    public SuperEnalotto(){
    }

    public SuperEnalotto(int n1, int n2, int n3, int n4, int n5, int n6) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
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

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public int getN5() {
        return n5;
    }

    public void setN5(int n5) {
        this.n5 = n5;
    }

    public int getN6() {
        return n6;
    }

    public void setN6(int n6) {
        this.n6 = n6;
    }
    
    public String info(){
        String testo;
        
        testo = "Il primo numero vale: " + n1 + "\n" +
                "Il secondo numero vale: " + n2 + "\n" +
                "Il terzo numero vale: " + n3 + "\n" +
                "Il quarto numero vale: " + n4 + "\n" +
                "Il cinque numero vale: " + n5 + "\n" +
                "Il sei numero vale: " + n6 + "\n";
        
        return testo;             
    }
    
    public String confronto(int numero1, int numero2, int numero3, int numero4, int numero5, int numero6){
        String rit;
        
        if(numero1 == n1)
            if(numero2 == n2)
                if(numero3 == n3)
                    if(numero4 == n4)
                        if(numero5 == n5)
                            if(numero6 == n6)
                                rit = "Hai Indovinato tutti i numeri!!!!!!!!!!";
                            else
                                rit = "Hai indovinato 5 numeri";
                        else
                            rit = "Hai indovinato 4 numeri";
                    else
                        rit = "Hai indivanto 3 numeri";
                else
                    rit = "Hai indovinato 2 numeri";
            else
                rit = "Hai indovinato 1 numero";
        else
            rit = "Non hai indovinato nulla, aia!";
        
        return rit;        
    }
    
}
