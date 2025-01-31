package eccezioni;

/**
 * Classe Studente1
 *
 * @author luca.negriolli 4INA
 * @version 1.0
 */
public class Studente1 extends Persona8A {

    public final String SCUOLA = "I.T.T Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private Float[] voti;

    public Studente1() throws Exception {
        super();
    }

    public Studente1(Integer classe, Boolean isRipetente, Double altezza, String cognome, String nome, Double peso, String dataDiNascita, String email, String password) throws Exception {
        super(altezza, cognome, nome, peso, dataDiNascita, email, password);
        setIsRipetente(isRipetente);
        setClasse(classe);
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

    public Float[] getVoti() {
        return voti.clone();
    }

    public void setVoti(Float[] voti) throws Exception {
        if (voti != null) {
            for (int i = 0; i < voti.length; i++) {
                if (voti[i] >= 0 && voti[i] <= 10) {
                    ;
                } else {
                    throw new Exception("Uno dei voti non è accettabile");
                }
            }
            this.voti = voti.clone();
        } else {
            throw new Exception("Array nullo");
        }
    }

    public void aggiungiVoto(Float voto) throws Exception {
        if (voto != null) {
            if (voto >= 0 && voto <= 10) {
                Float[] voti = new Float[this.voti.length + 1];

                voti = this.voti.clone();
                voti[voti.length - 1] = voto;
                setVoti(voti);
            } else {
                throw new Exception("Voto non ammissibile");
            }
        } else {
            throw new Exception("Voto nullo");
        }
    }

    public void rimuoviVoto(Integer posizione) throws Exception {
        if (posizione != null) {
            Float[] nuoviVoti = new Float[this.voti.length - 1];
            if (posizione >= 0 && posizione < voti.length) {
                for (int i = 0; i < posizione; i++) {
                    nuoviVoti[i] = voti[i];
                }

                for (int i = posizione + 1; i < voti.length; i++) {
                    nuoviVoti[i - 1] = voti[i];
                }

                setVoti(nuoviVoti);
            } else {
                throw new Exception("Posizione errata");
            }
        } else {
            throw new Exception("Posizione nulla");
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

    private Float votoMinore() {
        Float voto = voti[0];

        for (int i = 0; i < voti.length; i++) {
            if (voti[i] < voto) {
                voto = voti[i];
            }
        }

        return voto;
    }

    private Float votoMaggiore() {
        Float voto = voti[0];

        for (int i = 0; i < voti.length; i++) {
            if (voti[i] > voto) {
                voto = voti[i];
            }
        }

        return voto;
    }

    private Float mediaVoti() {
        Float media = null;

        for (int i = 0; i < voti.length; i++) {
            media += voti[i];
        }

        media = media / voti.length;

        return media;
    }

    public static void main(String[] args) {

    }

}
