package tris;

public class Tris {
    private String g1;
    private String g2;

    private String[][] campodaGioco = {
        {"□", "□", "□"},
        {"□", "□", "□"},
        {"□", "□", "□"}
    };

    public Tris(String g1, String g2) {
        this.g1 = g1;
        this.g2 = g2;
    }

    public String getG1() {
        return g1;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }

    public String getG2() {
        return g2;
    }

    public void setG2(String g2) {
        this.g2 = g2;
    }

    public boolean turno() {
        int countX = 0;
        int countO = 0;

        for (int i = 0; i < campodaGioco.length; i++) {
            for (int j = 0; j < campodaGioco[i].length; j++) {
                if (campodaGioco[i][j].equals("X")) {
                    countX++;
                } else if (campodaGioco[i][j].equals("O")) {
                    countO++;
                }
            }
        }

        return countX <= countO;
    }

    public void posiziona(int x, int y) {
        if (campodaGioco[x][y].equals("□")) {
            if (turno()) {
                campodaGioco[x][y] = "O";
            } else {
                campodaGioco[x][y] = "X";
            }
        } else {
            System.out.println("posizione gia presa");
        }
    }

    public void posiziona(String xStr, String yStr) {
        int x = Integer.parseInt(xStr);
        int y = Integer.parseInt(yStr);
        posiziona(x, y);
    }

    public String stampa() {
        StringBuilder matrice = new StringBuilder();

        for (int i = 0; i < campodaGioco.length; i++) {
            for (int j = 0; j < campodaGioco[i].length; j++) {
                matrice.append(campodaGioco[i][j]).append(" ");
            }
            matrice.append("\n");
        }

        return matrice.toString();
    }
}
