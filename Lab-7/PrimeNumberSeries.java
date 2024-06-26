package satish;
import java.util.Scanner;
public class PrimeNumberSeries {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the limit: ");
	        int limit = scanner.nextInt();

	        System.out.println("Prime numbers up to " + limit + ":");
	        for (int number = 2; number <= limit; number++) {
	            if (isPrime(number)) {
	                System.out.print(number + " ");
	            }
	        }

	        scanner.close();
	    }

	    private static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= number; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
}

