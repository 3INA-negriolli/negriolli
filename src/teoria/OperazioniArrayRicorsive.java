package teoria;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe che gestisce le 4 operazioni su un array di numeri o interi o reali
 *
 * @author luca.negriolli 4INA 2/01/2025
 * @version 1.0
 */
public class OperazioniArrayRicorsive<T extends Number> {

    private T[] numeri;
    private static int numeroIstanze;

    /**
     * Costruttore senza parametri
     */
    public OperazioniArrayRicorsive() {
        numeroIstanze++;
    }

    /**
     * Costruttore con parametri
     * @param numeri
     * @throws Exception 
     */
    public OperazioniArrayRicorsive(T[] numeri) throws Exception {
        setNumeri(numeri);
        numeroIstanze++;
    }
    
    /**
     * Getter
     * @return 
     */
    public T[] getNumeri() {
        return numeri;
    }

    /**
     * Setter
     * @param numeri
     * @throws Exception 
     */
    public void setNumeri(T[] numeri) throws Exception {
        if (numeri != null) {
            if (numeri instanceof Integer[] || numeri instanceof Double[]) {
                if (numeri.length >= 1) {
                    this.numeri = numeri;
                } else {
                    throw new Exception("Array vuoto");
                }
            }else{
                throw new Exception("Classe Wrapper non accettabile");
            }
        } else {
            throw new Exception("Array nullo");
        }
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    /**
     * Metodo che in base al tipo assegnato a T assegna all'array numeri casuali
     * interi o reali
     */
    public void riempiArrayCasuale() {
        Random r = new Random();
        for (int i = 0; i < numeri.length; i++) {
            if (numeri instanceof Integer[]) {
                numeri[i] = (T) (Integer) (r.nextInt(100));
            } else if (numeri instanceof Double[]) {
                numeri[i] = (T) (Double) (r.nextDouble() * 100);
            }
        }
    }

    /**
     * Metodo ricorsivo per sommare gli elementi
     *
     * @param i
     * @return
     */
    public Double sommaRicorsiva(int i) {
        if (i == numeri.length) {
            return 0.0; // Caso base
        }
        return numeri[i].doubleValue() + sommaRicorsiva(i + 1);
    }

    /**
     * Metodo ricorsivo per moltiplicare gli elementi
     *
     * @param i
     * @return
     */
    public Double prodottoRicorsivo(int i) {
        if (i == numeri.length) {
            return 1.0; // Caso base
        }
        return numeri[i].doubleValue() * prodottoRicorsivo(i + 1);
    }

    /**
     * Metodo ricorsivo per calcolare la differenza
     *
     * @param i
     * @return
     */
    public Double differenzaRicorsiva(int i) {
        if (i == numeri.length) {
            return 0.0; // Caso base
        }
        return numeri[i].doubleValue() - differenzaRicorsiva(i + 1);
    }

    /**
     * Metodo ricorsivo per calcolare la divisione
     *
     * @param i
     * @return
     */
    public Double divisioneRicorsiva(int i) {
        if (i == numeri.length) {
            return 1.0; // Caso base
        }
        return numeri[i].doubleValue() / divisioneRicorsiva(i + 1);
    }
    
    public String info(){
        String testo = "";
        
        for (int i = 0; i < numeri.length; i++) {
            testo += "[" + numeri[i] + "]";
        }
        
        return testo;
    }

    public static void main(String[] args) {
        try {
            Integer[] numeri = new Integer[8];
            OperazioniArrayRicorsive<Integer> op = new OperazioniArrayRicorsive<>(numeri);
            op.riempiArrayCasuale();

            System.out.println(op.info());
            
            System.out.println("Prodotto: " + op.prodottoRicorsivo(0));
            System.out.println("Somma: " + op.sommaRicorsiva(0));
            System.out.println("Differenza ricorsiva: " + op.differenzaRicorsiva(0));
            System.out.println("Divisione ricorsiva: " + op.divisioneRicorsiva(0));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
