package eccezioni;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import eccezioni.DataEasy;

/**
 *
 * @author luca.negriolli
 * @version 1.0
 */
public class Persona8B {

    private Double altezza;
    private String cognome;
    private String nome;
    private Double peso;
    private DataEasy dataDiNascita;
    private String email;
    private String password;
    protected static int numeroIstanze;

    public Persona8B() {
        numeroIstanze++;
    }

    public Persona8B(Double altezza, String cognome, String nome, Double peso, DataEasy dataDiNascita, String email, String password) throws Exception {
        setAltezza(altezza);
        setCognome(cognome);
        setNome(nome);
        setPeso(peso);
        setDataDiNascita(dataDiNascita);
        setEmail(email);
        setPassword(password);
        numeroIstanze++;
    }

    public Persona8B(Persona8B p) throws Exception {
        setAltezza(p.altezza);
        setCognome(p.cognome);
        setNome(p.nome);
        setPeso(p.peso);
        setDataDiNascita(p.dataDiNascita);
        setEmail(p.email);
        setPassword(p.password);
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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) throws Exception {
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

    public DataEasy getDataDiNascita() throws Exception {
        DataEasy d = new DataEasy(dataDiNascita);
        return d;
    }

    public void setDataDiNascita(DataEasy dataDiNascita) throws Exception {
        if (dataDiNascita != null) {
            DataEasy d = new DataEasy(dataDiNascita);
            this.dataDiNascita = d;
        } else {
            throw new Exception("Data Nulla");
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

    public Integer calcolaEta() {
        Integer eta = 0;

        try {
            DataEasy nascita = new DataEasy(dataDiNascita);

            GregorianCalendar dataOdierna = new GregorianCalendar();
            Integer annoAttuale = dataOdierna.get(Calendar.YEAR);
            Integer meseAttuale = dataOdierna.get(Calendar.MONTH) + 1;
            Integer giornoAttuale = dataOdierna.get(Calendar.DAY_OF_MONTH);

            DataEasy dataAntecedente = new DataEasy(nascita);
            DataEasy dataSuccessiva = new DataEasy(giornoAttuale, meseAttuale, annoAttuale);
            eta = DataEasy.differenzaInAnni(dataAntecedente, dataSuccessiva);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return eta;

    }

    public Boolean verificaOmonimia(Persona7 persona) {
        boolean rit = false;

        if (persona.getNome().equals(nome) && persona.getCognome().equals(cognome)) {
            rit = true;
        }

        return rit;
    }

    public String info() throws Exception {
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
        Persona8A p = new Persona8A();

        try {
            p.setDataDiNascita("12/07/2006");
            System.out.println(p.calcolaEta());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
