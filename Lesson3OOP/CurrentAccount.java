package Lesson3OOP;

class CurrentAccount implements Account {
    private double balance;
    private double overdraftlimit;

    public CurrentAccount(double initialDeposit, double overdraftlimit) {
        this.balance = initialDeposit;
        this.overdraftlimit = overdraftlimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftlimit >= amount) {
            balance -= amount;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setOverdraftlimit(double overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }
}
