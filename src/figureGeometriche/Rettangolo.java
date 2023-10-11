package figureGeometriche;


public class Rettangolo {
    public float base;
    public float altezza;
    
    public Rettangolo (float base, float altezza) {
        this.altezza = altezza;
        this.base = base;
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
}
