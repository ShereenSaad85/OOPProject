package BankSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        to run the attributes and methods of BankAccount
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name, please ");
//        String clientName=input.next();

//BankAccount class
        BankAccount client=new BankAccount("1234567899","Shereen Saad",11.000);
        System.out.println(client.getHolderName());
        System.out.println(client.getAccountNumber());
        System.out.println(client.getBalance());



//        trying to use if condition with oop
//        if ((client.getHolderName()).equals(clientName)){
//            System.out.println("Your account number is "+client.getAccountNumber());
//            System.out.println("Your balance is "+client.getBalance());
//        }else {
//            System.out.println("You are not client in this bank");
//        }

        System.out.println("=======================================");
//Account
        Account account=new Account("123456789",5000,"advanced");
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        account.services();

        System.out.println("=======================================");

//        "SavingsAccount" and "CheckingAccount" classes
        SavingsAccount saveAcc=new SavingsAccount("12345",4000,"premium");
        double result=saveAcc.calculatingInterest(5000,20,3);
        System.out.println(result);

        CheckingAccount checkAcc=new CheckingAccount("54322",2000,"regular");
        checkAcc.issuingChecks();

        System.out.println("=======================================");
//Transaction is abstract class, so we cannot use to create an object

// "DepositTransaction" and "WithdrawTransaction" subclasses
        DepositTransaction depositTransaction=new DepositTransaction();
        depositTransaction.performingTransaction();

        WithdrawTransaction withdrawTransaction=new WithdrawTransaction();
        depositTransaction.performingTransaction(); //the function in the transaction abstract class
        depositTransaction.depositPerformTransaction(); //the function in the WithdrawTransaction subclass

        System.out.println("=======================================");

        //BankingSystem interface, so we cannot use to create an object--- we will make objects from Bank class
        BankingSystem bankingSystem=new Bank();
        bankingSystem.createAccount();
        bankingSystem.depositing();

        Bank bank=new Bank();
        bank.viewingBalances();
        bank.withdrawingMoney();

//        Bank b1=new Bank();
//        b1.createAccount();





//        BankAccount ba=new BankAccount("1234567899","Shereen Saad",11.000);
//        System.out.println(ba.getBalance()+" "+ba.getAccountNumber()+" "+ba.getHolderName());
//        ba.withdrawingMoney();
//        ba.setBalance(10.000);
//        System.out.println(ba.getBalance());
//        Account acc=new Account();
//        acc.services("Advanced");



    }
}
