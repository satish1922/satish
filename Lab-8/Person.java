package satish;
import java.util.Scanner;

public class Person {

	
	   String name;
	   int age;
	  
	     Scanner sc=new Scanner(System.in);
	         
	     void speak()
	      {
	      System.out.println(" Enter your name:");
	      name=sc.next();
	      System.out.println(" Enter your age:");
	      
	       age=sc.nextInt();
	       
	       }

	 }


	class Student extends Person
	 {
	   String grade;
	     
	    Scanner sc=new Scanner(System.in);
	    void study()
	     {
	        
	      System.out.println(" enter your grade:");
	       grade=sc.next();
	       
	     }
	     
	    public static void main(String args[])
	     
	       {
	          Student s1=new Student();
	          s1.speak();
		  s1.study();
	
		
	
	}

	}
