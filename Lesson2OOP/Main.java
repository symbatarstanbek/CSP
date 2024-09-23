package Lesson2OOP;

public class Main {
    public static void main(String[] args) {
        System.out.println("Create a Bank Account object with balance of $500");
        BankAccount BA1234 = new BankAccount("BA1234", 500);

        System.out.println("Deposit $1000");
        BA1234.deposit(1000);
        System.out.println("After deposit: " + BA1234.getBalance());

        System.out.println("Withdraw $600");
        BA1234.withdraw(600);
        System.out.println("After withdraw: " + BA1234.getBalance());
//        BA1234.withdraw(9000);

        System.out.println("Create SavingsAccount with balance $300");
        SavingsAccount SA1234 = new SavingsAccount("SA1234", 300);

        System.out.println("Withdraw $250");
        SA1234.withdraw(250);
        System.out.println("After withdraw $250: " + SA1234.getBalance());
    }
}