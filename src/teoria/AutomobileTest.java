import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	String targa;
	boolean avviata = false;

	System.out.print("Inserire la Targa: ");
 	targa = in.nextLine();

	System.out.println("La targa è: " + targa);  
	System.out.print("La macchina è : " + avviata);

  }
}