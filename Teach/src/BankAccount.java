package com.meritamerica.assignment3;

import java.text.ParseException;
import java.util.Date;



public abstract class BankAccount {
	
	private double balance;
	private double interestRate;
	private long accountNumber;
	private Date accountOpenedOn;
	
	
	public BankAccount() {}
	

	public BankAccount(double balance, double interestRate, Date accountOpenedOn) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountOpenedOn = accountOpenedOn;
		
	}

	public BankAccount(double balance, double interestRate, long accountNumber) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNumber = accountNumber;
	}
	
	public BankAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}

	//public abstract static BankAccount readFromString(String accountData) throws ParseException;
	
	
	
	
	
	
	public java.util.Date getAccountOpenedOn() {
		return accountOpenedOn;
	}


	public void setAccountOpenedOn(java.util.Date accountOpenedOn) {
		this.accountOpenedOn = accountOpenedOn;
	}


	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public boolean withdraw(double amount) {
		
		return true;
	}
	public boolean deposit( double amount) {
		System.out.println ("Deposit");
		balance += amount;
		return true;
	}
	public double futureValue(int years) {
		
		return 0.0;
	}
}
