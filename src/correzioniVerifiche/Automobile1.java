package correzioniVerifiche;

import eccezioni.Persona8A;
import eccezioni.DataEasy;
import java.util.regex.Pattern;

/**
 * Verifica
 *
 * @author luca.negriolli 4INA
 * @version 1.0
 */
public class Automobile1 extends MezziDiTrasporto5 {

    private String dataDiProduzione;
    private String targa;
    private Persona8A autista;
    private Persona8A[] passeggeri;

    public Automobile1() {
        super();
    }

    public Automobile1(String dataDiProduzione, String targa, Integer cavalli, Integer cilindrata, String colore, String marca) throws Exception {
        super(cavalli, cilindrata, colore, marca);
        setDataDiProduzione(dataDiProduzione);
        setTarga(targa);
    }

    public String getDataDiProduzione() {
        return dataDiProduzione;
    }

    public void setDataDiProduzione(String dataDiProduzione) throws Exception {
        if (dataDiProduzione != null) {
            DataEasy dataOggi = new DataEasy();
            DataEasy dataProd = new DataEasy(dataDiProduzione);
            String dataOdierna = dataOggi.getData();

            if (dataDiProduzione.equals(dataOdierna) || DataEasy.differenzaInGiorni(dataOggi, dataProd) >= 0) {
                this.dataDiProduzione = dataDiProduzione;
            } else {
                throw new Exception("Data non accettabile!");
            }
        } else {
            throw new Exception("Data di Produzione Nulla!");
        }
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) throws Exception {
        if (targa != null) {
            if (Pattern.matches("^[A-Z]{2}[0-9]{3}[A-Z]{2}$", targa)) {
                this.targa = targa;
            } else {
                throw new Exception("Targa non accettabile!");
            }
        } else {
            throw new Exception("Targa Nulla!");
        }
    }

    public Persona8A getAutista() {
        return autista;
    }

    public void setAutista(Persona8A autista) throws Exception {
        if (autista != null) {
            if (autista.getNome() != null && autista.getCognome() != null) {
                this.autista = autista;
            } else {
                throw new Exception("Inserire Nome e Cognome!");
            }
        } else {
            throw new Exception("Autista Nullo!");
        }
    }

    public Persona8A[] getPasseggeri() {
        return passeggeri.clone();
    }

    public void setPasseggeri(Persona8A[] passeggeri) throws Exception {
        if (passeggeri != null) {
            if (passeggeri.length > 0) {
                for (int i = 0; i < passeggeri.length; i++) {
                    if (passeggeri[i] != null && passeggeri[i].getNome() != null) {
                        this.passeggeri[i] = passeggeri[i];
                    } else {
                        throw new Exception("Uno dei passeggeri è nullo o il nome non è stato inserito!");
                    }
                }
            } else {
                throw new Exception("Array Vuoto!");
            }
        } else {
            throw new Exception("Array Nullo!");
        }
    }

    public void aggiungiPasseggiero(Persona8A passeggero) throws Exception {
        if (passeggero != null) {
            Persona8A[] passeggeri = new Persona8A[this.passeggeri.length + 1];
            passeggeri = this.passeggeri.clone();
            passeggeri[passeggeri.length - 1] = passeggero;

            setPasseggeri(passeggeri);
        } else {
            throw new Exception("Passeggero Nullo!");
        }
    }

    public void rimuoviPasseggero(Integer posizione) throws Exception {
        if (posizione != null) {
            Persona8A[] passeggeri = new Persona8A[this.passeggeri.length - 1];

            for (int i = 0; i < posizione; i++) {
                passeggeri[i] = this.passeggeri[i];
            }

            for (int i = posizione; i < passeggeri.length; i++) {
                passeggeri[i] = this.passeggeri[i + 1];
            }

            setPasseggeri(passeggeri);
        } else {
            throw new Exception("Posizione Nulla!");
        }
    }

    public void rimuoviPasseggero(String nome) throws Exception {
        if (nome != null) {
            Integer posizione = -1;

            for (int i = 0; i < this.passeggeri.length; i++) {
                if (passeggeri[i].getNome().equals(nome)) {
                    posizione = i;
                    rimuoviPasseggero(posizione);
                }
            }

            if (posizione == -1) {
                throw new Exception("Nome inserito non presente tra i passeggeri!");
            }
        } else {
            throw new Exception("Nome nullo!");
        }
    }

    public void rimuoviUltimoPasseggero() throws Exception {
        Integer posizione = this.passeggeri.length - 1;
        rimuoviPasseggero(posizione);
    }

    @Override
    public String info() {
        String testo = super.info();

        if (dataDiProduzione != null) {
            testo += "Data di Produzione: " + dataDiProduzione + "\n";
        }
        if (targa != null) {
            testo += "Targa: " + targa + "\n";
        }
        if (autista != null) {
            testo += "Autista: " + autista.getNome() + autista.getCognome() + "\n";
        } else {
            testo += "Autista: " + "\n";
        }
        if (passeggeri != null) {
            testo += "Passeggeri: ";

            for (int i = 0; i < passeggeri.length; i++) {
                testo += passeggeri[i].getNome() + ", ";
            }

            testo += "\n";
        } else {
            testo += "Passeggeri: " + "\n";
        }

        return testo;
    }

}
