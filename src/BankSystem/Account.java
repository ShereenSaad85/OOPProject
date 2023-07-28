package BankSystem;

public class Account extends BankAccount{
    private String accountType;
    public void services(){
        System.out.println("you are an advanced client");
    }

    public Account(String accountNumber, double balance, String accountType) {
        super(accountNumber, balance);
        this.accountType = accountType;
    }
}
