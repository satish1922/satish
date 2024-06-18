package satish;
import java.util.Scanner;

public class OperatorInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		Scanner Sc1 = new Scanner(System.in);
		Scanner Sc2 = new Scanner(System.in);
		System.out.print("Enter A : ");
		a=Sc1.nextInt();
		System.out.print("Enter B : ");
		b=Sc2.nextInt();
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
		System.out.println("Addition :"   +c);
		System.out.println("substration : " +d);
		System.out.println("Multiplication :"  +e);
		System.out.println("Division:"   +f);
	}

}

