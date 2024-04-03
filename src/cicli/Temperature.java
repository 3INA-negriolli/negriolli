package cicli;

/**
 * Scrivere una classe che, date le temperature di una settimana, ne calcoli la
 * media e restituisca i giorni con la temperatura più alta e i giorni con
 * quella più bassa.
 *
 * @author luca.negriolli
 */
public class Temperature {

    private String[] giorni;
    private float[] gradi;

    public Temperature(String[] giorni, float[] gradi) {
        this.giorni = giorni;
        this.gradi = gradi;
    }

    public float[] getGradi() {
        return gradi;
    }

    public void setGradi(float[] gradi) {
        this.gradi = gradi;
    }

    public boolean isValido() {
        boolean valido = false;

        for (int i = 0; i < gradi.length; i++) {
            if (gradi[i] > -90 || gradi[i] < 60) {
                valido = true;
            }

        }

        return valido;
    }

    public float tMax() {
        float tMax = 0;

        for (int i = 0; i < gradi.length; i++) {
            if (gradi[i] > tMax) 
                tMax = gradi[i];
            
        }

        return tMax;

    }
    
    public float tMin(){
        float tMin = 0;

        for (int i = 0; i < gradi.length; i++) {
            if (gradi[i] < tMin) 
                tMin = gradi[i];
            
        }

        return tMin;
    }
    
}
