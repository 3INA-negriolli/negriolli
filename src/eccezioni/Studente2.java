package eccezioni;

import java.util.ArrayList;

/**
 *
 * @author luca.negriolli 4INA
 * @version
 */
public class Studente2 extends Persona8A {

    public final String SCUOLA = "I.T.T Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private ArrayList<Float> voti;

    public Studente2() {
        super();
        this.voti = new ArrayList<>();
    }

    public Studente2(Integer classe, Boolean isRipetente, Double altezza, String cognome, String nome, Double peso, String dataDiNascita, String email, String password) throws Exception {
        super(altezza, cognome, nome, peso, dataDiNascita, email, password);
        setIsRipetente(isRipetente);
        setClasse(classe);
        this.voti = new ArrayList<>();
    }

    public String getSCUOLA() {
        return SCUOLA;
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) throws Exception {
        if (classe != null) {
            if (classe >= 1 && classe <= 5) {
                this.classe = classe;
            } else {
                throw new Exception("Classe errata");
            }
        } else {
            throw new Exception("Classe nulla");
        }
    }

    public Boolean getIsRipetente() {
        return isRipetente;
    }

    public void setIsRipetente(Boolean isRipetente) throws Exception {
        if (isRipetente != null) {
            this.isRipetente = isRipetente;
        } else {
            throw new Exception("Ripetente nullo");
        }
    }

    public ArrayList<Float> getVoti() {
        return (ArrayList<Float>) voti.clone();
    }

    public void setVoti(ArrayList<Float> voti) throws Exception {
        if (voti != null) {
            if (voti.size() != 0) {
                this.voti = (ArrayList<Float>) voti.clone();
            } else {
                throw new Exception("Array vuoto");
            }
        } else {
            throw new Exception("Array nullo");
        }
    }

    public void aggiungiVoto(Float voto) throws Exception {
        if (voto != null) {
            if (voto >= 3 && voto <= 10) {
                if (voto % 0.25 == 0) {
                    voti.add(voto);
                } else {
                    throw new Exception("Voto non ammissibile");
                }
            } else {
                throw new Exception("Voto non ammissibile");
            }
        } else {
            throw new Exception("Voto nullo");
        }
    }

    public void rimuoviVoto(Integer posizione) throws Exception {
        if (posizione != null) {
            if (posizione >= 3 && posizione < voti.size()) {
                voti.remove(Integer.valueOf(posizione));
            } else {
                throw new Exception("Posizione errata");
            }
        } else {
            throw new Exception("Posizione nulla");
        }
    }

    public void rimuoviVoto(Float voto) throws Exception {
        if (voto != null) {
            if (voto >= 3 && voto <= 10) {
                voti.remove(voto);
            } else {
                throw new Exception("Voto errato");
            }
        } else {
            throw new Exception("Voto nullo");
        }
    }

    public void rimuoviUltimoVoto() {
        voti.remove(voti.size() - 1);
    }

    public void ordinaVotiCrescente() {
        for (int i = 0; i < voti.size() - 1; i++) {
            for (int j = 0; j < voti.size() - 1 - i; j++) {
                if (voti.get(j) > voti.get(j + 1)) {
                    float temp = voti.get(j);
                    voti.set(j, voti.get(j + 1));
                    voti.set(j + 1, temp);
                }
            }
        }
    }

    public void ordinaVotiDecrescente() {
        for (int i = 0; i < voti.size() - 1; i++) {
            for (int j = 0; j < voti.size() - 1 - i; j++) {
                if (voti.get(j) < voti.get(j + 1)) {
                    float temp = voti.get(j);
                    voti.set(j, voti.get(j + 1));
                    voti.set(j + 1, temp);
                }
            }
        }
    }

    public Boolean promuovi() throws Exception {
        Boolean promosso = false;

        if (classe == 5) {
            throw new Exception("Non si può promuovere");
        }

        if (mediaVoti() >= 5.75) {
            setClasse(classe + 1);
            promosso = true;
            setIsRipetente(false);
        }

        return promosso;
    }

    public Boolean promuovi(Integer numeroClassi) throws Exception {
        Boolean promosso = false;
        if (numeroClassi != null) {
            if (numeroClassi >= 2 && numeroClassi <= 4) {

                if (mediaVoti() >= 7) {
                    setClasse(classe + numeroClassi);
                    promosso = true;
                    setIsRipetente(false);
                }

            } else {
                throw new Exception("Numero di classi errato");
            }
        } else {
            throw new Exception("Numero di classi nullo");
        }

        return promosso;
    }

    @Override
    public String info() {
        String testo = super.info();

        testo += "\n" + "Istituto " + SCUOLA + "\n"
                + "Classe: " + getClasse() + "\n";

        return testo;
    }

    public Float votoMinore() {
        Float voto = voti.get(0);

        for (int i = 0; i < voti.size(); i++) {
            if (voti.get(i) < voto) {
                voto = voti.get(i);
            }
        }

        return voto;
    }

    public Float votoMaggiore() {
        Float voto = voti.get(0);

        for (int i = 0; i < voti.size(); i++) {
            if (voti.get(i) > voto) {
                voto = voti.get(i);
            }
        }

        return voto;
    }

    public Float mediaVoti() {
        Float media = null;

        for (int i = 0; i < voti.size(); i++) {
            media += voti.get(i);
        }

        media = media / voti.size();

        return media;
    }

    public static void main(String[] args) {

    }

}
