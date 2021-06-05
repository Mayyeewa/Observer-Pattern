package com.meritamerica.assignment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SavingsAccount extends BankAccount {
	
	//Variable
	private double balance;
	private double interestRate = 0.01;
	private double futureValue;
	private long accountNumber;
	private Date accountOpened;
	

//Constructor
	public SavingsAccount() {}
	
	
	public SavingsAccount(double balance, double interestRate, Date accountOpenedOn) {
		super(balance, interestRate, accountOpenedOn);
	}

	public SavingsAccount(double balance, double interestRate, long accountNumber) {
		super(balance, interestRate, accountNumber);
		}

	public SavingsAccount(double balance, double interestRate) {
		super(balance, interestRate);
		}
	
	public static SavingsAccount readFromString(String accountData) throws ParseException {
		String[] tokens = accountData.split(",");
		long accountNumber = Long.parseLong(tokens[0]);
		double balance = Double.parseDouble(tokens[1]);
		double interestRate = Double.parseDouble(tokens[2]);
		SimpleDateFormat sdfmt1 = new SimpleDateFormat("dd/MM/yyyy");

		Date accountOpenend = sdfmt1.parse(tokens[3]);
	
		SavingsAccount account = new SavingsAccount(accountNumber,balance, interestRate, accountOpenend);
		return account;
	}


	//Special Constructor

public SavingsAccount(double balance) {
	super();
	this.balance = balance;
}

public SavingsAccount(long accountNumber2, double balance2, double interestRate2, Date accountOpened2) {
		super();
		this.accountNumber = accountNumber2;
		this.balance = balance2;
		this.interestRate = interestRate2; 
		this.accountOpened = accountOpened2; 
	}





public double getBalance() {
	return balance;
}

public double getInterestRate() {
	return interestRate;
}
	
	public boolean withdraw(double amount) {
		if ( amount<=balance && !(amount<0)) {
			balance-=amount;
			return true;	
				}else
					return false;
	}
	
	public boolean deposit(double amount) {
		if (amount>0) {
		balance+=amount;
		return true;
		
	}else
		return false;

	
	
	}
	
	public double futureValue(int years) {
		double interest=1.01;
		return Math.pow(interest, years)*this.balance;
		
		
				
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", interestRate=" + interestRate + ", futureValue=" + futureValue
				+ "]";
	}
	
	
	
}

