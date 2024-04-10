package cicli;


public class TemperatureTest3 {

    
    public static void main(String[] args) {
        Temperature t = new Temperature();
        
        int a = 15;
        
        t.setProva(a);
        t.modificaProva();
        System.out.println(a);
        System.out.println(t.getProva());
        
    }
    
}
