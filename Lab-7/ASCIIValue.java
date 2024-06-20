package satish;
import java.util.Scanner;
public class ASCIIValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        int asciiValue = (int) inputChar; 

        System.out.println("ASCII value of '" + inputChar + "' is " + asciiValue);

        scanner.close();
        
    }
	
}
