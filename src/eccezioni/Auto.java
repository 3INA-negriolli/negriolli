package eccezioni;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Auto {

    private String targa;

    public Auto() {
    }

    public Auto(String targa) throws Exception {
        setTarga(targa);
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) throws Exception {
        Integer n1, n2, n3;
        String l1, l2, l3, l4;

        try {

            l1 = targa.substring(0, 1);
            l2 = targa.substring(1, 2);
            l3 = targa.substring(5, 6);
            l4 = targa.substring(6, 7);

            if ("1".equals(l1) || "2".equals(l1) || "3".equals(l1) || "4".equals(l1) || "5".equals(l1) || "6".equals(l1) || "7".equals(l1) || "8".equals(l1) || "9".equals(l1) || "0".equals(l1)) {

                throw new Exception("lettera errata");
            }
            if ("1".equals(l2) || "2".equals(l2) || "3".equals(l2) || "4".equals(l2) || "5".equals(l2) || "6".equals(l2) || "7".equals(l2) || "8".equals(l2) || "9".equals(l2) || "0".equals(l2)) {

                throw new Exception("lettera errata");
            }
            if ("1".equals(l3) || "2".equals(l3) || "3".equals(l3) || "4".equals(l3) || "5".equals(l3) || "6".equals(l3) || "7".equals(l3) || "8".equals(l3) || "9".equals(l3) || "0".equals(l3)) {

                throw new Exception("lettera errata");
            }
            if ("1".equals(l4) || "2".equals(l4) || "3".equals(l4) || "4".equals(l4) || "5".equals(l4) || "6".equals(l4) || "7".equals(l4) || "8".equals(l4) || "9".equals(l4) || "0".equals(l4)) {

                throw new Exception("lettera errata");
            }

            if (l1.equals(l1.toLowerCase())) {
                throw new Exception("lettera minuscola");
            }
            if (l2.equals(l2.toLowerCase())) {
                throw new Exception("lettera minuscola");
            }
            if (l3.equals(l3.toLowerCase())) {
                throw new Exception("lettera minuscola");
            }
            if (l4.equals(l4.toLowerCase())) {
                throw new Exception("lettera minuscola");
            }

            n1 = Integer.parseInt(targa.substring(2, 3));
            n2 = Integer.parseInt(targa.substring(3, 4));
            n3 = Integer.parseInt(targa.substring(4, 5));

        } catch (NumberFormatException ex) {
            throw new NumberFormatException("c'e una lettera al posto di un numero");
        } catch (IndexOutOfBoundsException ex) {
            throw new IndexOutOfBoundsException("troppo corto");
        } catch (NullPointerException ex) {
            throw new NullPointerException("valore nullo!");
        }

        if (n1 + n2 + n3 > 20) {
            throw new Exception("la somma dei numeri deve essere max 20");
        }

        //verificare la sintassi AA123BB
        //verificare che i caratteri siano maiuscoli
        //verificare che la somma dei numeri sia al massimo 20        
    }

    public static void main(String[] args) {

        try {
            Auto a = new Auto("TA583BB");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
