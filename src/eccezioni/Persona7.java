package eccezioni;

import java.util.regex.Pattern;
import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 *
 * @author luca.negriolli 4INA
 * @version 1.0
 */
public class Persona7 {

    private Double altezza;
    private String cognome;
    private String nome;
    private Float peso;
    private String dataDiNascita;
    private String email;
    private String password;
    private static int numeroIstanze;

    public Persona7() {
        numeroIstanze++;
    }

    public Persona7(Double altezza, String cognome, String nome, Float peso, String dataDiNascita, String email, String password) throws Exception {
        setAltezza(altezza);
        setCognome(cognome);
        setNome(nome);
        setPeso(peso);
        setDataDiNascita(dataDiNascita);
        setEmail(email);
        setPassword(password);
        numeroIstanze++;
    }

    public Double getAltezza() {
        return altezza;
    }

    public void setAltezza(Double altezza) throws Exception {
        if (altezza == null) {
            throw new Exception("Nulla");
        } else {
            if (altezza <= 0) {
                throw new Exception("L'altezza deve essere maggiore di 0");
            } else {
                this.altezza = altezza;
            }
        }
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) throws Exception {
        if (cognome == null) {
            throw new Exception("Nullo");
        } else {
            if (cognome.length() <= 2) {
                throw new Exception("Il cognome deve avere più di due lettere");
            } else {
                if (!Character.isUpperCase(cognome.charAt(0))) {
                    throw new Exception("Il primo valore del cognome deve essere una lettera maiuscola");
                } else {
                    String c = cognome.substring(1);
                    if (!Pattern.matches("[^A-Z]+", c)) {
                        throw new Exception("Il cognome non può avere altre lettere maiuscole oltre la prima");
                    } else if (!Pattern.matches("[a-z]+", c)) {
                        throw new Exception("Il cognome può contenere solo lettere");
                    } else {
                        this.cognome = cognome;
                    }
                }
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("Nullo");
        } else {
            if (nome.length() <= 2) {
                throw new Exception("Il nome deve avere più di due lettere");
            } else {
                if (!Character.isUpperCase(nome.charAt(0))) {
                    throw new Exception("Il primo valore del nome deve essere una lettera maiuscola");
                } else {
                    String n = nome.substring(1);
                    if (!Pattern.matches("[^A-Z]+", n)) {
                        throw new Exception("Il nome non può avere altre lettere maiuscole oltre la prima");
                    } else if (!Pattern.matches("[a-z]+", n)) {
                        throw new Exception("Il nome può contenere solo lettere");
                    } else {
                        this.nome = nome;
                    }
                }
            }
        }
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) throws Exception {
        if (peso == null) {
            throw new Exception("Nullo");
        } else {
            if (peso <= 0) {
                throw new Exception("Peso Errato");
            } else {
                this.peso = peso;
            }
        }
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) throws Exception {
        if (dataDiNascita == null) {
            throw new Exception("Nulla");
        } else {
            if (!Pattern.matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}", dataDiNascita)) {
                throw new Exception("Sintassi Errata!");
            } else {
                String[] str = dataDiNascita.split("/");

                GregorianCalendar dataOdierna = new GregorianCalendar();
                Integer annoAttuale = dataOdierna.get(Calendar.YEAR);
                Integer meseAttuale = dataOdierna.get(Calendar.MONTH) + 1;
                Integer giornoAttuale = dataOdierna.get(Calendar.DAY_OF_MONTH);

                Integer giorno = Integer.parseInt(str[0]);
                Integer mese = Integer.parseInt(str[1]);
                Integer anno = Integer.parseInt(str[2]);

                if (anno > annoAttuale) {
                    throw new Exception("La data inserita supera la data odierna");
                } else {
                    if (anno == annoAttuale) {
                        if (mese > meseAttuale) {
                            throw new Exception("La data inserita supera la data odierna");
                        } else if (mese == meseAttuale && giorno > giornoAttuale) {
                            throw new Exception("La data inserita supera la data odierna");
                        } else {
                            this.dataDiNascita = dataDiNascita;
                        }
                    } else {
                        this.dataDiNascita = dataDiNascita;
                    }
                }
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (email == null) {
            throw new Exception("Nulla");
        } else {
            if (!Pattern.matches("^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}", email)) {
                throw new Exception("L'email deve avere questa sintassi 'nome.cognome@gmail.it'");
            } else {
                this.email = email;
            }
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        if (password == null) {
            throw new Exception("Nulla");
        } else {
            if (password.length() < 8 || password.length() > 16) {
                throw new Exception("La password deve avere tra 8 e 16 caratteri");
            } else if (!password.matches(".*[a-z].*")) {
                throw new Exception("La password deve contenere almeno una lettera minuscola");
            } else if (!password.matches(".*[A-Z].*")) {
                throw new Exception("La password deve contenere almeno una lettera maiuscola");
            } else if (!password.matches(".*[0-9].*")) {
                throw new Exception("La password deve contenere almeno un numero");
            } else if (!password.matches(".*[!@#$%^&*].*")) {
                throw new Exception("La password deve contenere almeno uno dei seguenti simboli: !,@,#,$,%,^,&,*");
            } else {
                this.password = password;
            }
        }
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public Integer calcolaEta() throws Exception {
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

    public Boolean verificaOmonimia(Persona7 persona) {
        boolean rit = false;

        if (persona.nome.equals(nome)) {
            rit = true;
        }

        return rit;
    }

    public String info() {
        String testo = "Informazioni Persona:\n";
        testo += "Altezza: " + getAltezza() + " m\n";
        testo += "Cognome: " + getCognome() + "\n";
        testo += "Nome: " + getNome() + "\n";
        testo += "Peso: " + getPeso() + " kg\n";
        testo += "Data di Nascita: " + getDataDiNascita() + "\n";
        testo += "Email: " + getEmail() + "\n";
        testo += "Password: " + getPassword() + "\n";
        return testo;
    }

    public static void main(String[] args) {
        Persona7 p = new Persona7();

        try {
            System.out.println(p.info());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
