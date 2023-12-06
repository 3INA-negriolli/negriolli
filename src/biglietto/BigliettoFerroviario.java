package biglietto;

/**
 *
 * @author luca.negriolli
 */
public class BigliettoFerroviario {
    private float tariffa;
    private String ruolo;

    public BigliettoFerroviario() {
        
    }

    public BigliettoFerroviario(float tariffa, String ruolo) {
        this.tariffa = tariffa;
        this.ruolo = ruolo;
    }

    public float getTariffa() {
        return tariffa;
    }

    public void setTariffa(float tariffa) {
        this.tariffa = tariffa;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
    
    public String info(){
        String testo;
        
        testo = "La tariffa è pari a: " + tariffa + "\n";
        
        return testo;
    }
     
    public float costoBiglietto(){
        float costo;
        float sconto = 0;
        
        if(ruolo.equals("Pensionato"))
            sconto = (tariffa/100)*10;
            costo  = tariffa-sconto;
        if(ruolo.equals("Studente"))
            sconto = (tariffa/100)*15;
            costo  = tariffa-sconto;
        if(ruolo.equals("Disoccupato"))
            sconto = (tariffa/100)*25;
            costo  = tariffa-sconto;
            
        return costo;           
    }
    
  
    
    
    
    
    
    

    
    
}


