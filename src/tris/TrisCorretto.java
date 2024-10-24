package tris;

import java.util.Objects;

public final class TrisCorretto {

    private String[][] campoDaGioco;

    private String giocatoreX;
    private String giocatoreO;

    public TrisCorretto(int dimensione, String giocatoreX, String giocatoreO) {
        campoDaGioco = new String[dimensione][dimensione];

        setGiocatoreX(giocatoreX);
        setGiocatoreO(giocatoreO);

        inizializzaCampoDaGioco();
    }

    public String[][] getCampoDaGioco() {
        return this.campoDaGioco;
    }

    public String getGiocatoreX() {
        return giocatoreX;
    }

    public void setGiocatoreX(String giocatoreX) {
        if (giocatoreValido(giocatoreX)) {
            if (giocatoreX.length() <= 10) {
                this.giocatoreX = giocatoreX;
            }        
        }
    }
   
    public boolean giocatoreValido(String g) {
        boolean valido = false;
        if (g.length() >= 2) {
            valido = true;
        }
        return valido;
    }

    public String getGiocatoreO() {
        return giocatoreO;
    }

    public void setGiocatoreO(String giocatoreO) {
        if (giocatoreValido(giocatoreO)) {
            this.giocatoreO = giocatoreO;
        }
    }

    private void inizializzaCampoDaGioco() {
        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                campoDaGioco[i][j] = " ";
            }
        }
    }

    private boolean isCellaDisponibile(int riga, int colonna) {
        if (Objects.equals(campoDaGioco[riga][colonna], " ")) {
            return true;
        } else {
            return false;
        }
    }

    private String verificaTurnoDiGioco() {
        int contX = 0;
        int contO = 0;

        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                if (Objects.equals(campoDaGioco[i][j], "X")) {
                    contX++;
                }
                if (Objects.equals(campoDaGioco[i][j], "O")) {
                    contO++;
                }
            }
        }

        if (contX > contO) {
            return "O";
        } else {
            return "X";
        }
    }

    private void piazzaSegno(String segno, Integer riga, Integer colonna) {
        if (isCellaDisponibile(riga, colonna)) {
            campoDaGioco[riga][colonna] = segno;
        }
    }

    private String verificaVincitaOParita() {
        // Righe       
        int contX = 0;
        int contO = 0;

        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                if (Objects.equals(campoDaGioco[i][j], "X")) {
                    contX++;
                    if (contX == campoDaGioco.length) {
                        return "X";
                    }
                }

                if (Objects.equals(campoDaGioco[i][j], "O")) {
                    contO++;
                    if (contO == campoDaGioco.length) {
                        return "O";
                    }
                }
            }

            contX = 0;
            contO = 0;
        }

        // Colonne    
        contX = 0;
        contO = 0;

        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                if (Objects.equals(campoDaGioco[j][i], "X")) {
                    contX++;
                    if (contX == campoDaGioco.length) {
                        return "X";
                    }
                }

                if (Objects.equals(campoDaGioco[j][i], "O")) {
                    contO++;
                    if (contO == campoDaGioco.length) {
                        return "O";
                    }
                }
            }

            contX = 0;
            contO = 0;
        }

        // Diagonale principale
        contX = 0;
        contO = 0;

        for (int i = 0; i < campoDaGioco.length; i++) {
            if (Objects.equals(campoDaGioco[i][i], "X")) {
                contX++;
                if (contX == campoDaGioco.length) {
                    return "X";
                }
            }

            if (Objects.equals(campoDaGioco[i][i], "O")) {
                contO++;
                if (contO == campoDaGioco.length) {
                    return "O";
                }
            }
        }

        // Diagonale secondaria
        contX = 0;
        contO = 0;
        int y = 0;

        for (int i = campoDaGioco.length - 1; i >= 0; i--) {
            if (Objects.equals(campoDaGioco[y][i], "X")) {
                contX++;
                if (contX == campoDaGioco.length) {
                    return "X";
                }
            }

            if (Objects.equals(campoDaGioco[y][i], "O")) {
                contO++;
                if (contO == campoDaGioco.length) {
                    return "O";
                }
            }
            y += 1;
        }

        // Parità
        int cont = 0;
        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                if (Objects.equals(campoDaGioco[i][j], "X")
                        || Objects.equals(campoDaGioco[i][j], "O")) {
                    cont++;

                    if (cont == campoDaGioco.length * campoDaGioco.length) {
                        return "=";
                    }
                }
            }
        }

        // Nessuna vincita
        return "";
    }

    public String gioca(int riga, int colonna) {
        if (Objects.equals(verificaTurnoDiGioco(), "X")) {
            piazzaSegno("X", riga, colonna);
        } else {
            piazzaSegno("O", riga, colonna);
        }

        return verificaVincitaOParita();
    }

    public String info() {
        String matrice = "\n┌─────┐\n";

        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                matrice += "│" + campoDaGioco[i][j];
            }
            matrice += "│\n";
        }

        matrice += "└─────┘";
        return matrice;
    }

    public boolean verificaCoordinate(int x, int o) {
        boolean valido = true;

        if (x < 0 || x >= campoDaGioco.length) {
            valido = false;
        }

        if (o < 0 || o >= campoDaGioco.length) {
            valido = false;
        }

        return valido;
    }
}
