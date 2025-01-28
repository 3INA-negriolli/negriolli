package TPSIT;

/**
 *
 * @author luca.negriolli
 */
public class MessaggiTest {
    public static void main(String[] args) {
        Messaggi mex1 = new Messaggi("Pippo");
        Messaggi mex2 = new Messaggi("Minnie");
        Messaggi mex3 = new Messaggi("Cattolica");
        
        mex1.start();
        mex2.start();
        mex3.start();
        
        try {
            mex1.join();
            
            mex2.join();
            
            mex3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
