import java.util.ArrayList;
public class Account {
    protected String accountHolderName;
    protected double balance;
    protected ArrayList<String> transactionHistory;

    public Account(String name, double initialBalance) {
        this.accountHolderName = name;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: ₹" + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: ₹" + amount);
            System.out.println("Successfully deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: ₹" + amount);
            System.out.println("Successfully withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void showTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (String record : transactionHistory) {
            System.out.println("- " + record);
        }
    }
}



