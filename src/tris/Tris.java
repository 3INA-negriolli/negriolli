package tris;

import java.util.Scanner;

/**
 * 
 * @author luca.negriolli
 */
public class Tris {
    
    private String g1, g2;

    private String[][] campoDaGioco = new String[3][3];

    public Tris() {

    }

    public Tris(String g1) {
        this.g1 = g1;
    }

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

    public String[][] getCampoDaGioco() {
        String[][] campo = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                campo[i][j] = campoDaGioco[i][j];
            }
        }

        return campo;
    }
    
    public boolean controllo(String[][] campo){
        boolean vittoria = false;
        int j = 0,i = 0;
        
        //controllo righe
        while(j < 3 && vittoria != true){
            if(campo[j][i].equals(campo[j][i+1].equals(campo[j][i+2]))){
                vittoria = true;
            }
            j++;
        }
        j = 0;
        
        //controllo colonne
        while(i < 3 && vittoria != true){
            if(campo[j][i].equals(campo[j+1][i].equals(campo[j+2][i]))){
                vittoria = true;
            }
            i++;
        }
        i = 0;
        
        //controllo obliquo
        if(campo[j][i].equals(campo[j+1][i+1].equals(campo[j+2][i+2]))){
            vittoria = true;
        }
        
        if(campo[j][i+2].equals(campo[j+1][i+1].equals(campo[j+2][i]))){
            vittoria = true;
        }
        
        return vittoria;
        
    }

    public boolean mossaG1(int posX, int posY) {
        boolean rit = false;

        if (isValidoPos(posX, posY)) {
            campoDaGioco[posX][posY] = "X";
            rit = true;
        }
        
        return rit;
    }

    public boolean mossaG2(int posX, int posY) {
        boolean rit = false;

        if (isValidoPos(posX, posY)) {
            campoDaGioco[posX][posY] = "O";
            rit = true;
        }
        
        return rit;
    }

    public boolean isValidoPos(int posX, int posY) {
        boolean rit = false;
        if (campoDaGioco[posX][posY] == null) {
            rit = true;
        }
        return rit;
    }

    /*
    public String tabella() {
        String testo = "";

        for (int i = 0; i < 3; i++) {
            testo += "\n";
            for (int j = 0; j < 3; j++) {
                testo += "" + (campoDaGioco[i][j] + " ");
            }
        }

        return testo;
    }
    */
    
    public int moneta(){
        int n1;
        int n=(int) (Math.random() * 2);
        if(n==0){
            n1=0;     
        }else{
            n1=1;
        }
        
        return n1;
    }

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Tris t = new Tris();
        
        System.out.println(t.moneta());
        System.out.println(t.moneta());
        System.out.println(t.moneta());
        System.out.println(t.moneta());
        System.out.println(t.moneta());
        System.out.println(t.moneta());
        System.out.println(t.moneta());
        System.out.println(t.moneta());

    }

}
