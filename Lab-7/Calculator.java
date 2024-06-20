package satish;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String choice;
        
       
         
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
          
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            
          
            System.out.print("Choose operation perform (addition, subtraction, multiplication, or division): ");
            choice = sc.next();
            
            double result = 0;
            boolean isValid = true;
            
      
            switch (choice) {
                case "addition":
                    result = a + b;
                    break;
                case "subtraction":
                    result = a - b;
                    break;
                case "multiplication":
                    result = a * b;
                    break;
                case "division":
                    if (b != 0) {
                        result = a / b;
                    } else {
                        isValid = false;
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;
                default:
                    isValid = false;
                    System.out.println("Error: Invalid operation!");
            }
            
            if (isValid) {
                System.out.println("Result: " + a+ " " + choice + " " + b + " = " + result);
            }
        
	}

}     