package operazioniMatematiche;


public class Divisione {
    
    public float n1;
    public float n2;
    
    public Divisione(float numero1,float numero2) {
        n1 = numero1;
        n2 = numero2;           
    }
    
    public float esegui(){
        float divisione; 
        divisione = n1 / n2;
        return divisione;
    }
    
}
    

