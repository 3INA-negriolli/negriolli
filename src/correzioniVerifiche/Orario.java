package correzioniVerifiche;

/**
 * Classe che, dato un orario composto da ore, minuti e secondi, preveda metodi,
 * oltre quelli di default, per effettuare le seguenti operazioni: - secondi
 * equivalenti; - minuti equivalenti; - ore equivalenti; - differenza in secondi
 * con un altro orario.
 *
 * @author luca.negriolli 3INA 2024
 * @version 1.0
 */
public class Orario {

    private int ore;
    private int minuti;
    private int secondi;

    /**
     * Costruttore vuoto di default
     */
    public Orario() {
    }

    /**
     * Costruttore con parametri
     *
     * @param ore
     * @param minuti
     * @param secondi
     */
    public Orario(int ore, int minuti, int secondi) {
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    /**
     * Getter e Setter degli attributi
     *
     * @return
     */
    public int getOre() {
        return ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    /**
     * metodo privato per verificare se la data è valida
     *
     * @return boolean
     */
    private boolean isValido() {
        boolean valido = false;
        if (secondi < 60 && minuti < 60 && ore < 24) {
            valido = true;
        }
        return valido;
    }

    /**
     * Metodo che calcola i secondi dell'orario inserito
     *
     * @return
     */
    public int calcolaSecondi() {
        int totSec = 0;

        if (isValido()) {
            totSec = (ore * 60 * 60) + (minuti * 60) + secondi;
        }

        return totSec;
    }

    /**
     * Metodo che calcola i minuti dell'orario inserito
     *
     * @return
     */
    public int calcolaMinuti() {
        int totMin = 0;

        if (isValido()) {
            totMin = (ore * 60) + minuti;
        }

        return totMin;
    }

    /**
     * Metodo che calcola la differenza in secondi tra i due orari inseriti
     *
     * @param ore1
     * @param minuti1
     * @param secondi1
     * @return
     */
    public int diffOrario(int ore1, int minuti1, int secondi1) {
        int diffSec = 0;
        int totSec1 = 0;
        totSec1 = (ore1 * 60 * 60) + (minuti1 * 60) + secondi1;

        if (calcolaSecondi() > totSec1) {
            diffSec = calcolaSecondi() - totSec1;

        } else {
            diffSec = totSec1 - calcolaSecondi();
        }

        return diffSec;
    }

    /**
     * Metodo info che stampa in modo ordinato e più leggibile l'orario inserito
     * dall'utente
     *
     * @return
     */
    public String info() {
        String testo = "";
        if (isValido()) {
            if (ore < 10) {
                testo += "0" + ore + ":";
            } else {
                testo += ore + ":";
            }

            if (minuti < 10) {
                testo += "0" + minuti + ":";
            } else {
                testo += minuti + ":";
            }

            if (secondi < 10) {
                testo += "0" + secondi;
            } else {
                testo += secondi;
            }
        }

        return testo;
    }
}
