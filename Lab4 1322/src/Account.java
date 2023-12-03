public class Account {
    private static int nextAccountNumber = 1001;
    private int accountNumber;
    private double accountBalance;
    public Account() {
        this.accountNumber = nextAccountNumber++;
        this.accountBalance = 0;
    }
    public void deposit(double amount){
        accountBalance += amount;
    }

    public Account(double balance) {
        this.accountNumber = nextAccountNumber++;
        this.accountBalance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void withdrawal(double amount) {
        accountBalance -= amount;
    }
}
