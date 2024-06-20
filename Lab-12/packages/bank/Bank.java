package bank;

public class Bank {
    private double balance; 

    public Bank(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) { 
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }
    void withdraw(double amount) { 
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
