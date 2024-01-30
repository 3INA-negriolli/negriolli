package cicli;

/**
 * Classe che calcola la frequenza relativa,assoluta e percentuale dei gelati
 * venduti
 *
 * @author luca.negriolli
 */
public class Gelataio {

    private int gusto1;
    private int gusto2;
    private int gusto3;
    private int gusto4;
    private int totVendite;

    public Gelataio() {
    }

    public Gelataio(int gusto1, int gusto2, int gusto3, int gusto4, int totVendite) {
        this.gusto1 = gusto1;
        this.gusto2 = gusto2;
        this.gusto3 = gusto3;
        this.gusto4 = gusto4;
        this.totVendite = totVendite;
    }

    public int getGusto1() {
        return gusto1;
    }

    public void setGusto1(int gusto1) {
        this.gusto1 = gusto1;
    }

    public int getGusto2() {
        return gusto2;
    }

    public void setGusto2(int gusto2) {
        this.gusto2 = gusto2;
    }

    public int getGusto3() {
        return gusto3;
    }

    public void setGusto3(int gusto3) {
        this.gusto3 = gusto3;
    }

    public int getGusto4() {
        return gusto4;
    }

    public void setGusto4(int gusto4) {
        this.gusto4 = gusto4;
    }

    public int getTotVendite() {
        return totVendite;
    }

    public void setTotVendite(int totVendite) {
        this.totVendite = totVendite;
    }

    public String menu() {
        String testo;

        testo = "MENU" + "\n"
                + "1 - Costruttore con Parametri" + "\n"
                + "2 - Visualizzazione Frequenze" + "\n"
                + "3 - Uscita" + "\n";

        return testo;
    }

    public String frequenzeRelative(){
        String rit;
        float freqRel1 = gusto1/totVendite;
        float freqRel2 = gusto2/totVendite;
        float freqRel3 = gusto3/totVendite;
        float freqRel4 = gusto4/totVendite;
        
        rit = "La Frequenza Relativa del Primo Gusto è: " + freqRel1 + "\n" +
              "La Frequenza Relativa del Secondo Gusto è: " + freqRel2 + "\n" +
              "La Frequenza Relativa del Terzo Gusto è: " + freqRel3 + "\n" +
              "La Frequenza Relativa del Quarto Gusto è: " + freqRel4 + "\n";
        
        return rit;  
    }
    
    public String frequenzePercentuale(){
        String rit;
        float freqPerc1 = (gusto1/totVendite)*100;
        float freqPerc2 = (gusto2/totVendite)*100;
        float freqPerc3 = (gusto3/totVendite)*100;
        float freqPerc4 = (gusto4/totVendite)*100;
        
        rit = "La Frequenza Percentuale del Primo Gusto è: " + freqPerc1 + "%" + "\n" +
              "La Frequenza Percentuale del Secondo Gusto è: " + freqPerc2 + "%" + "\n" +
              "La Frequenza Percentuale del Terzo Gusto è: " + freqPerc3 + "%" + "\n" +
              "La Frequenza Percentuale del Quarto Gusto è: " + freqPerc4 + "%" + "\n";
        
        return rit;       
    }
}
