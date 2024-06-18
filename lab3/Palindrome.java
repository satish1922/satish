package satish;

import java.util.Scanner;

public class Palindrome {

		// TODO Auto-generated method stub
		public static int n;
		static void input() {
			Scanner sc=new Scanner(System.in);
			int n;
			System.out.println("Enter a number number");
			n=sc.nextInt();
			int rev=0;
			for(int i=n;i>0;i/=10)
			{
				rev=rev*10+i%10;
			}

	       if( n==rev) {
			System.out.println("It is a palindrome " );
	       }
		else 
		{
			System.out.println("Not a palindrome");
		}}
	   public static void main(String args[]) {

		  input();
	   
	}

}
