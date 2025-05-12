package correzioniVerifiche;

/**
 *
 * @author luca.negriolli
 * @version 1.0
 */
public class PersonaHT {

    private String nome;
    private String dataDiNascita;

    public PersonaHT(String nome, String dataDiNascita) throws Exception {
        setNome(nome);
        setDataDiNascita(dataDiNascita);
    }

    public PersonaHT(PersonaHT persona) throws Exception {
        setNome(persona.nome);
        setDataDiNascita(persona.dataDiNascita);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome != null) {
            if (nome.length() >= 3) {
                String[] s = nome.split("");
                if (s[0].equals(s[0].toUpperCase())) {
                    this.nome = nome;
                } else {
                    throw new Exception("Nome con iniziale minuscola");
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
            this.dataDiNascita = dataDiNascita;
        } else {
            throw new Exception("Data di nascita nulla");
        }
    }

    @Override
    public String toString() {
        return nome + " " + dataDiNascita;
    }

}
