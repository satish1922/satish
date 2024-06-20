package satish;
class BankAccount {
    private String accountType;
    private double balance;
    public BankAccount() {
        this.accountType = "Savings";
        this.balance = 0.0;
    }
    public BankAccount(String accountType) {
        this.accountType = accountType;
        this.balance = 0.0;
    }
    public BankAccount(String accountType, double initialBalance) {
        this.accountType = accountType;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void deposit(double amount, String checkNumber) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " by check " + checkNumber);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void displayAccountInfo() {
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount savingsAccount = new BankAccount();
        BankAccount checkingAccount = new BankAccount("Checking");
        BankAccount customAccount = new BankAccount("Business", 1000.0);
        savingsAccount.displayAccountInfo();
        checkingAccount.displayAccountInfo();
        customAccount.displayAccountInfo();
        savingsAccount.deposit(500.0);
        checkingAccount.deposit(18000.0, "CHK12345");
        customAccount.withdraw(300.0);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
        System.out.println("Business Account Balance: " + customAccount.getBalance());
    }
}
