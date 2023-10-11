package figureGeometriche;


public class TriangoloScaleno {
    public double lato1;
    public double lato2;
    public double lato3;
    
    
    public TriangoloScaleno(double lato1, double lato2, double lato3){
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }
    
    public double perimetroTriangolo() {
        double perimetro;
        perimetro = lato1+lato2+lato3;
        return perimetro;
    }
    
    public double semiperimetroTriangolo() {
        double p = perimetroTriangolo();
        double semiperimetro;
        semiperimetro = p/2;
        return semiperimetro;
    }
    
    public double areaTriangolo() {
        double sp = semiperimetroTriangolo();
        double area;
        area = Math.sqrt ((sp*(sp - lato1)*(sp - lato2)*(sp - lato3)));
        return area;
    }
    public double altezzaTriangolo() {
        double altezza;
        double a = areaTriangolo(); 
        altezza = (a*2)/lato1;
        return altezza;
    }
    
     
}
