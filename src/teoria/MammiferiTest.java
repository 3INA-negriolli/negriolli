package teoria;

public class MammiferiTest {

    public static void main(String[] args) {

        String nome = "Pippo";
        int durataDiVita = 5;
        String specie = "...";
        float peso = 350;

        String nome2 = "Topolino";
        int durataDiVita2 = 12;
        String specie2 = "...";
        float peso2 = (float) 246.3;

        Mammiferi m1 = new Mammiferi(nome, durataDiVita, specie, peso);
        Mammiferi m2 = new Mammiferi(nome, durataDiVita, specie, peso);

    }
}
