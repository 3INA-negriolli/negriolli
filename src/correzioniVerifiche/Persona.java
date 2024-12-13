package correzioniVerifiche;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * Classe Persona
 *
 * @author Luca Negriolli 4INA 06/12/2024
 */
public class Persona {

    private Double altezza;
    private String nome;
    private String dataDiNascita;
    private static int numeroIstanze;

    public Persona() {
        numeroIstanze++;
    }

    public Persona(Double altezza, String nome, String dataDiNascita) throws Exception {
        setNome(nome);
        setAltezza(altezza);
        setDataDiNascita(dataDiNascita);

        numeroIstanze++;
    }

    public Persona(Persona p) throws Exception {
        setNome(p.getNome());
        setAltezza(p.getAltezza());
        setDataDiNascita(p.getDataDiNascita());

        numeroIstanze++;
    }

    public Double getAltezza() {
        return altezza;
    }

    public void setAltezza(Double altezza) throws Exception {
        Random r = new Random();

        Double n1 = r.nextDouble() * 20;
        Double n2 = r.nextDouble() * 20;

        if (altezza != null) {
            if (n1 < n2) {
                if (altezza > n1 && altezza < n2) {
                    this.altezza = altezza;
                } else {
                    throw new Exception("Altezza non accettabile");
                }
            } else {
                if (altezza < n1 && altezza > n2) {
                    this.altezza = altezza;
                } else {
                    throw new Exception("Altezza non accettabile");
                }
            }
        } else {
            throw new Exception("Altezza nulla");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome != null) {
            if (nome.length() >= 3) {
                if (nome.substring(0, 1).equals(nome.substring(0, 1).toUpperCase())) {
                    if (nome.substring(1, nome.length() - 1).equals(nome.substring(1, nome.length() - 1).toLowerCase())) {
                        this.nome = nome;
                    } else {
                        throw new Exception("Nome non minuscolo dopo l'iniziale");
                    }
                } else {
                    throw new Exception("Prima lettera non maiuscola");
                }
            } else {
                throw new Exception("Nome troppo corto");
            }
        } else {
            throw new Exception("Nome nullo");
        }
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) throws Exception {
        if (dataDiNascita != null) {
            Integer giorno, mese, anno;
            String[] str = new String[3];

            str = dataDiNascita.split("/");

            GregorianCalendar dataOdierna = new GregorianCalendar();
            Integer annoAttuale = dataOdierna.get(Calendar.YEAR);
            Integer meseAttuale = dataOdierna.get(Calendar.MONTH) + 1;
            Integer giornoAttuale = dataOdierna.get(Calendar.DAY_OF_MONTH);

            giorno = Integer.parseInt(str[0]);
            mese = Integer.parseInt(str[1]);
            anno = Integer.parseInt(str[2]);

            if (giorno <= 31 && giorno > 0 && mese <= 12 && mese > 0) {
                if (anno == annoAttuale) {
                    if (mese > meseAttuale) {
                        throw new Exception("Mese sbagliato");
                    } else {
                        if (mese == meseAttuale && giorno > giornoAttuale) {
                            throw new Exception("Giorno sbagliato");
                        } else {
                            this.dataDiNascita = dataDiNascita;
                        }
                    }
                } else {
                    if (anno > annoAttuale) {
                        throw new Exception("Anno sbagliato");
                    } else {
                        this.dataDiNascita = dataDiNascita;
                    }
                }
            } else {
                throw new Exception("Data sbagliata");
            }
        } else {
            throw new Exception("Giorno o mese sbagliati");
        }

    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public Integer calcolaEta() {
        Integer eta;
        String[] str = new String[3];

        str = dataDiNascita.split("/");

        GregorianCalendar dataOdierna = new GregorianCalendar();
        Integer annoAttuale = dataOdierna.get(Calendar.YEAR);
        Integer meseAttuale = dataOdierna.get(Calendar.MONTH) + 1;
        Integer giornoAttuale = dataOdierna.get(Calendar.DAY_OF_MONTH);

        eta = annoAttuale - Integer.parseInt(str[2]) - 1;

        if (Integer.parseInt(str[1]) <= meseAttuale && Integer.parseInt(str[0]) <= giornoAttuale) {
            eta++;
        }

        return eta;
    }

    public String info() {
        String testo = "";

        testo = "Nome: " + nome + "\n"
                + "Altezza: " + altezza + "\n"
                + "Data di Nascita: " + dataDiNascita + "\n";

        return testo;
    }

    public Boolean verificaOmonimia(Persona p) throws Exception {
        Boolean rit = false;

        if (p != null && p.nome != null) {
            if (nome.length() == p.nome.length()) {
                rit = true;
                for (int i = 0; i < nome.length(); i++) {
                    if (nome.charAt(i) != p.nome.charAt(i)) {
                        rit = false;
                    }
                }
            } else {
                throw new Exception("Nomi di lunghezza diversa");
            }
        } else {
            throw new Exception("Nome o oggetto nulli");
        }

        return rit;
    }

}
