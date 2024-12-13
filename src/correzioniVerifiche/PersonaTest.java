package correzioniVerifiche;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Persona p = new Persona(1.5,"Marco","7/12/2000");
            Persona p1 = new Persona(1.7,"Marco","7/10/1996");
            System.out.println(p.verificaOmonimia(p1));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
