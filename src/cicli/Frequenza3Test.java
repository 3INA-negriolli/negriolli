package cicli;

import java.util.Formatter;
import java.util.Random;

public class Frequenza3Test {

    public static String frequenza() {
        Formatter f = new Formatter();
        Random r = new Random();
        double fR;
        double fP;
        int r1;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int range = 9;
        int tot = 100000;

        String testo = "N. - FA  -   FR   -  FP\n";

        for (int i = 1; i < tot; i++) {
            r1 = r.nextInt(range)+1;

            switch (r1) {
                case 1:
                    n1++;
                    break;
                case 2:
                    n2++;
                    break;
                case 3:
                    n3++;
                    break;
                case 4:
                    n4++;
                    break;
                case 5:
                    n5++;
                    break;
                case 6:
                    n6++;
                    break;
                case 7:
                    n7++;
                    break;
                case 8:
                    n8++;
                    break;
                case 9:
                    n9++;
                    break;
            }
        }
        
        
        fR = (double) n1 / tot;
        fP = (double) fR * 100;
        f.format("1  %2d  %.5f  %.3f\n", n1, fR, fP);
        
        fR = (double) n2 / tot;
        fP = (double) fR * 100;
        f.format("2  %2d  %.5f  %.3f\n", n2, fR, fP);
        
        fR = (double) n3 / tot;
        fP = (double) fR * 100;
        f.format("3  %2d  %.5f  %.3f\n", n3 , fR, fP);
        
        fR = (double) n4 / tot;
        fP = (double) fR * 100;
        f.format("4  %2d  %.5f  %.3f\n", n4 , fR, fP);
        
        fR = (double) n5 / tot;
        fP = (double) fR * 100;
        f.format("5  %2d  %.5f  %.3f\n", n5 , fR, fP);
        
        fR = (double) n6 / tot;
        fP = (double) fR * 100;
        f.format("6  %2d  %.5f  %.3f\n", n6 , fR, fP);
       
        fR = (double) n7 / tot;
        fP = (double) fR * 100;
        f.format("7  %2d  %.5f  %.3f\n", n7 , fR, fP);
        
        fR = (double) n8 / tot;
        fP = (double) fR * 100;
        f.format("8  %2d  %.5f  %.3f\n", n8 , fR, fP);

        fR = (double) n9 / tot;
        fP = (double) fR * 100;
        f.format("9  %2d  %.5f  %.3f\n", n9 , fR, fP);
        
        testo += f;
        return testo;

    }

    public static void main(String[] args) {
        System.out.print(Frequenza3Test.frequenza());
    }
}
