package cicli;


public class TemperatureTest2 {

    
    public static void main(String[] args) {
        Temperature t = new Temperature();
        
        float temp[];
        temp = new float[]{3,9,12};
        
        t.setGradi(temp);
        
        System.out.println(t.getGradi());
        
    }
    
}
