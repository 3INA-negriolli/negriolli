package eccezioni;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PoligonoRegolareTest {

    public static void main(String[] args) {
        PoligonoRegolare p = null;
        
        try {
            p = new PoligonoRegolare(5, -20f);

            System.out.println(p.perimetro());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        try{
            System.out.println(p.perimetro());
        }catch (Exception ex){
            System.out.println("L'oggetto non è stato istanziato");
        }

    }

}
