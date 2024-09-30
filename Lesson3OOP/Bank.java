package Lesson3OOP;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private final List accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public void printAccountBalances() {
        for (Account account : accounts) {
            System.out.println("Account balance: " + account.getBalance());
        }
    }
}
