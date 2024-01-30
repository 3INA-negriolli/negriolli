package teoria;

public class TavPitagorica {

    public TavPitagorica() {
    }

    public String tPita() {
        String testo = "";
        int i = 1;
        int j = 1;

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                testo += i * j + "\t";
            }
            testo += "\n";
        }
        return testo;
    }

}
