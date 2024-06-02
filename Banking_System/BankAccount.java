package com.company.Banking_System;

public class BankAccount {
	
	protected String accountNumber;
	protected String accountHolderName;
	protected double balance;
	
	
	public BankAccount(String accountNumber,String accountHolderName,double balance) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}
	public String getAccounHolderName() {
		return this.accountHolderName;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance +=amount;
			System.out.println("Balance: "+balance);
		}else {
			System.err.println("Invalid deposit amount............");
		}
		
	}
	public void withdraw(double amount) {
		if(amount<=balance && amount>0) {
			balance-=amount;
		}else {
		System.err.println("Not Enough Balance in Account.Please Try Again.");
		}
	}
	public double getBalance() {
		return this.balance;
	}
	
	public void getAccountDetails() {
		System.out.println("Account Number: "+this.accountNumber+
				"\nAccount Holder Name: "+this.accountHolderName+
				"\nAccount Balance: "+this.getBalance());
	}
}
