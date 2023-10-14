
package operazioniMatematiche;


public class Somma {
    public double n1;
    public double n2;
    
    public Somma(double n1,double n2) {
        this.n1 = n1;
        this.n2 = n2;           
    }
    
    public double getN1(){
        return n1;
    }
    
    public void setN1(){
        this.n1 = n1;
    }
    
    public double getN2(){
        return n2;
    }
    
    public void setN2(){
        this.n2 = n2;
    }
    
    public double esegui(){
        double somma; 
        
        somma = n1 + n2;
        
        return somma;
    }
    
    public String info(){
        String testo;
        
        testo = "primo numero: " + n1 + "\n"+
                "secondo numero: " + n2 + "\n";
        
        return testo;
    }
}