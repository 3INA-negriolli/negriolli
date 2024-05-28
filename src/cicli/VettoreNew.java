package cicli;

import java.util.Arrays;

/**
 * Classe Vettore che include diverse funzionalità riguardanti i vettori
 *
 * @author luca.negriolli 3INA 2024
 * @version 1.0
 */
public class VettoreNew {

    private int[] vett;

    public VettoreNew() {
    }

    public VettoreNew(int[] vett) {
        this.vett = vett;
        setVett(vett);
    }

    public int[] getVett() {
        if (vett == null) {
            return null;
        }

        int[] temp = new int[vett.length];

        //System.vettaycopy(vett, 0, temp, 0, vett.length);
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
     * Metodo che tramite la ricerca lineare vede se è presente un elemento di
     * un certo valore nell'array
     *
     * @param valore
     * @return
     */
    public boolean ricercaElementoPerValore(int valore) {
        boolean trovato = false;

        for (int i = 0; i < vett.length; i++) {
            if (vett[i] == valore) {
                trovato = true;
            }
        }

        return trovato;
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
    public void ordinaCrescente() {
        int n = vett.length;
        int temp = 0;
        int pos_min = 0;

        for (int i = 0; i < n - 1; i++) {
            pos_min = i;

            for (int j = i + 1; j < n; j++) {
                if (vett[j] < vett[pos_min]) {
                    pos_min = j;
                }
            }

            if (pos_min != i) {
                temp = vett[i];
                vett[i] = vett[pos_min];
                vett[pos_min] = temp;
            }
        }
    }

    public void ordinaDecrescente() {
        for (int i = 1; i < vett.length; i++) {
            int temp = vett[i];
            int j = i - 1;

            // Sposta gli elementi dell'array che sono
            // più piccoli una posizione avanti
            // rispetto alla loro posizione attuale
            while (j >= 0 && vett[j] < temp) {
                vett[j + 1] = vett[j];
                j = j - 1;
            }
            vett[j + 1] = temp;
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
     * Aggiunge un elemento all'vettay creandone un altro
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
     * l'elemento da eliminare all'ultima posizione dell'vettay affinchè non
     * venga memorizzato nel nuovo vettay Non va
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

    /**
     * Sposta di n posizioni gli elementi dell'array verso destra
     * (Si sovrascrivono gli elementi)
     * @param nPosizioni
     * @return
     */
    public boolean shiftDx(int nPosizioni) {
        boolean spostato = true;
        int temp = vett[vett.length - 1];

        if (vett == null || vett.length == 1) {
            spostato = false;
        } else {
            do {
                for (int i = vett.length - 1; i > 0; i--) {
                    vett[i] = vett[i - 1];
                }

                vett[0] = temp;

                nPosizioni--;

            } while (nPosizioni != 0);
        }
        
        return spostato;
    }

    /**
     * Come sopra ma verso sinistra
     * @param nPosizioni
     * @return 
     */
    public boolean shiftSx(int nPosizioni) {
        boolean spostato = true;
        
        return spostato;
    }
}
