package teoria;

/**
 *
 * @author luca.negriolli 4INA
 */
public class Cetacei extends Mammiferi {

    private String acqua;
    private boolean anfibio;
    private boolean rischioEstinzione;

    public Cetacei() {
    }

    public Cetacei(String acqua, boolean anfibio, boolean rischioEstinzione) {
        this.acqua = acqua;
        this.anfibio = anfibio;
        this.rischioEstinzione = rischioEstinzione;
    }

    public String getAcqua() {
        return acqua;
    }

    public void setAcqua(String acqua) {
        this.acqua = acqua;
    }

    public boolean getAnfibio() {
        return anfibio;
    }

    public void setAnfibio(boolean anfibio) {
        this.anfibio = anfibio;
    }

    public boolean getRischioEstinzione() {
        return rischioEstinzione;
    }

    public void setRischioEstinzione(boolean rischioEstinzione) {
        this.rischioEstinzione = rischioEstinzione;
    }

    /**
     * Ritorna se il cetaceto è pescivoro
     *
     * @return
     */
    public boolean isPescivoro() {
        return true;
    }

}
