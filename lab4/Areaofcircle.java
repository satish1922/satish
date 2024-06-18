package satish;
import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String decision;
		double radius;
		double Area; 

		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		System.out.println("Enter Yes to find the area of circle :");
		decision=sc1.next().toUpperCase();
		System.out.println("Enter radius of circle");
		radius=sc2.nextInt();
		if ("YES".equals(decision)) {
			Area=(22/7)*radius*radius;
			System.out.println("Area of circle is : " +Area);
		}

	}

}

