/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tris;

import java.util.Scanner;
/**
 *
 * @author dennis.faes
 */
public class TrisCorrettoTest {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        
        String giocatoreX = "c", giocatoreO = "v";
        
        TrisCorretto t = new TrisCorretto(3, giocatoreX, giocatoreO);
        
        boolean vincita = true;
        
        while(vincita){
            System.out.print("Il campo è: " + t.info());
            int x,o;
            
            System.out.println("Inserire la posizione della riga: ");
            x = in.nextInt();
            
            System.out.println("Inserire la posizione della colonna: ");
            o = in.nextInt();
            
            String s = t.gioca(x, o);
            
            if(s.equals("X")){
                System.out.println("Il vincitore è il primo giocatore ");
                vincita = false;
            }else if (s.equals("O")){
                System.out.println("Il vincitore è il secondo giocatore ");
                vincita = false;
            }else if (s.equals("=")){
                System.out.println("Parità ");
                vincita = false;
            }else{
                System.out.println("Non ha ancora vinto nessuno");
            }
        
        
        }
    }
    
}
