package correzioniVerifiche;

/**
 *
 * @author luca.negriolli
 * @version 1.0
 */
public class HashTable1 {

    private final Object[] ELEMENTS;

    public HashTable1() {
         ELEMENTS = new Object[11];
    }

    public Object[] getELEMENTS() {
        Object[] copia = ELEMENTS.clone();
        return copia;
    }

    public void addElement(PersonaHT element) throws Exception {
        Integer pos = findPosition(element);

        PersonaHT copia = new PersonaHT(element);

        ELEMENTS[pos] = copia;
    }

    public Integer findElement(PersonaHT element) {
        Integer pos = -1;
        
        if(ELEMENTS[findPosition(element)].equals(element)){
            pos = findPosition(element);
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
                testo += ELEMENTS[i].toString() + ", ";
            }else{
                testo += "null, ";
            }
        }

        testo += "]";

        return testo;
    }
    
    

}
