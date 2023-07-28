package BankSystem;

public class SavingsAccount extends Account{
    public double calculatingInterest(double beginningBalance,double interestRate,double numberOfPeriods){
        return beginningBalance*interestRate*numberOfPeriods;
    }

    public SavingsAccount(String accountNumber, double balance, String accountType) {
        super(accountNumber, balance, accountType);
    }
}
