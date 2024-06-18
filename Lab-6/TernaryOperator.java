package satish;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int k,s,r,d;
     scanner sc = new scanner (System.in);
     System.out.println("Enter all the three numbers");
     k=sc.nextInt();
     s=sc.nextInt();
     r=sc.nextInt();
     d=r>(k>s?k:s) ? r: ((k>s)? k:s);
     System.out.println("The largest number:" +d);
	}
	

}

