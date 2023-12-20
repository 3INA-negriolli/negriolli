package teoria;

/**
 *
 * @author luca.negriolli
 */
public class AnagrafeTest {

    
    public static void main(String[] a) {
// definisco 3 utenti di tipo Anagrafe
Anagrafe utente1 = new Anagrafe("Mario", "Rossi", 12, 11, 1956);
Anagrafe utente2 = new Anagrafe("Franco", "Bianchi", 10, 3, 1979);
Anagrafe utente3 = new Anagrafe("Ada", "Verdi", 11, 11, 1911);
// stampo i dati dei tre utenti:
System.out.println();
System.out.println(utente1.stampaDati());
System.out.println(utente2.stampaDati());
System.out.println(utente3.stampaDati());
System.out.println();
}
}