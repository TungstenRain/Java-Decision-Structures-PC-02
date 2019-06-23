package ch03pc02;
import java.util.Scanner;

/**
 *
 * @author frank.olson
 * date: 11/1/2017
 * purpose: determine whether a date is a "magic number"
 */
public class Ch03pc02 {

    public static void main(String[] args) {
        
        //variables
        int month, day, year, monthDay;
        
        //create a keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //request input
        System.out.print("Please enter the month in number form: ");
        month = keyboard.nextInt();
        System.out.print("Please enter the day: ");
        day = keyboard.nextInt();
        System.out.print("Please enter the two-digit year: ");
        year = keyboard.nextInt();
        
        //magic number determination
        monthDay = month * day;
        
        System.out.println("The date you input " + month + "/" + day + "/" + year + 
                (monthDay == year ? " is a Magid Number." : " is not a Magic Number.")
                );
    }
    
}
