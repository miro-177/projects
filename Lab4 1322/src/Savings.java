class Savings extends Account {
    private double accountBalance;
    private int depositCounter = 0;


    Savings(){
        this.accountBalance = 0;
    }

    public Savings(double balance) {
        super(balance);
    }

    @Override
    public void withdrawal(double amount) {
        if (getAccountBalance() - amount < 500) {
            System.out.println("Charging a fee of $10 because you are below $500");
            setAccountBalance(getAccountBalance() - 10);
        }
        super.withdrawal(amount);
    }

    @Override
    public void deposit (double deposit) {
        setAccountBalance(accountBalance += deposit);
        int deposits = ++depositCounter;
        System.out.println("This is deposit "+ deposits + " to this account");
        if (deposits >= 6) {
            System.out.println("Charging a fee of $10.");
            setAccountBalance(accountBalance -= 10);
        }
    }


    public void addInterest() {
        double interest = getAccountBalance() * 0.015;
        System.out.println("Customer earned " + interest + " in interest");
        setAccountBalance(accountBalance += interest);
    }
}