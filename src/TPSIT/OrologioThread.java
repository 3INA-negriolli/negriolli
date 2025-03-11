package TPSIT;

import java.time.LocalTime;

/**
 *
 * @author luca.negriolli
 */
public class OrologioThread implements Runnable {

    @Override
    public void run() {
        int stampe = 0;
        while (stampe != 5) {
            System.out.println(LocalTime.now());
            stampe++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Stop");
    }
}


