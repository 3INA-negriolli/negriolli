package TPSIT;

public class IsAliveControlloTest {

    public static void main(String[] args) {
        IsAliveControllo th1 = new IsAliveControllo(3000);
        th1.start();
        
        int tempo = 0;
        
        do{
            if(th1.isAlive()){
                System.out.println("Thread in Esecuzione!");
                tempo += 1000;
            }
        }while(tempo != 3000);
        
        System.out.println("Thread Terminato!");
    }

}
