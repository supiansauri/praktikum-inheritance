public class checkingAccount extends account {
    private double overdraftProtection;

    public checkingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    public checkingAccount(double balance) {
        this(balance, -1.0);
        this.balance += overdraftProtection;
        this.overdraftProtection = Math.max(0, this.balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= 0.0) {
            balance -= amount;
            return true;
        } else {
            double overdraftNeeded = amount - balance;
            if (overdraftProtection == -1.0 || overdraftProtection < overdraftNeeded) {
                return false;
            } else {
                balance = 0.0;
                overdraftProtection -= overdraftNeeded;
                return true;
            }
        }
    }
}
