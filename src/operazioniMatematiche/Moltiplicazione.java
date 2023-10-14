package operazioniMatematiche;


public class Moltiplicazione {
    public float n1;
    public float n2;
    
    public Moltiplicazione(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public float getN1(){
        return n1;
    }
    
    public void setN1(float n1){
        this.n1 = n1;
    }
    
    public float getN2(){
        return n2;
    }
    
    public void setN2(float n2){
        this.n2 = n2;
    }
    
    public float esegui(){
        float moltiplicazione;
        
        moltiplicazione = n1 * n2;
        
        return moltiplicazione;
    }
    
    public String info(){
        String testo;
        
        testo = "primo numero: "   + n1 + "\n"+
                "secondo numero: " + n2 + "\n";
        
        return testo;
    }
     

            
}
