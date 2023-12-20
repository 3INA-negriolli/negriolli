package teoria;


public class Studente2 {
    private String nome;
    private String cognome;
    private int matricola = 0;
    private static int ultimaMatricola;

    public Studente2() {
    }

    public Studente2(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        ultimaMatricola++;
        matricola = ultimaMatricola;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public static int getUltimaMatricola() {
        return ultimaMatricola;
    }

    public static void setUltimaMatricola(int ultimaMatricola) {
        Studente2.ultimaMatricola = ultimaMatricola;
    }
    
    public String stampaDati() {
        String testo;
        
        testo = "Nome: " + nome + "\n" +
                "Cognome: " + cognome + "\n" +
                "Numero di matricola: " + matricola + "\n";
                
        return testo;
    }
    
    public static int prossimaMatricola(){
    return Studente2.ultimaMatricola+1;
    }
    
    
}
