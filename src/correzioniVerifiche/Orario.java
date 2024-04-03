package correzioniVerifiche;

import java.time.LocalTime;

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
        LocalTime adesso = LocalTime.now();
        
        ore = adesso.getHour();
        minuti = adesso.getMinute();
        secondi = adesso.getSecond();
    }

    /**
     * Costruttore con parametri
     *
     * @param ore
     * @param minuti
     * @param secondi
     */
    public Orario(int ore, int minuti, int secondi) {
        setOre(ore); //this.ore = ore;
        setMinuti(minuti); //this.minuti = minuti;
        setSecondi(secondi); //this.secondi = secondi;
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
        if (isValido()) {
            this.ore = ore;
        }//costruisco l'orario solo se viene validato
    }
    
    public int getMinuti() {
        return minuti;
    }
    
    public void setMinuti(int minuti) {
        if (isValido()) {
            this.minuti = minuti;
        }
    }
    
    public int getSecondi() {
        return secondi;
    }
    
    public void setSecondi(int secondi) {
        if (isValido()) {
            this.secondi = secondi;
        }
        
    }

    /**
     * metodo privato per verificare se la data è valida
     *
     * @return boolean
     */
    private boolean isValido() {
        boolean valido = false;
        
        valido = isValido(ore, minuti, secondi);
        
        return valido;
    }
    
    public static boolean isValido(int ore, int minuti, int secondi) {
        boolean valido = false;
        
        if (ore >= 0 && ore <= 23) {
            if (minuti >= 0 && minuti <= 59) {
                if (secondi >= 0 && secondi <= 59) {
                    valido = true;
                }
            }
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
    
    public void diffOrarioNew(Orario o){
        
        int ore = o.getOre();
        int minuti = o.getMinuti();
        int secondi = o.getSecondi();
    }

    /**
     * Metodo info che stampa in modo ordinato e più leggibile l'orario inserito
     * dall'utente
     *
     * @return
     */
    public String info() {
        String testo = "";

        //if (isValido()) { //non serve validarlo
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
        
        return testo;
    }
}
