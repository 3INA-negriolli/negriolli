package cicli;

/**
 * Classe che serve a visualizzare n numeri pari o dispari dopo lo 0
 * 
 * @author luca.negriolli 3INA 2023
 * @version 1.00
 */
public class NumeriPariDispari1 {

    /**
     * Metodo che restituisce un menu
     *
     * @return
     */
    public static String menu() {
        String testo;
        testo = "1 - Instanziare l'oggetto" + "\n" +
                "2 - visualizzazione numeri Pari" + "\n" +
                "3 - visualizzazione numeri Dispari" + "\n" +
                "4 - uscita" + "\n";
        
        return testo;
    }

    /**
     * Metodo che resituisce i primi n numeri dispari
     *
     * @return
     */
    public static String primiNNumeriDispari(int numero) {
        String testo = "I primi n numeri dispari sono: ";
        int risultato = 1;
        int i = 0;

        for (i = i; i < numero; i++) {
            testo += risultato + "\n";
            risultato += 2;
        }
        return testo;
        
    }

    /**
     * Metodo che resituisce i primi n numeri pari
     *
     * @return
     */
    public static String primiNNumeriPari(int numero) {
        String testo = "I primi n numeri pari sono: ";
        int risultato = 0;
        int i = 0;

        while (i < numero) {
            risultato += 2;
            testo += risultato + "\n";
            i++;
        }
        return testo;
    }
}
