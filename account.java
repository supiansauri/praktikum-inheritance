public class account {
    // Atribut balance dengan sifat protected
    protected double balance;

    // Constructor untuk memberi nilai awal balance
    public account(double initialBalance) {
        balance = initialBalance;
    }

    // Method untuk mendapatkan nilai balance
    public double getBalance() {
        return balance;
    }

    // Method untuk menambah nilai balance
    public void deposit(double amount) {
        balance += amount;
    }

    // Method untuk mengambil nilai balance
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Saldo kurang.");
            return false;
        }
    }
}

