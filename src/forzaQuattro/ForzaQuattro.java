package forzaQuattro;

/**
 * Implementare il gioco forza quattro
 *
 * @author luca.negriolli
 */
public class ForzaQuattro {

    private int righe = 6;
    private int colonne = 7;
    private String[][] tabella = new String[righe][colonne];

    public ForzaQuattro(int righe, int colonne) {
        this.righe = righe;
        this.colonne = colonne;
    }

    private boolean postoLibero(int colonne) {
        boolean rit = true;

        for (int i = 0; i < 6; i++) {
            if (tabella[i][colonne].equals(null)) {
                rit = false;
            }
        }

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

    public boolean inserimento(int colonne, int righe) {
        if (postoLibero(colonne)) {
            tabella[righe][colonne].equals(turno());
            return true;
        }

        return false;
    }
    
    public String info(){
        String rit = "";
        
        rit = "";
                
        return rit;
    }
}


