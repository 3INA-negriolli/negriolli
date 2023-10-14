package figureGeometriche;


public class Trapezio {
    private double latoObliquo;
    private double baseM;
    private double baseMi;
    private double altezza;
    
    public Trapezio(double latoObliquo,double baseM,double baseMi, double altezza) {
        this.latoObliquo = latoObliquo;
        this.baseM = baseM;
        this.baseMi = baseMi;
        this.altezza = altezza;
    }
    
    public double getLatoObliquo(){
        return latoObliquo;
    }
    
    public void setLatoObliquo(double latoObliquo){
        this.latoObliquo = latoObliquo;
    }
    
    public double getBaseM(){
        return baseM;
    }
    
    public void setBaseM(double base){
        this.baseM = baseM;
    }
    
    public double getBaseMi(){
        return baseMi;
    }
    
    public void setBaseMi(double baseMi){
        this.baseMi = baseMi;
    }
    
    public double getAltezza(){
        return altezza;
    }
    
    public void setAltezza(double altezza){
        this.altezza = altezza;
    }
    
    
    public double perimetro(){
        double perimetro;
        
        perimetro = baseM + baseMi + altezza + (2*latoObliquo);
        
        return perimetro;
        
    }
    public double area(){
        double area;
        
        area = ((baseM + baseMi)*altezza)/2;
                
        return area;
    }
    
    public String info(){
        String testo;
        
        testo = "base maggiore: " + baseM         + "\n"  +
                "base minore: "   + baseMi        + "\n"  +
                "lato obliquo: "  + latoObliquo   + "\n"  +
                "altezza: "       + altezza       + "\n";
        
        return testo;
    }
}
