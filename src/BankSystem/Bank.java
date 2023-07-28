package BankSystem;

public class Bank implements BankingSystem{

    public void createAccount() {
        System.out.println("Do you want to create an account?");
    }


    public void depositing() {
        System.out.println("Do you want to deposite a money?");
    }


    public void withdrawingMoney() {
        System.out.println("Do you want to withdraw a money?");
    }


    public void viewingBalances() {
        System.out.println("Do you want to view your balance?");
    }
}
