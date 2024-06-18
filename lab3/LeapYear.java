package satish;

import java.util.Scanner;

public class LeapYear {
	
	public static int n;
	static void input() {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number year");
		n=sc.nextInt();

       if( n%400==0 || n%4==0 && n%100!=0) {
		System.out.println("LEAP year " );
       }
	else 
	{
		System.out.println("Not a leap year");
	}}
   public static void main(String args[]) {

	  input();
   
	}

	}

