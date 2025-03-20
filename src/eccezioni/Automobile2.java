package eccezioni;

import eccezioni.Persona8A;
import eccezioni.DataEasy;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Automobile2 extends MezzoDiTrasporto6 {

    private String dataDiProduzione;
    private String targa;
    private Persona8A autista;
    private ArrayList<Persona8A> passeggeri;
    private Integer numeroPosti;
    private Integer classeEnergetica;

    public Automobile2() {
        super();
    }

    public Automobile2(Integer cavalli, Integer cilindrata, String colore, String marca, String dataDiProduzione, String targa, String modello) throws Exception {
        super(cavalli, cilindrata, colore, marca, modello);
        setDataDiProduzione(dataDiProduzione);
        setTarga(targa);
    }

    public String getDataDiProduzione() {
        return dataDiProduzione;
    }

    final public void setDataDiProduzione(String dataDiProduzione) throws Exception {
        DataEasy data = new DataEasy(dataDiProduzione);

        DataEasy dataOdierna = new DataEasy();

        if (DataEasy.differenzaInGiorni(data, dataOdierna) >= 0) {
            this.dataDiProduzione = data.getData(); // this.dataDiProduzione = dataDiProduzione
        } else {
            throw new Exception("La data di produzione non può essere successiva a quella attuale!");
        }
    }

    final public void setDataDiProduzioneGeniale(String dataDiProduzione) throws Exception {
        try {
            Persona8A temp = new Persona8A();

            temp.setDataDiNascita(dataDiProduzione);

            this.dataDiProduzione = temp.getDataDiNascita();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public String getTarga() {
        return targa;
    }

    final public void setTarga(String targa) throws Exception {
        try {
            if (targa.matches("[A-Z]{2}[0-9]{3}[A-Z]{2}")) {
                this.targa = targa;
            } else {
                throw new Exception("L'attributo targa non rispetta i criteri richiesti!");
            }
        } catch (NullPointerException e) {
            throw new Exception("L'attributo targa non può essere nullo!");
        }
    }

    public Integer getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(Integer numeroPosti) throws Exception {
        if (numeroPosti == null) {
            throw new Exception("Il numero dei posti non può essere nullo!");
        }

        if (numeroPosti >= 1 && numeroPosti <= 4) {
            this.numeroPosti = numeroPosti;
        } else {
            throw new Exception("Il numero dei posti deve essere un numero compreso tra 1 e 4");
        }
    }

    public Integer getClasseEnergetica() {
        return classeEnergetica;
    }

    public void setClasseEnergetica(Integer classeEnergetica) throws Exception {
        if (classeEnergetica == null) {
            throw new Exception("La classe energetica non può essere nulla!");
        }

        if (classeEnergetica >= 0 && classeEnergetica <= 6) {
            this.classeEnergetica = classeEnergetica;
        } else {
            throw new Exception("La classe energetica deve essere un numero compreso tra 0 e 6");
        }
    }

    public Persona8A getAutista() {
        Persona8A temp = null;
        try {
            temp = new Persona8A(autista);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return temp;
    }

    public void setAutista(Persona8A autista) throws Exception {
        try {
            if (autista.getNome() != null && autista.getCognome() != null) {
                this.autista = new Persona8A(autista);
            } else {
                throw new Exception("Nome e cognome non possono essere nulli!");
            }

        } catch (NullPointerException e) {
            throw new Exception("L'attributo autista non può essere nullo!");
        }
    }

    public Persona8A[] getPasseggeri() {
        return (Persona8A[]) passeggeri.clone();
    }

    public void setPasseggeri(Persona8A[] passeggeri) throws Exception {
        if (passeggeri == null) {
            throw new Exception("I passeggeri non possono essere nulli!");
        }
        for (int i = 0; i < passeggeri.length; i++) {
            if (passeggeri[i] == null) {
                throw new Exception("Il " + i + "° passeggero non può essere nullo!");
            }
            if (passeggeri[i].getNome() == null) {
                throw new Exception("Il " + i + "° passeggero deve avere un nome");
            }
        }
        for (int i = 0; i < passeggeri.length; i++) {
            this.passeggeri.add(passeggeri[i]);
        }
    }

    public void aggiungiPasseggero(Persona8A passeggero) throws Exception {
        if (passeggero == null) {
            throw new Exception("Il passeggero non può essere nullo!");
        }
        if (passeggero.getNome() == null) {
            throw new Exception("Il passeggero deve avere un nome");
        }
        passeggeri.add(passeggero);
    }

    public void rimuoviPasseggero(int posizione) throws Exception {
        if (passeggeri == null) {
            throw new Exception("L'attributo passeggeri è null!");
        }

        if (passeggeri.isEmpty()) {
            throw new Exception("Nessun passeggero presente!");
        }

        if (posizione < 0 && posizione >= passeggeri.size()) {
            throw new Exception("Posizione non presente!");
        }
        passeggeri.remove(posizione);
    }

    public void rimuoviPasseggero(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("L'attributo nome è null!");
        }
        if (nome.equals("")) {
            throw new Exception("L'attributo nome è vuoto!");
        }
        for (Persona8A p : passeggeri) {
            if (p.getNome().equals(nome)) {
                passeggeri.remove(p);
            }
        }
    }

    public void rimuoviUltimoPasseggero() throws Exception {
        if (passeggeri == null) {
            throw new Exception("L'attributo passeggeri è null!");
        }

        if (passeggeri.isEmpty()) {
            throw new Exception("Nessun passeggero presente!");
        }
        passeggeri.remove(passeggeri.size() - 1);
    }

    public void ordinaPasseggeri() throws Exception {
        //...
    }

    public int calcolaBollo() throws Exception {
        int kw = super.calcolaKw();
        float bollo;
        if (kw > 100) {
            bollo = 100 * 2.8f + (kw - 100) * 4.2f;
        } else {
            bollo = 100 * 2.8f;
        }
        return (int) bollo;
    }

    @Override
    public String info() throws Exception {
        String info = "";

        if (dataDiProduzione != null && targa != null && passeggeri != null) {
            info = super.info();

            info += "Data di produzione : " + dataDiProduzione + "\n"
                    + "Targa              : " + targa + "\n"
                    + "Autista            : " + (autista != null ? autista.getNome() + " " + autista.getCognome() + "\n" : "\n")
                    + "Passeggeri         : ";

            if (passeggeri.size() < 1) {
                info = info + "nessun passeggero presente\n";
            } else {
                for (int i = 0; i < passeggeri.size(); i++) {
                    if (i == passeggeri.size() - 1) {
                        info = info + passeggeri.get(i).getNome();
                    } else {
                        info = info + passeggeri.get(i).getNome() + ", ";
                    }
                }

                info += "\nTotale passeggeri  : " + passeggeri.size();
            }
            return info;
        } else {
            throw new NullPointerException("Uno o più attributi sono nulli!");
        }
    }
}
