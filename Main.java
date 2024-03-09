public class Main {
    public static void main(String[] args) {
        // Membuat objek savingAccount
        savingAccount savingAccount = new savingAccount(1000.0, 0.05);

        // Membuat objek checkingAccount
        checkingAccount checkingAccount = new checkingAccount(2000.0);

        // Menampilkan saldo dari masing-masing akun
        System.out.println("Saldo Saving Account: " + savingAccount.getBalance());
        System.out.println("Saldo Checking Account: " + checkingAccount.getBalance());

        // Melakukan deposit ke savingAccount dan checkingAccount
        savingAccount.deposit(500.0);
        checkingAccount.deposit(100.0);

        // Menampilkan saldo setelah deposit
        System.out.println("\nSaldo Saving Account setelah deposit: " + savingAccount.getBalance());
        System.out.println("Saldo Checking Account setelah deposit: " + checkingAccount.getBalance());

        // Melakukan withdraw dari savingAccount dan checkingAccount
        savingAccount.withdraw(200.0);
        checkingAccount.withdraw(3000.0);

        // Menampilkan saldo setelah withdraw
        System.out.println("\nSaldo Saving Account setelah withdraw: " + savingAccount.getBalance());
        System.out.println("Saldo Checking Account setelah withdraw: " + checkingAccount.getBalance());
    }
}
