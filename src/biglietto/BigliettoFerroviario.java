package biglietto;

/**
 * Classe che calcola il costo di un biglietto ferroviario in base a se si è uno studente, pensionato o disoccupato
 * @author luca.negriolli
 * @version 1.0
 */

public class BigliettoFerroviario {
    private float tariffa;
    private String ruolo;
    
    /**
     * Costruttore senza parametri
     */

    public BigliettoFerroviario() {
        
    }
    
    /**
     * Costruttore con parametri
     * @param tariffa
     * @param ruolo 
     */

    public BigliettoFerroviario(float tariffa, String ruolo) {
        this.tariffa = tariffa;
        this.ruolo = ruolo;
    }
    
    /**
     * Metodo che visualizza il contenuto della variabile tariffa
     * @return 
     */

    public float getTariffa() {
        return tariffa;
    }
    
    /**
     * Metodo che imposta/modifica il contenuto della variabile tariffa
     * @param tariffa 
     */

    public void setTariffa(float tariffa) {
        this.tariffa = tariffa;
    }
    
    /**
     * Metodo che visualizza il contenuto della variabile ruolo
     * @return 
     */

    public String getRuolo() {
        return ruolo;
    }
    
    /**
     * Metodo che imposta/modifica il contenuto della variabile ruolo
     * @param ruolo 
     */

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
    
    /**
     * MetoMetodo che visualizza il contenuto dei dati inseriti in input
     * @return 
     */
    
    public String info(){
        String testo;
        
        testo = "La tariffa è pari a: " + tariffa + "\n" +
                "Il ruolo è: " + ruolo + "\n";
        
        return testo;
    }
    
    /**
     * Metodo che serve a calcolare l'importo del biglietto ferroviario scontato
     * @return 
     */
     
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


