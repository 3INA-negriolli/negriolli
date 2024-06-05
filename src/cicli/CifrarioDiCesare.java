package cicli;

/**
 * Classe che implementa il cifrario di cesare
 * @author Luca Negriolli 3INA 2024
 * @version 1.0
 */
public class CifrarioDiCesare {

    private String str;

    public CifrarioDiCesare(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    /**
     * Metodo che controlla se sono presenti spazi vuoti nella stringa ed in
     * caso ritorna null in tutti gli elementi dell'array
     *
     * @return
     */
    private boolean isValido() {
        boolean controllo = true;

        for (int i = 0; i < ricavaStringa().length; i++) {
            if (ricavaStringa()[i].equals(" ")) {
                controllo = false;
            }

        }

        return controllo;
    }

    /**
     * Metodo che ricava un array di stringhe da una stringa (elementi tutti
     * attaccati)
     *
     * @return
     */
    private String[] ricavaStringa() {
        String[] strVett = new String[str.length()];

        strVett = str.split("");

        return strVett;
    }

    /**
     * Il metodo cifrario cifra una stringa in input cercando le singole lettere
     * nell'array alfabeto e poi va a memorizzare in un nuovo array la lettera
     * successiva a quella in temp. Nel caso ci fosse z come lettera in temp
     * viene messa a come lettera successiva nell'array
     *
     * @return
     */
    public String[] cifrario() {
        String[] strCifrata = new String[ricavaStringa().length];
        String temp = "";

        String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        if (isValido()) {
            for (int i = 0; i < ricavaStringa().length; i++) {
                temp = ricavaStringa()[i];
                for (int j = 0; j < alfabeto.length; j++) {
                    if (alfabeto[j].equals(temp)) {
                        if (temp.equals("z")) {
                            strCifrata[i] = "a";
                        } else {
                            strCifrata[i] = alfabeto[j + 1];
                        }
                    }
                }
            }
        }

        return strCifrata;
    }

    /**
     * Metodo che concatena tutte le singole stringhe(lettere cifrate) del
     * metodo cifrario, cosi che ritorni una singola stringa cifrata
     *
     * @return
     */
    public String ritornaStringa() {
        String testo = "";

        for (int i = 0; i < str.length(); i++) {
            testo += cifrario()[i];
        }

        return testo;
    }

}
