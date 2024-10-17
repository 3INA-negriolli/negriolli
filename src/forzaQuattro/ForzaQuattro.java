package forzaQuattro;

/**
 * Implementare il gioco forza quattro
 *
 * @author luca.negriolli
 */
public class ForzaQuattro {

    private final int RIGHE = 6;
    private final int COLONNE = 7;
    private String[][] campo;

    public ForzaQuattro() {
        String campo[][] = new String[RIGHE][COLONNE];
    }

    private boolean postoLibero(int colonne) {
        boolean rit = false;

        for (int i = 5; i >= 0; i--) {
            if (campo[i][colonne].equals(null)) {
                rit = true;
            }
        }

        return rit;
    }

    private int postoGioco(int colonne) {
        int rit = 0;
        boolean uscita = false;
        int i = 5;

        do {
            if (campo[i][colonne].equals(null)) {
                uscita = true;
                rit = i;
            } else {
                i--;
            }

        } while (uscita != true);

        return rit;
    }

    public String turno() {
        int i = 2;

        if (i % 2 == 0) {
            i--;
            return "X";
        } else {
            i++;
            return "O";
        }
    }

    public boolean inserimento(int colonne) {
        if (postoLibero(colonne)) {
            campo[postoGioco(colonne)][colonne] = turno();
            return true;
        }

        return false;
    }
    
    /*
    Incompleto....  Non so farlo
    */
    public String verificaVittoria(){
        return null;
    }

    public String info() {
        String rit = "";

        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                rit = (campo[i][j] + "\t");
            }
            rit = "\n";
        }
        
        return rit;
    }
    
    
    
}
