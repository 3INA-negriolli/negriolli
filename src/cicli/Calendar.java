package cicli;

/**
 * A class that tells you the day of the week based from the day, the month and the year
 * @author luca.negriolli
 */
public class Calendar {

    static String Zellercongruence(int day, int month, int year) {
        String rit="";
        if (month == 1) {
            month = 13;
            year--;
        }
        if (month == 2) {
            month = 14;
            year--;
        }
        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = q + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h % 7;
        switch (h) {
            case 0:
                rit = "Saturday";
                break;
            case 1:
                rit = "Sunday";
                break;
            case 2:
                rit = "Monday";
                break;
            case 3:
                rit = "Tuesday";
                break;
            case 4:
                rit = "Wednesday";
                break;
            case 5:
                rit = "Thursday";
                break;
            case 6:
                rit = "Friday";
                break;

        }
        return rit;
    }

}
