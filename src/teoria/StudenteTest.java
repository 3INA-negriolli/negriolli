package teoria;

import java.util.Scanner;

public class StudenteTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float voto;
        String nome,cognome,esito = null;
        
        System.out.print("Inserire il nome: ");
        nome = in.nextLine();
        
        System.out.print("Inserire il cognome: ");
        cognome = in.nextLine();
        
        System.out.print("Inserire il voto: ");
        voto = in.nextFloat();
        
        Studente s = new Studente(nome,cognome,voto,esito);
        
        System.out.println("Dati in Input: ");
        System.out.println(s.info());
        
        System.out.println("Dati di output:");
        System.out.println("L'esito è " + s.setEsito(esito));
    }
    
}

