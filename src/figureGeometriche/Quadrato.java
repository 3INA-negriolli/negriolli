package figureGeometriche;


public class Quadrato {
    public float l;
    
    public Quadrato (float l) {
        this.l = l;
    }
    
    public float getL(){
        return l;
    }
    
    public void setL(){
        this.l = l;
    }
    
    public float calcolaArea (){
        float area;
        area = l*l;
        return area;
    }
    
    public float calcolaPerimetro(){
        float perimetro;
        perimetro = l+l+l+l;
        return perimetro;
    }
    
    public String info(){
        String testo;
        
        testo = "Lato: " + l;
        
        return testo;
    }
    
 }
