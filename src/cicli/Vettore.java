package cicli;

import java.util.Arrays;

/**
 * Classe Vettore che include diverse funzionalità riguardanti i vettori
 *
 * @author luca.negriolli 3INA 2024
 * @version 1.0
 */
public class Vettore {

    public int[] vett;

    public Vettore() {
    }

    public Vettore(int[] vett, int dim) {
        this.vett = new int[dim];
        this.vett = vett;
    }

    public int[] getVett() {
        int[] vett = new int[this.vett.length];
        for (int i = 0; i < vett.length; i++) {
            vett[i] = this.vett[i];
        }
        return vett;
    }

    public void setVett(int[] vett) {
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

        testo = Arrays.toString(vett);

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
        int[] vett = new int[this.vett.length+1];
        
        for (int i = 0; i < this.vett.length; i++) {
            vett[i] = this.vett[i];
        }
        vett[vett.length-1] = valore;
        
        setVett(vett);
    }

    /**
     * Rimuove l'elemento alla posizione indicata dall'utente
     * Non va
     * 
     * @param posizione
     * @return
     */
    public boolean rimuoviElementoPerPosizione(int posizione) {
        boolean rimosso = false;
        int temp = 0;
        int posChiave = 0;
        int[] vettModificato = new int[vett.length - 2];

        if (posizione > 0 && posizione < vett.length) {
            temp = vett[vett.length - 1];
            vett[vett.length - 1] = vett[posizione];
            vett[posizione] = temp;
            rimosso = true;
        }

        return rimosso;
    }

    /**
     * Rimuove l'elemento con il valore indicato dall'utente (azzerandolo) la
     * quale posizione viene ricercata tramite ricerca lineare, poi mettendo
     * l'elemento da eliminare all'ultima posizione dell'array affinchè non
     * venga memorizzato nel nuovo array
     * Non va
     * 
     * @param valore
     * @return
     */
    public boolean rimuoviElementoPerValore(int valore) {
        boolean rimosso = false;
        int temp = 0;
        int posChiave = 0;
        int[] vett = new int[this.vett.length - 2];

        for (int i = 0; i < this.vett.length; i++) {  // ricerca lineare
            if (valore == this.vett[i]) {
                posChiave = i;                        //scambio...
                temp = this.vett[this.vett.length - 1];         //scambio...
                this.vett[this.vett.length - 1] = this.vett[posChiave];    //scambio...
                this.vett[posChiave] = temp;
                rimosso = true;
            }
        }

        for (int i = 0; i < vett.length; i++) {
            vett[i] = this.vett[i];
        }

        return rimosso;
    }

}
