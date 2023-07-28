package BankSystem;

public class BankAccount {
//    Create attributes for the class
    private String accountNumber;
    private String holderName;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //    Create methods for the class
    public void depositingMoney(){
        System.out.println("You're in depositing money process");
    }
    public void withdrawingMoney(){
        System.out.println("You're in withdrawing money process");

    }
//Constructors
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
