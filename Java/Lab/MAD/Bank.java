class Account {
    protected String accountNo;
    protected double balance;
    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public void display() {
        System.out.println("Account: " + accountNo + " | Balance: $" + balance);
    }
    public String AccountNo() {
        return accountNo;
    }
}
class Savings extends Account {
    private double interestRate;
    public Savings(String accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    public String Details() {
        return super.AccountNo();
    }
}
public class Bank {
    public static void main(String[] args) {
        Account bankAcc = new Account("123456", 5000);
        bankAcc.display();
        System.out.println("--------------------");
        Savings savingsAcc = new Savings("789012", 10000, 2.5);
        savingsAcc.display();
        System.out.println("Savings Account Number: " + savingsAcc.Details());
    }
}
