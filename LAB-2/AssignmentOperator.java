import java.io.*;
public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 10;
	        int b = 5;

	        System.out.println("Value of c after assignment: " + (a));
	        System.out.println("Value of c after addition: " + (a += b));
	        System.out.println("Value of c after subtraction: " + (a -= b));
	        System.out.println("Value of c after multiplication: " + (a *= b));
	        System.out.println("Value of c after division: " + (a /= b));
	        System.out.println("Value of c after modulus: " + (a %= b));

	        int x = 5;
	        System.out.println("Value of x after bitwise AND: " + (x &= 3));
	        System.out.println("Value of x after bitwise OR: " + (x |= 3));
	        System.out.println("Value of x after bitwise XOR: " + (x ^= 3));
	        System.out.println("Value of x after left shift: " + (x <<= 1));
	        System.out.println("Value of x after right shift: " + (x >>= 1));
	        System.out.println("Value of x after zero fill right shift: " + (x >>>= 1));
	    
	}

}
