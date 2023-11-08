package teoria;

import java.util.Scanner;

public class PersonaTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String nome,cognome,email;
        
        System.out.println("Inserire il nome della persona: ");
        nome = in.nextLine();
        
        System.out.println("Inserire il cognome della persona: ");
        cognome = in.nextLine();
        
        System.out.println("Inserire l'email della persona: ");
        email = in.nextLine();
        
        Persona p1 = new Persona(nome, cognome, email);
        
        System.out.println("Dati in input: ");
        System.out.println(p1.info());
        
        System.out.print(p1.registrazioneAvvenuta());
        
    }
    
}
