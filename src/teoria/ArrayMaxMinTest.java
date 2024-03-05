package teoria;

import java.util.Scanner;

public class ArrayMaxMinTest {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  int array [] = new int[10];
	  int i = 0;
	  int min = 1000000000;
	  int max = 0;
	  int pos1 = 0;
	  int pos2 = 0;
	 

	  for(i = 0; i < 10; i++){
		  System.out.println("Inserisci un numero:");
		  array[i] = in.nextInt();
		  if(array[i] < min){
			  min = array[i];
			  pos2 = i;
		  }
		  if(array[i] > max){
			   max = array[i];
			   pos1 = i;	   
		  }
	  }
	System.out.println("Il numero minore è " + min + " e si trova nella posizione " + pos2);
	System.out.println("Il numero maggiore è " + max + " e si trova nella posizione " + pos1);
    
  }
}
