package satish;
import java.util.Scanner;

public class Vehicle {

	 String brand;
	   int year;
	   String model;
	  
	     Scanner sc=new Scanner(System.in);
	         
	     void drive()
	      {
	      System.out.println(" Enter your brand name:");
	      brand=sc.next();
	      System.out.println(" Enter year:");
	       year=sc.nextInt();
	       System.out.println(" Enter model:");
	       model=sc.next();
	     }
 }

   class Car extends Vehicle
	 {
	   String color;
	     
	    Scanner sc=new Scanner(System.in);
	    void honk()
	     {
	        
	      System.out.println(" enter the car color:");
	       color=sc.next();
	       
	     }
	     
	    public static void main(String args[])
	     
	       {
	          Car c1=new Car();
	          c1.drive();
		  c1.honk();
	
	       }	
	
	}

