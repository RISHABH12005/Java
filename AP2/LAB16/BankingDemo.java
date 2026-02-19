import java.util.Scanner;

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
        notifyAll();
    }

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println("Not enough balance. Waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
    }
}

class WithdrawThread extends Thread {
    BankAccount acc;
    int amount;

    WithdrawThread(BankAccount acc, int amount) {
        this.acc = acc;
        this.amount = amount;
    }

    public void run() {
        acc.withdraw(amount);
    }
}

class DepositThread extends Thread {
    BankAccount acc;
    int amount;

    DepositThread(BankAccount acc, int amount) {
        this.acc = acc;
        this.amount = amount;
    }

    public void run() {
        acc.deposit(amount);
    }
}

public class BankingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount(500);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter deposit amount: ");
                int amt = sc.nextInt();
                new DepositThread(acc, amt).start();
            }
            else if (ch == 2) {
                System.out.print("Enter withdrawal amount: ");
                int amt = sc.nextInt();
                new WithdrawThread(acc, amt).start();
            }
            else if (ch == 3) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
