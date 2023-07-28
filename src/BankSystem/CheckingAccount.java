package BankSystem;

public class CheckingAccount extends Account{
    public void issuingChecks(){
        System.out.println("You have an issue in withdrawing your money");
    }

    public CheckingAccount(String accountNumber, double balance, String accountType) {
        super(accountNumber, balance, accountType);
    }
}
