package numero;


public class Numero {
    public int n1;
    public int n2;
    
    public Numero(){
        
    }
    
    public Numero(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public int getN1(){
        return n1;
    }
    
    public void setN1(int n1){
        this.n1 = n1;
    }
    
    public int getN2(){
        return n2;
    }
    
    public void setN2(int n2){
        this.n2 = n2;
    }
    
    public int differenza(){
        int differenza;
        if(n1<n2){
            differenza = n2-n1;
        }else{
            differenza = n1-n2;  
        }
        return differenza;
    }
    
    public String info(){
        String testo;
        
        testo = "Il primo numero vale: "   + n1 + "\n" +
                "Il secondo numero vale: " + n2 + "\n";
        
        return testo;
    }
    
}
