package teoria;


public class Studente {
    
    private String nome;
    private String cognome;
    private float voto;
    private String esito;
    
    public Studente(){
        
    }
    
    public Studente(String nome, String cognome, float voto, String esito){
        this.nome = nome;
        this.cognome = cognome;
        this.voto = voto;
        this.esito = esito;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCognome(){
        return cognome;
    }
    
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    
    public float getVoto(){
        return voto;
    }
    
    public void setVoto(float voto){
        this.voto = voto;
    } 
    
    public String getEsito(){
        return esito;
    }
    
    public String setEsito(String esito){
        if(voto<6){
            esito = "negativo";
        } else {
            esito = "positivo";       
            }
        return esito;
        }
    
    public String info(){
        String testo;
        
        testo = "Il nome dello Studente è: "    + nome    + "\n" +
                "Il cognome dello Studente è: " + cognome + "\n"+
                "Il voto è: " + voto + "\n";
        
        return testo;                
    }
    
}

    

