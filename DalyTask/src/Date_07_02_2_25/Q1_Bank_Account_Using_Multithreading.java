package Date_07_02_2_25;
import java.util.*;
class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw " + amount + " but insufficient balance.");
        }
    }

    public synchronized int getBalance() {
        return balance;
    }
}

class BankTask implements Runnable {
    private BankAccount account;
    private boolean isDeposit;
    private int amount;

    public BankTask(BankAccount account, boolean isDeposit, int amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class Q1_Bank_Account_Using_Multithreading {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new Thread(new BankTask(account, true, 500), "Thread-1"); // Deposit 500
        Thread t2 = new Thread(new BankTask(account, false, 300), "Thread-2"); // Withdraw 300
        Thread t3 = new Thread(new BankTask(account, false, 700), "Thread-3"); // Withdraw 700
        Thread t4 = new Thread(new BankTask(account, true, 1000), "Thread-4"); // Deposit 1000

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}