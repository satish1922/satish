package satish;
import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 double Balance=10000;
	       Scanner scanner=new Scanner(System.in);
	       while(true){
	        System.out.println("1.Withdraw Amount ");
	        System.out.println("2.Deposit ");
	        System.out.println("3.Check Balance ");
	        System.out.println("4.Exit ");
	        int choice=scanner.nextInt();
	        switch (choice) {
	            case 2:
	                double Deposit=getDeposit(scanner);
	                Balance+=Deposit;
	                System.out.println("Deposit"+Deposit+"Balance"+Balance);
	                break;
	            case 1:
	                double Withdrawamount=getWithDrawAmount(scanner,Balance);
	                if (Withdrawamount > 0){
	                    Balance-=Withdrawamount;
	                    System.out.println("WithDrawAmount"+Withdrawamount+"Balance"+Balance);
	                }
	                break;
	            case 3:
	                System.out.println(Balance);
	                break;
	            case 4:
	                System.out.println("Thanks");
	                scanner.close();
	            default:
	                System.out.println("Invalid choice");


	        }
	    }   
	   }
	static double getDeposit(Scanner scanner){
	    System.out.println("Amount to be deposited");
	    double Amount=scanner.nextDouble();
	    if (Amount < 0){
	        System.out.println("Amount should be positive");
	        return getDeposit(scanner);
	    }
	    return Amount;
	    }
	static double getWithDrawAmount(Scanner scanner,double Balance){
	    System.out.println("Amount to be withdrawn");
	    double Amount=scanner.nextDouble();
	    if (Amount > Balance){
	        System.out.println("Insufficient Funds");
	        return 0;

	    }
	    return Amount;


	}

}

