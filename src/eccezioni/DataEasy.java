package eccezioni;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.temporal.ChronoUnit;
import java.time.Period;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 * ...
 * @author luca.negriolli 4INA
 * @version 1.0
 */
public class DataEasy {

    private String data;
    private Integer giorno;
    private Integer mese;
    private Integer anno;

    public DataEasy() {
    }

    public DataEasy(String data) throws Exception {
        setData(data);
    }

    public DataEasy(Integer giorno, Integer mese, Integer anno) throws Exception {
        setAnno(anno);
        setMese(mese);
        setGiorno(giorno);

        LocalDate data = LocalDate.of(this.anno, this.mese, this.giorno);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.data = data.format(formatter);
    }

    public DataEasy(DataEasy data) throws Exception {
        setData(data.data);
        setAnno(data.anno);
        setGiorno(data.giorno);
        setMese(data.mese);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        LocalDate dataOdierna = LocalDate.now();

        if (data == null) {
            throw new Exception("Data Nulla!");
        } else {
            if (!Pattern.matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}", data)) {
                throw new Exception("Sintassi Errata!");
            } else {
                String[] s = data.split("/");
                int giorno = Integer.parseInt(s[0]);
                int mese = Integer.parseInt(s[1]);
                int anno = Integer.parseInt(s[2]);

                LocalDate dataInserita = LocalDate.of(anno, mese, giorno);

                if (dataInserita.isAfter(dataOdierna)) {
                    throw new Exception("Data Errata!");
                } else {
                    this.data = data;
                    this.giorno = giorno;
                    this.mese = mese;
                    this.anno = anno;
                }
            }
        }
    }

    public Integer getGiorno() {
        return giorno;
    }

    public void setGiorno(Integer giorno) throws Exception {
        if (giorno == null) {
            throw new Exception("Giorno Nullo!");
        } else {

            try {
                LocalDate dataTemp = LocalDate.of(anno, mese, giorno);
            } catch (DateTimeException e) {
                throw new Exception("Giorno Sbagliato per il mese e anno specificato!");
            }
            this.giorno = giorno;
        }
    }

    public Integer getMese() {
        return mese;
    }

    public void setMese(Integer mese) throws Exception {
        if (mese == null || mese < 1 || mese > 12) {
            throw new Exception("Mese non valido!");
        }
        this.mese = mese;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) throws Exception {
        if (anno == null || anno < 1) {
            throw new Exception("Anno non valido!");
        }
        this.anno = anno;
    }

    public String giornoDellaSettimana() {
        LocalDate dataTemp = LocalDate.of(anno, mese, giorno);
        String giornoSettimana = dataTemp.getDayOfWeek().name();

        switch (giornoSettimana) {
            case "MONDAY":
                giornoSettimana = "Lunedì";
                break;
            case "TUESDAY":
                giornoSettimana = "Martedì";
                break;
            case "WEDNESDAY":
                giornoSettimana = "Mercoledì";
                break;
            case "THURSDAY":
                giornoSettimana = "Giovedì";
                break;
            case "FRIDAY":
                giornoSettimana = "Venerdì";
                break;
            case "SATURDAY":
                giornoSettimana = "Sabato";
                break;
            case "SUNDAY":
                giornoSettimana = "Domenica";
                break;
            default:
                break;
        }

        return giornoSettimana;
    }

    public static Integer differenzaInGiorni(DataEasy dataAntecedente, DataEasy dataSuccessiva) {
        LocalDate data1 = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno());
        LocalDate data2 = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        long differenza = java.time.temporal.ChronoUnit.DAYS.between(data1, data2);

        return (int) differenza;
    }

    public static Integer differenzaInSettimane(DataEasy dataAntecedente, DataEasy dataSuccessiva) {
        LocalDate data1 = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno());
        LocalDate data2 = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        long differenza = ChronoUnit.WEEKS.between(data1, data2);

        return (int) differenza;
    }

    public static Integer differenzaInMesi(DataEasy dataAntecedente, DataEasy dataSuccessiva) {
        LocalDate data1 = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno());
        LocalDate data2 = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        long differenza = ChronoUnit.MONTHS.between(data1, data2);

        return (int) differenza;
    }

    public static Integer differenzaInAnni(DataEasy dataAntecedente, DataEasy dataSuccessiva) {
        LocalDate data1 = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno());
        LocalDate data2 = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        long differenza = ChronoUnit.YEARS.between(data1, data2);

        return (int) differenza;
    }
    
    public static String differenzaInGiorniMesiAnni(DataEasy dataAntecedente, DataEasy dataSuccessiva) {
        return "Intervallo di tempo: \n" + " - Giorni: " + differenzaInGiorni(dataAntecedente, dataSuccessiva)
                + "\n - Mesi: " + differenzaInMesi(dataAntecedente, dataSuccessiva)
                + "\n - Anni: " + differenzaInAnni(dataAntecedente, dataSuccessiva);
    }

    @Override
    public String toString() {
        String testo = "";

        testo = giornoDellaSettimana() + " " + getData();

        return testo;
    }

    public static void main(String[] args) {
        try {
            DataEasy dt = new DataEasy("16/01/2025");

            System.out.println(dt.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
