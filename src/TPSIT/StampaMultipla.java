package TPSIT;

/**
 * Crea una classe che estende Thread e accetta come parametro il nome del
 * thread e un numero. Quando il thread viene eseguito, deve stampare il proprio
 * nome il numero di volte specificato.
 *
 * @author luca.negriolli
 */
public class StampaMultipla extends Thread {
    private String nome;
    private int n;

    public StampaMultipla(String nome, int n) {
        this.nome = nome;
        this.n = n;
    }
    
    @Override
    public void run(){
        int i = n;
        while (true) {
            
            while(i != 0){
                System.out.println(nome);
                i--;
            }
        }
    }
    
    

}
