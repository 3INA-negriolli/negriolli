package cicli;

import java.util.Scanner;

public class McmTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Inserire il primo numero: ");
        n1 = in.nextInt();
        System.out.println("Inserire il secondo numero: ");
        n2 = in.nextInt();
        System.out.println("Inserire il terzo numero: ");
        n3 = in.nextInt();

        Mcm m = new Mcm(n1, n2);

        System.out.println(m.info());

        System.out.println("L'mcm è: " + m.mcm());

    }

}
