import java.util.Scanner;
public class LoginUserCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("password")) {
            System.out.println("You are logged in!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
