package teoria;

import java.util.Scanner;

public class Studente2Test {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String nome, cognome;
        int matricola;
        
        System.out.print("Inserire il nome dello studente: ");
        nome = in.nextLine();
        
        System.out.print("Inserire il cognome dello studente: ");
        cognome = in.nextLine();
        
        Studente2 s = new Studente2(nome, cognome);
        
        System.out.print("Inserire il nome dello studente: ");
        nome = in.nextLine();
        
        System.out.print("Inserire il cognome dello studente: ");
        cognome = in.nextLine();
        
        Studente2 s1 = new Studente2(nome, cognome);
        
        System.out.println(s.stampaDati());
        
        System.out.println(s1.stampaDati());
        
        System.out.println("La prossima matricola è: " + Studente2.prossimaMatricola());
        System.out.println("Reinserire nome e cognome del primo studente: ");
        s.setNome(in.next());
        s.setCognome(in.next());
        
        System.out.println(s.stampaDati());
    }
    
}
