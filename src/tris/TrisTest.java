    package tris;


    import java.util.Scanner;

    public class TrisTest {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String g1 = "Ciccio";
            String g2 = "Bello";

            Tris t = new Tris(g1,g2);

            
            String campodaGioco[][] = {
                {"□", "□", "□"},
                {"□", "□", "□"},
                {"□", "□", "□"}
            };
            
            int t1 = 0,t2 = 0;



       


            System.out.println(t.stampa());
            for (int i = 0; i < 9; i++) {
                if (t.turno() == false) {

                    System.out.println("turno giocatore 2");
                    System.out.println("inserire la prima posizione");
                    t1 = in.nextInt();
                    System.out.println("inserire la seconda posizione");
                    t2 = in.nextInt();
                    t.posiziona(t1 , t2);

                    for (int l = 0; l < campodaGioco.length; l++) {
                        for (int j = 0; j < campodaGioco[i].length; j++) {
                            System.out.print(campodaGioco[i][j] + " ");
                        }
                        System.out.println();

                    }

                } else {

                    System.out.println("turno giocatore 1");
                    System.out.println("inserire la prima posizione");
                    t1 = in.nextInt();
                    System.out.println("inserire la seconda posizione");
                    t2 = in.nextInt();
                    t.posiziona(t1 ,t2);

                    for (int l = 0; l < campodaGioco.length; l++) {
                        for (int j = 0; j < campodaGioco[i].length; j++) {
                            System.out.print(campodaGioco[i][j] + " ");
                        }
                        System.out.println();

                    }

                }

            }

        }

    }
