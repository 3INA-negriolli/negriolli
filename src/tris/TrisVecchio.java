package tris;

/**
 *
 * @author luca.negriolli
*/ 
public class TrisVecchio {

    private String g1;
    private String g2;
    private String campoDaGioco[][];
    int t = 0;

    public TrisVecchio() {
    }

    public TrisVecchio(String g1, String g2, int campoDaGioco[][]) {
        this.g1 = g1;
        this.g2 = g2;
        this.campoDaGioco = new String[3][3];
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

    public String[][] getCampoDaGioco() {
        return campoDaGioco;
    }

    public void aggiungiElementoPerPosizione(String valore, int riga, int colonna) {
        if (isValido(valore)) {
            if(turno() == 1){
                campoDaGioco[riga][colonna] = valore;
            }
            
        }

    }

    public int turno() {
        int turno = 0;
        
        if(t % 2 == 0){
            turno = 1;
        }else{
            turno = 2;
        }
        
        t++;

        return turno;
    }

    public boolean isValido(String valore) {
        boolean valido = false;

        if (valore.equalsIgnoreCase("x") || valore.equalsIgnoreCase("o")) {
            valido = true;
        }

        return valido;

    }

}
