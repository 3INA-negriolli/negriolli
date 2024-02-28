package cicli;

import java.util.Scanner;

public class CalendarTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int day, month, year;
        
        System.out.println("Insert the day: ");
        day = in.nextInt();
        
        System.out.println("Insert the month: ");
        month = in.nextInt();
        
        System.out.println("Insert the year: ");
        year = in.nextInt();
        
        System.out.println("Here the day: " + Calendar.Zellercongruence(day, month, year) );
    }
    
}
