package teoria;

/**
 *
 * @author luca.negriolli 4INA
 */
public class Mammiferi {

    private String nome;
    private int durataDiVita;
    private String specie;
    private float peso;

    public Mammiferi() {
    }

    public Mammiferi(String nome, int durataDiVita, String specie, float peso) {
        this.nome = nome;
        this.durataDiVita = durataDiVita;
        this.specie = specie;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDurataDiVita() {
        return durataDiVita;
    }

    public void setDurataDiVita(int durataDiVita) {
        this.durataDiVita = durataDiVita;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Controlla se l'animale è insovrappeso
     *
     * @param peso
     * @return
     */
    public boolean isInsovrappeso(int peso) {
        return true;
    }

    /**
     * Ritorna in base alla lunghezza di vita stimata quanto gli manca da vivere
     *
     * @param durataDiVita
     * @return
     */
    public int morteStimata(int durataDiVita) {
        return 1;
    }

    /**
     * Ritorna il tipo di habitat in cui dovrebbe vivere
     *
     * @return
     */
    public String habitat() {
        return "";
    }

    /**
     * Metodo che ritorna tutte le info generiche
     *
     * @return
     */
    public String info() {
        return "";
    }

}
