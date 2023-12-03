class Checking extends Account {
    private double accountBalance;
    public Checking(double balance) {
        super(balance);
    }
    Checking(){
        this.accountBalance = 0;
    }
    @Override
    public void deposit(double amount){
        setAccountBalance(accountBalance += amount);
    }

    @Override
    public void withdrawal(double amount) {
        super.withdrawal(amount);
        if (getAccountBalance() - amount < 0) {
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            setAccountBalance(getAccountBalance() - 20);
        }
    }
}