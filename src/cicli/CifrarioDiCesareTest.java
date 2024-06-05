package cicli;

import java.util.Arrays;
import java.util.Scanner;

public class CifrarioDiCesareTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String str;
        
        System.out.println("Inserire la Stringa da Convertire: ");
        str = in.nextLine();
        
        CifrarioDiCesare cf = new CifrarioDiCesare(str);
        
        System.out.println("Ecco la stringa cifrata: " + cf.ritornaStringa());
    }

}
