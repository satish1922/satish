package projectanudip;
import java.util.Scanner;
public class LeapYear {
		    public static boolean isLeapYear(int y) {
		        return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
		    }

		    public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter a year: ");
		        int y = s.nextInt();
		        System.out.println(y + (isLeapYear(y) ? " is a leap year." : " is not a leap year."));

	}

}
