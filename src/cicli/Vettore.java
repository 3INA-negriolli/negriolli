package cicli;

import java.util.Arrays;

/**
 * Classe Vettore che include diverse funzionalità riguardanti i vettori
 *
 * @author luca.negriolli 3INA 2024
 * @version 1.0
 */
public class Vettore {

    private int[] vett;

    public Vettore() {
    }

    public Vettore(int[] vett) {
        this.vett = vett;
        setVett(vett);
    }

    public int[] getVett() {
        if (vett == null) {
            return null;
        }

        int[] temp = new int[vett.length];

        //System.arraycopy(vett, 0, temp, 0, vett.length);
        return temp;
    }

    /**
     * Non può essere modificato dalle classi che lo ereditano
     *
     * @param vett
     */
    public final void setVett(int[] vett) {

        //this.vett = vett.clone();
        this.vett = new int[vett.length];

        for (int i = 0; i < vett.length; i++) {
            this.vett[i] = vett[i];
        }

    }

    public void caricaVettoreRandom() {
        for (int i = 0; i < vett.length; i++) {
            vett[i] = (int) (Math.random() * 100);
        }
    }

    /**
     * Stampa il vettore
     *
     * @return
     */
    public String visualizzaVettore() {
        String testo = "";

        if (vett != null) {
            testo = "[";
        }
        for (int i = 0; i < vett.length; i++) {
            if (i == (vett.length - 1)) {
                testo += vett[i];
            } else {
                testo += vett[i] + ", ";
            }
        }
        testo += "]";

        //testo = Arrays.toString(vett);
        return testo;
    }

    /**
     * Insertion Sort
     */
    public void ordinaVettore() {
        int j;
        for (int i = 1; i < vett.length; i++) {
            int temp = vett[i];
            j = i;
            while (j > 0 && vett[j - 1] > temp) {
                vett[j] = vett[j - 1];
                j--;
            }
            vett[j] = temp;
        }
    }

    /**
     * Modifica l'elemento del vettore alla posizione scelta dall'utente con il
     * valore scelto dall'utente
     *
     * @param posizione
     * @param valore
     * @return
     */
    public boolean modificaElemento(int posizione, int valore) {
        boolean modificato = false;

        if (posizione > 0 && posizione < vett.length) {
            vett[posizione] = valore;
            modificato = true;
        }

        return modificato;
    }

    /**
     * Aggiunge un elemento all'array creandone un altro
     *
     * @param valore
     */
    public void aggiungiElemento(int valore) {
        if (vett == null) {
            vett = new int[1];

            vett[0] = valore;
        } else {
            int[] newVett = new int[vett.length + 1];

            for (int i = 0; i < vett.length; i++) {
                newVett[i] = vett[i];
            }

            newVett[newVett.length - 1] = valore;

            vett = newVett;
        }
    }

    /**
     * Rimuove l'elemento alla posizione indicata dall'utente Non va
     *
     * @param posizione
     * @return
     */
    public boolean rimuoviElementoPerPosizione(int posizione) {
        if (vett == null || posizione < 0 || posizione > vett.length) {
            return false;
        }

        int[] newVett = new int[vett.length - 1];

        for (int i = 0; i < newVett.length; i++) {
            if (i < posizione) {
                newVett[i] = vett[i];
            } else {
                newVett[i] = vett[i + 1];
            }
        }

        vett = newVett;

        return true;
    }

    /**
     * Rimuove l'elemento con il valore indicato dall'utente (azzerandolo) la
     * quale posizione viene ricercata tramite ricerca lineare, poi mettendo
     * l'elemento da eliminare all'ultima posizione dell'array affinchè non
     * venga memorizzato nel nuovo array Non va
     *
     * @param valore
     * @return
     */
    public boolean rimuoviElementoPerValore(int valore) {
        boolean trovato = false;

        if (vett == null) {
            return false;
        }

        for (int i = 0; i < vett.length; i++) {
            if (vett[i] == valore) {
                rimuoviElementoPerPosizione(i);
                i = 0;
            }
        }
        trovato = true;

        return trovato;
    }
}
/*
    public boolean shiftDx(int n) {
        boolean spostato = false;
        int temp;

        if (vett == null) {
            return false;
        } else {
            do{
            temp = vett[0];
            vett[0] = vett[vett.length-1];
            
            {while(n != 0);
        }
        
        return spostato;
    }

}
/*private boolean isValido(int[] vett){
        
 */
