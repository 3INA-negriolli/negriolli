package figureGeometriche;


public class Rettangolo {
    public float base;
    public float altezza;
    
    public Rettangolo (float base, float altezza) {
        this.altezza = altezza;
        this.base = base;
    }
    
    public float getBase(){
        return base;
    }
    
    public void setBase(float base){
        this.base = base;
    }
    
    public float getAltezza(){
        return altezza;
    }
    
    public void setAltezza(){
        this.altezza = altezza;
    }
    
    public float areaRettangolo() {
        float area;
        area = base*altezza;
        return area;
    }
    
    public float perimetroRettangolo(){
        float perimetro;
        perimetro = (base*2) + (altezza*2);
        return perimetro;
    }
    
    public String info(){
        String testo;
        
        testo = "Base: "    + base    + "\n" +
                "Altezza: " + altezza + "\n";
        
        return testo;
    }
    
}
