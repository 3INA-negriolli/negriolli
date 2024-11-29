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

    public void setTarga(String targa) throws Exception{             
        Integer n1, n2, n3;
        
        try{
            String s1 = targa.substring(2, 3);
            
            n1 = Integer.parseInt(s1);
            n2 = Integer.parseInt(targa.substring(3, 4));
            n3 = Integer.parseInt(targa.substring(4, 5));
        } catch (NumberFormatException ex) {
            throw new Exception("sintassi errata");
        } catch (IndexOutOfBoundsException ex){
            throw new Exception("troppo corto");
        } catch (NullPointerException ex) {
            throw new Exception("valore nullo!");
        }
            
        
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        
        //verificare la sintassi AA123BB
        //verificare che i caratteri siano maiuscoli
        //verificare che la somma dei numeri sia al massimo 20        
    }        
    
    public static void main(String[] args) {
     
        try {
            Auto a = new Auto(null);
        
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
       
        
    }
}
