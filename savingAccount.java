public class savingAccount extends account {
    // Atribut interestRate, tipe double, sifat private
    private double interestRate;

    // Constructor savingAccount
    public savingAccount(double balance, double interest_rate) {
        super(balance);
        this.interestRate = interest_rate;
    }
}
