package figureGeometriche;


public class Trapezio {
    private double lobliquo;
    private double baseM;
    private double baseMi;
    private double altezza;
    
    public Trapezio(double lobliquo,double baseM,double baseMi, double altezza) {
        this.lobliquo = lobliquo;
        this.baseM = baseM;
        this.baseMi = baseMi;
        this.altezza = altezza;
    }
    
    public double perimetro(){
        double perimetro;
        
        perimetro = baseM + baseMi + altezza + (2*lobliquo);
        
        
    }
}
