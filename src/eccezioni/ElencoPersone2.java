package eccezioni;

import java.util.ArrayList;

public class ElencoPersone2 extends Persona8A{

    private Object[] elenco = new Object[10];

    public ElencoPersone2() {
    }

    public Object[] getElenco() throws Exception {
        Object[] copia = new Object[10];
        int i = 0;
        for (Object p : elenco) {
            copia[i] = new Persona8A((Persona8A) p);
            i++;
        }
        return copia;
    }

    public void inserisciPersona(Persona8A persona) throws Exception {
        if (persona == null) {
            throw new Exception("La persona è nulla");
        }
        if (!(persona instanceof Persona8A)) {
            throw new Exception("L'oggetto non è un'istanza di Persona8A");
        }
        int n = 0;
        for (int i = 0; i < persona.getNome().length(); i++) {
            n += persona.getNome().charAt(i);
        }
        n %= elenco.length;
        Persona8A p = new Persona8A(persona);
        if(elenco[n] == null){
            elenco[n] = new ArrayList<>();
        }
        ((ArrayList<Persona8A>) elenco[n]).add(p);
    }



}
