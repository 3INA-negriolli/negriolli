package eccezioni;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author luca.negriolli 4INA
 * @version 1.0
 */
public class Citta extends Persona7{

    private String nome;
    private String superficie;
    private Persona7 sindaco;
    private Persona7[] abitanti;

    public Citta() {
    }

    public Citta(String nome, String superficie, Persona7 sindaco, Persona7[] abitanti) throws Exception {
        setNome(nome);
        setSuperficie(superficie);
        setSindaco(sindaco);
        setAbitanti(abitanti);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("Nome nullo");
        } else {
            if (nome.length() <= 2) {
                throw new Exception("Il nome della città deve avere più di due lettere");
            } else {
                if (!Character.isUpperCase(nome.charAt(0))) {
                    throw new Exception("Il nome della città deve iniziare con una maiuscola");
                } else {
                    String n = nome.substring(1);
                    if (!Pattern.matches("[^A-Z]+", n)) {
                        throw new Exception("Il nome della città deve proseguire con lettere minuscole");
                    } else if (!Pattern.matches("[a-z]+", n)) {
                        throw new Exception("Il nome della città può contenere solo lettere");
                    } else {
                        this.nome = nome;
                    }
                }
            }
        }
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) throws Exception {
        if (superficie != null && superficie.length() > 0) {
            if (superficie.matches("^[0-9]+,[0-9]{1,3}km$")) {
                this.superficie = superficie;
            } else {
                throw new Exception("Formattazione Errata");
            }
        } else {
            throw new Exception("Nulla o troppo corta");
        }

    }

    public Persona7 getSindaco() {
        return sindaco;
    }

    public void setSindaco(Persona7 sindaco) throws Exception {
        if (sindaco == null) {
            throw new Exception("Sindaco nullo");
        }
        this.sindaco = sindaco;
    }

    public Persona7[] getAbitanti() {
        return abitanti;
    }

    public void setAbitanti(Persona7[] abitanti) throws Exception {
        if (abitanti == null || abitanti.length == 0) {
            throw new Exception("Array abitanti nullo o vuoto");
        }

        this.abitanti = new Persona7[abitanti.length];

        for (int i = 0; i < abitanti.length; i++) {
            if (abitanti[i] == null) {
                throw new Exception("Abitante nullo");
            } else {
                this.abitanti[i] = abitanti[i];
            }
        }
    }

    public Double densitaPopolazione() {
        Double superficieDb;

        superficie = superficie.replace(",", ".");
        String[] s = superficie.split("k");

        superficieDb = Double.parseDouble(s[0]);

        Double densita = abitanti.length / superficieDb;

        return densita;
    }

    public Double mediaEta() {
        Double etaTot = 0.0;
        Double media = 0.0;

        for (int i = 0; i < abitanti.length; i++) {
            etaTot += abitanti[i].calcolaEta();
        }

        media = etaTot / abitanti.length;

        return media;
    }

    public Integer numeroOmonimi() {
        Integer nOmonimi = 0;

        for (int i = 0; i < abitanti.length; i++) {
            for (int j = i + 1; j < abitanti.length; j++) {
                if (abitanti[i].getNome().equals(abitanti[j].getNome()) && abitanti[i].getCognome().equals(abitanti[j].getCognome())) {
                    nOmonimi++;
                }
            }
        }

        return nOmonimi;
    }

    public String info() {
        String testo = "";

        testo = "Città: " + nome + "\n"
                + "Superficie: " + superficie + "\n"
                + "Sindaco: " + sindaco.getNome() + " " + sindaco.getCognome() + "\n";

        return testo;
    }

    public static void main(String[] args) {
        Citta ct = new Citta();
        Persona7 sindaco = new Persona7();

        try {
            Persona7 p1 = new Persona7(1.50, "Sansoni", "Manuel", 62.8, "01/01/2000", "manu@gmail.com", "Luca007$");
            Persona7 p2 = new Persona7(1.50, "Sansoni", "Manuel", 62.8, "01/01/2000", "manu@gmail.com", "Luca007$");

            Persona7[] abitanti = {p1, p2};

            ct.setAbitanti(abitanti);
            sindaco.setNome("Filippo");
            sindaco.setCognome("Mastroianni");
            ct.setSuperficie("123,45km");
            ct.setNome("Trento");
            ct.setSindaco(sindaco);

            System.out.println(ct.info());
            System.out.println("Densità di popolazione: " + ct.densitaPopolazione());
            System.out.println("Età media: " + ct.mediaEta());
            System.out.println("Numero di omonimi: " + ct.numeroOmonimi());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
