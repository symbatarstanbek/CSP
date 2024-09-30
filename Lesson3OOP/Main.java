package Lesson3OOP;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 1.25);
        System.out.println("Savings Account:\nInitial Deposit: 1000$\nInterest rate: 1.25%");

        CurrentAccount currentAccount = new CurrentAccount(5000.0, 1000.0);
        System.out.println("\nCurrent Account:\nInitial Deposit: 5000$\nOverdraft Linit: 1000$");

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        System.out.println("\nDeposit 100$ to Savings Acc");
        bank.deposit(savingsAccount, 100.0);
        System.out.println("\nDeposit 500$ to Current Acc");
        bank.deposit(currentAccount, 500.0);

        System.out.println("Withdraw 150$ from SA");
        bank.withdraw(savingsAccount, 150.0);
        System.out.println("\nSavings Acc and Current Acc: ");

        bank.printAccountBalances();

        savingsAccount.applyInterest();
        System.out.println("\nAfter interest oon SA for 1 year:");
        System.out.println("SA and CA");
        bank.printAccountBalances();
    }
}
