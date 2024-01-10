package numero;

/**
 * Classe che serve a dare consigli in base alla temperatura
 *
 * @author luca.negriolli 3INA 2023
 * @version 1.0
 */
public class Meteo {

    private float temperatura;

    /**
     * Costruttore vuoto {@link #setTemperatura(float)}
     */
    public Meteo() {

    }

    /**
     * Costruttore con parametro
     *
     * @param temperatura
     */
    public Meteo(float temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * Serve a vedere il valore contenuto nell'attributo temperatura
     *
     * @return
     */
    public float getTemperatura() {
        return temperatura;
    }

    /**
     * Imposta/Modifica il valore contenuto nell'attributo temperatura
     *
     * @param temperatura
     */
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * Serve a visualizzae il valore contenuto nell'attributo
     *
     * @return testo
     */
    public String info() {
        String testo;

        testo = "Il valore della temperatura è: " + temperatura + "\n";

        return testo;
    }

    /**
     * Fornisce un consiglio in base alla temperatura
     *
     * @return String
     */
    public String Consiglio1() {
        String testo = "";

        if (temperatura < 0) {
            testo = "Attenti al ghiaccio!";
        }
        if (temperatura == 0) {
            testo = "Si va a sciare!";
        }
        if (temperatura > 0 && temperatura <= 5) {
            testo = "Ci vuole il cappellino";
        }
        if (temperatura > 5 && temperatura <= 10) {
            testo = "Basta il piumino";
        }
        if (temperatura > 10 && temperatura <= 15) {
            testo = "Solo il maglioncino";
        }
        if (temperatura > 15 && temperatura <= 20) {
            testo = "Magari!";
        }
        if (temperatura > 20 && temperatura <= 25) {
            testo = "Tutti al mare!!";
        }
        if (temperatura > 25) {
            testo = "Condizionatore a manetta!!!";
        }
        return testo;
    }

    public String Consiglio2() {
        String testo = "";

        if (temperatura < 0) {
            testo = "Attenti al ghiaccio!";
        } else if (temperatura == 0) {
            testo = "Si va a sciare!";
        } else if (temperatura > 0 && temperatura <= 5) {
            testo = "Ci vuole il cappellino";
        } else if (temperatura > 5 && temperatura <= 10) {
            testo = "Basta il piumino";
        } else if (temperatura > 10 && temperatura <= 15) {
            testo = "Solo il maglioncino";
        } else if (temperatura > 15 && temperatura <= 20) {
            testo = "Magari!";
        } else if (temperatura > 20 && temperatura <= 25) {
            testo = "Tutti al mare!!";
        } else {
            testo = "Condizionatore a manetta!!!";
        }
        return testo;
    }

    public String Consiglio3() {
        String testo = "";

    }

    public String Consiglio4() {
        String testo = "";

        return testo;

    }

}
