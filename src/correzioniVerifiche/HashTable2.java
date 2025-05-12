package correzioniVerifiche;

/**
 *
 * @author luca.negriolli
 * @version 1.0
 */
public class HashTable2 {

    private final Object[] ELEMENTS;

    public HashTable2() {
        ELEMENTS = new Object[11];
    }

    public Object[] getELEMENTS() {
        Object[] copia = ELEMENTS.clone();
        return copia;
    }

    public Integer addElement(PersonaHT element) throws Exception {
        Integer pos = -1;

        if (isFull() == false) {
            pos = findPosition(element);
            if (ELEMENTS[pos] == null) {
                PersonaHT copia = new PersonaHT(element);
                ELEMENTS[pos] = copia;
            } else {
                for (int i = pos + 1; i < ELEMENTS.length; i++) {
                    if (ELEMENTS[i] == null) {
                        PersonaHT copia = new PersonaHT(element);
                        ELEMENTS[i] = copia;
                    }
                }
                for (int i = 0; i < pos; i++) {
                    if (ELEMENTS[i] == null) {
                        PersonaHT copia = new PersonaHT(element);
                        ELEMENTS[i] = copia;
                    }
                }
            }

        }

        return pos;
    }
    
    public Integer findElement(PersonaHT element) {
        Integer pos = -1;
        
        for (int i = 0; i < ELEMENTS.length; i++) {
            if(ELEMENTS[i].equals(element)){
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

    private Boolean isFull() {
        Boolean rit = true;

        for (int i = 0; i < ELEMENTS.length; i++) {
            if (ELEMENTS[i] == null) {
                rit = false;
            }
        }

        return rit;
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
