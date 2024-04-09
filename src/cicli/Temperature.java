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

    public Temperature() {
        
    }

    public float[] getGradi() {
        return gradi;
    }

    public void setGradi(float[] gradi) {
        if(isValido()){
            this.gradi = gradi;
        }
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
    
    public boolean aggiungiTemperatura(String giorno, float temperatura){
        boolean controllo = true;
        
        for(int i = 0; i < gradi.length; i++){
            float t = gradi[i];
            if(gradi[i] == t){
                controllo = false;
            }
        }
        
        return controllo;
    }

    public float tMax() {
        float tMax = gradi[0];
        String gMax = "";

        for (int i = 0; i < gradi.length; i++) {
            if (gradi[i] > tMax) 
                tMax = gradi[i];
                gMax = giorni[i];
            
        }

        return tMax;

    }
    
    public float tMin(){
        float tMin = gradi[0];
        String gMin = "";

        for (int i = 0; i < gradi.length; i++) {
            if (gradi[i] < tMin) 
                tMin = gradi[i];
                gMin = giorni[i];
            
        }

        return tMin;
    }
    
    public float tMedia(){
        float media = 0;
        
        for(int i = 0; i < gradi.length; i++){
            media += gradi[i];
        }
        
        media /= giorni.length;
        
        return media;
    }
    
}
