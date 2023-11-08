package teoria;


public class Persona {
    public String nome;
    public String cognome;
    public String email;
    
    public Persona(){
        
    }
    
    public Persona(String nome, String cognome, String email){
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
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
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
        
    public boolean registrazioneAvvenuta(){
        boolean isRegistrato;
        if(this.email.equals("")){
            isRegistrato = false;
        } else {
            isRegistrato = true;
        }
            return isRegistrato;
    }
    
    public String info(){
        String testo;
        
        testo = "Nome: "       + nome       + "\n" +
                "Cognome: "    + cognome    + "\n" + 
                "Email: "      + email      + "\n" ; 
                
        
        return testo;
    }
        
}
