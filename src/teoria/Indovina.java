package teoria;

public class Indovina {

    public Indovina() {
    }

    public String continuo(int numero, int a) {
        String rit;

        if (a == numero) {
            rit = "Hai indovinato!";
        } else {
            rit = "Hai sbagliato!";
        }

        return rit;
    }

}
