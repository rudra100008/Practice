package com.company.Banking_System;

import java.util.*;

public class BankingApplication {
	ArrayList<BankAccount> accounts;
	
	public BankingApplication() {
		accounts =new ArrayList<>();
	}
	
	
	public void createAccount(String accountNumber,String accountHolderName,double initialBalance ) {
		BankAccount newAccount =new BankAccount(accountNumber,accountHolderName,initialBalance);
		accounts.add(newAccount);
		System.out.println("Account Created Sucessfully...........");
		System.out.println("Welcome to the Simple Bank!! Mr/Mrs."+newAccount.getAccounHolderName());
	}
	public BankAccount findAccount(String accountNumber) {
		for(BankAccount account :accounts) {
			if (accountNumber.equals(account.getAccountNumber())) {
				return account;
			}
		}
		System.err.println("Enter the correct Account Number...");
		return null;
	}
	public void depositToAccount(String accountNumber,double amount) {
		BankAccount account=findAccount(accountNumber);
		if (account !=null) {
			account.deposit(amount);
		}else {
			System.err.println("Enter the correct Account Number.");
		}
	}
	
	
	public void  withdrawFromAccount(String accountNumber,double amount) {
		BankAccount account=findAccount(accountNumber);
		   if (account !=null) {
				account.withdraw(amount);
			}else {
				System.err.println("Enter the correct Account Number.");
			}
		}
	
	
	public void checkBalance(String accountNumber) {
		BankAccount account=findAccount(accountNumber);
			if (account !=null) {
				account.getBalance();
			}else {
				System.err.println("Enter the correct Account Number.");
			}
		
	}
	
	public void printAllDetails() {
		for(BankAccount account:accounts) {
			account.getAccountDetails();
			System.out.println("------------------------------------------");
		}
	}
	public static void main(String[] args) {
        BankingApplication app = new BankingApplication();
        
        app.createAccount("12345", "John Doe", 500.0);
        app.createAccount("67890", "Jane Smith", 1000.0);

        app.depositToAccount("12345", 200.0);
        app.withdrawFromAccount("67890", 300.0);
        
        app.checkBalance("12345");
        app.checkBalance("67890");

        app.printAllDetails();
    }

}
