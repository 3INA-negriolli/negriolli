package teoria;

/**
 *
 * @author Luca Negriolli
 */
public class Stringhe {

    private String str;

    public Stringhe(String str) {
        this.str = str;
    }

    public int contaSpazi() {
        int cont = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                cont++;
            }
        }

        return cont;
    }

    public int contaVocali() {
        int cont = 0;
        char[] vocali = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vocali.length; j++) {
                if (str.toLowerCase().charAt(i) == vocali[j]) {
                    cont++;
                }
            }
        }

        return cont;
    }

    public int contaConsonanti() {
        int cont = 0;
        char[] consonanti = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < consonanti.length; j++) {
                if (str.toLowerCase().charAt(i) == consonanti[j]) {
                    cont++;
                }
            }
        }

        return cont;
    }

    public static void main(String[] args) {
        Stringhe s = new Stringhe("Mi piace viaggiare");

        System.out.println(s.contaSpazi());
        System.out.println(s.contaConsonanti());
        System.out.println(s.contaVocali());
    }
}
