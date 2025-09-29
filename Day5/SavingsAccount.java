public class SavingsAccount extends Account {
    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 1000) {  // Minimum balance condition
            System.out.println("Withdrawal denied! Maintain a minimum balance of ₹1000.");
        } else {
            super.withdraw(amount);
        }
    }
}

