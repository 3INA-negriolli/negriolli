package figureGeometriche;


public class TriangoloScaleno {
    public float lato1;
    public float lato2;
    public float lato3;
    public float semiperimetro;
    public float perimetro;
    
    public TriangoloScaleno(float lato1, float lato2, float lato3){
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.semiperimetro = semiperimetro;
        this.perimetro = perimetro;
    }
    
    public float perimetroTriangolo() {
        float perimetro;
        perimetro = lato1+lato2+lato3;
        return perimetro;
    }
    
    public float semiperimetroTriangolo() {
        float semiperimetro;
        semiperimetro = perimetro/2;
        return semiperimetro;
    }
    
    public float areaTriangolo() {
        float area;
        area = semiperimetro*(semiperimetro - lato1)*(semiperimetro - lato2)*(semiperimetro - lato3);
        return area;
    }
    
     
}
