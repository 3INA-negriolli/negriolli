package figureGeometriche;


public class Cerchio {
    public float raggio;
    
    public Cerchio (float raggio){
        this.raggio = raggio;
    }
    
    public float areaCerchio(){
        float area;
        area = 3.14f*(raggio*raggio);
        return area;    
    }
    
    public float circonferenzaCerchio(){ // funzione per calcolare la circonferenza
        float circonferenza;
        circonferenza = 2*3.14f*raggio;
        return circonferenza;
    }
    
}
