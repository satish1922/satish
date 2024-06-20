package satish;

import java.util.Scanner;
interface BankingInterface {
	void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements BankingInterface {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited amount is : Rs " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn amount is : Rs " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class CurrentAccount implements BankingInterface {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited amount is : Rs " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn amount is : Rs " + amount);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankingInterface savingsAccount = new SavingsAccount();
        System.out.print("Enter amount to deposit in Savings Account: ");
        double savingsDeposit = scanner.nextDouble();
        savingsAccount.deposit(savingsDeposit);

        BankingInterface currentAccount = new CurrentAccount();
        System.out.print("Enter amount to deposit in Current Account: ");
        double currentDeposit = scanner.nextDouble();
        currentAccount.deposit(currentDeposit);

        System.out.print("Enter amount to withdraw from Savings Account: ");
        double savingsWithdraw = scanner.nextDouble();
        savingsAccount.withdraw(savingsWithdraw);

        System.out.print("Enter amount to withdraw from Current Account: ");
        double currentWithdraw = scanner.nextDouble();
        currentAccount.withdraw(currentWithdraw);

        System.out.println("Savings account balance is : Rs " + savingsAccount.getBalance());
        System.out.println("Current account balance is : Rs " + currentAccount.getBalance());
        scanner.close();
    }
} 