package eccezioni;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luca.negriolli
 * @version 1.0
 */
public class Studente3 extends Studente2 implements Cloneable {
    
    public Studente3() {
        super();
    }
    
    public Studente3(Integer classe, Boolean isRipetente, Double altezza, String cognome, String nome, Double peso, String dataDiNascita, String email, String password) throws Exception {
        super(classe, isRipetente, altezza, cognome, nome, peso, dataDiNascita, email, password);
    }
    
    @Override
    protected Studente3 clone() {
        Studente3 s = null;
        try {
            s = new Studente3(super.getClasse(), super.getIsRipetente(), super.getAltezza(),
                    super.getCognome(), super.getNome(), super.getPeso(), super.getDataDiNascita(), super.getEmail(), super.getPassword());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return s;
    }
    
    @Override
    public boolean equals(Object og) {
        
        if (og != null && og instanceof Studente3) {
            if (this == og) {
                return true;
            }
            
            Studente3 std = (Studente3) og;
            if (super.getClasse().equals(std.getClasse())
                    && super.getIsRipetente().equals(std.getIsRipetente())
                    && super.getAltezza().equals(std.getAltezza())
                    && super.getCognome().equals(std.getCognome())
                    && super.getNome().equals(std.getNome())
                    && super.getPeso().equals(std.getPeso())
                    && super.getDataDiNascita().equals(std.getDataDiNascita())
                    && super.getEmail().equals(std.getEmail())
                    && super.getPassword().equals(std.getPassword())) {
                return true;
            }else{
                return false;
            }
        } else {
            return false;
        }
    }
    
    /*
    @Override
    public int hashcode(){
        //...
    }
    */
    
    @Override
    public String toString(){
        String t = super.info();
        
        return t;
    }
    
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        Studente3.numeroIstanze--;
    }
    
    
}
