package correzioniVerifiche;

import java.util.ArrayList;

/**
 *
 * @author luca.negriolli
 * @version 1.0
 */
public class HashTable3 {

    private final Object[] ELEMENTS;

    public HashTable3() {
        ELEMENTS = new Object[11];
    }

    public Object[] getELEMENTS() {
        Object[] copia = ELEMENTS.clone();
        return copia;
    }

    public void addElement(PersonaHT element){
        Integer pos = findPosition(element);

        ELEMENTS[pos] = new ArrayList();
        ((ArrayList<PersonaHT>) ELEMENTS[pos]).add(element);
    }

    public Integer findElement(PersonaHT element) {
        Integer pos = -1;

        for (int i = 0; i < ELEMENTS.length; i++) {
            if (((ArrayList<PersonaHT>) ELEMENTS[i]).equals(element)) {
                pos = i;
            }
        }

        return pos;
    }

    private Integer findPosition(PersonaHT element) {
        Integer s = 0;

        for (int i = 0; i < element.getNome().length(); i++) {
            s += element.getNome().charAt(i);
        }

        Integer pos = s % ELEMENTS.length;

        return pos;
    }

    @Override
    public String toString() {
        String testo = "[";
        
        for (int i = 0; i < ELEMENTS.length; i++) {
            if(ELEMENTS[i] != null){
                testo += "[";
                for (int j = 0; j < ((ArrayList<PersonaHT>) ELEMENTS[i]).size() ; j++) {
                    testo += ((ArrayList<PersonaHT>) ELEMENTS[i]).get(i).toString();
                }
                testo += "]";
            }else{
                testo += "null, ";
            }
            
        }
        
        testo += "]";
        
        return testo;
    }
    
    
}
