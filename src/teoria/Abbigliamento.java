package teoria;

import java.util.ArrayList;
import java.util.Arrays;

public class Abbigliamento {
    private ArrayList<Object[]> articoli;
    private static int numeroIstanze;
    
    public Abbigliamento() {
        articoli = new ArrayList<>();
        numeroIstanze++;
    }

    public Abbigliamento(Object[] articoli){
        addArticoli(articoli);
        numeroIstanze++;
    }

    public ArrayList<Object[]> getArticoli() {
        ArrayList<Object[]> a = null;
        for (int i = 0; i < articoli.size(); i++) {
            a.add(articoli.get(i).clone());
        }
        return a;
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }
    
    public void addArticoli(Object[] articolo){
        this.articoli.add(articolo.clone());
    }
    
    public void removeArticoliCodice(int indice){
        if (indice >= 0 && indice < articoli.size()) {
            articoli.remove(indice);
        }
    }
    
    public String infoArticoli(){
        String s = "Articoli:\n";
        for (int i = 0; i < articoli.size(); i++) {
            s += (i+1) + "° Capo: " + Arrays.toString(articoli.get(i)) + "\n";
        }
        return s;
    }
    
    public static void main(String[] args) {
        Object[] articolo1 = {"T-shirt", "XL","TSH001", 15.99};
        Object[] articolo2 = {"Jeans", "XS","JEA001", 39.99};
        Object[] articolo3 = {"Giacca", "S","GAC001", 79.99};

        Abbigliamento negozio = new Abbigliamento();
        negozio.addArticoli(articolo1);
        negozio.addArticoli(articolo2);
        negozio.addArticoli(articolo3);

        System.out.println(negozio.infoArticoli());
        
        negozio.removeArticoliCodice(0); 

        System.out.println(negozio.infoArticoli());
    }
    
}
