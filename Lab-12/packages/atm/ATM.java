package atm;
import bank.Bank;

public class ATM {
    public static void main(String[] args) {
        Bank account = new Bank(1000);
        System.out.println("Current balance: " + account.getBalance());
        account.deposit(500); 
    }
}

