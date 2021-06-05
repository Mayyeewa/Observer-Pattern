package com.meritamerica.assignment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckingAccount extends BankAccount {

	// Variable
	private double balance;
	private double interestRate = 0.0001;
	private double futureValue;
	private long accountNumber;
	private Date accountOpened;

	// Constructor
	public CheckingAccount() {
		super();
	}

	public CheckingAccount(double balance, double interestRate, Date accountOpenedOn) {
		super(balance, interestRate, accountOpenedOn);
	}

	public CheckingAccount(double balance, double interestRate, long accountNumber) {
		super(balance, interestRate, accountNumber);
	}

	public CheckingAccount(double balance, double interestRate) {
		super(balance, interestRate);
	}

	public static CheckingAccount readFromString(String accountData) throws ParseException {
		
		String[] tokens = accountData.split(",");
		long accountNumber = Long.parseLong(tokens[0]);
		double balance = Double.parseDouble(tokens[1]);
		double interestRate = Double.parseDouble(tokens[2]);
		SimpleDateFormat sdfmt1 = new SimpleDateFormat("dd/MM/yyyy");

		Date accountOpenend = sdfmt1.parse(tokens[3]);

		CheckingAccount account = new CheckingAccount(accountNumber, balance, accountOpenend);
		return account;
	}
	public CheckingAccount(long accountNumber2, double balance2, double interestRate2, Date accountOpened2) {
		super();
		this.accountNumber = accountNumber2;
		this.balance = balance2;
		this.interestRate = interestRate2; 
		this.accountOpened = accountOpened2; 
	}

//Special Construction
	public CheckingAccount(double OpeningBalance) {
		this.balance = OpeningBalance;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public double getFutureValue() {
		return futureValue;
	}

	public boolean withdraw(double amount) {
		if (amount <= balance && !(amount < 0)) {
			balance -= amount;
			return true;

		} else
			return false;

	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else
			return false;

	}

	public double futureValue(int years) {
		double interest = 1.0001;
		double p = 100.0;
		return Math.pow(interest, years) * p;

	}

	@Override
	public String toString() {
		return "CheckingAccount [balance=" + balance + ", interestRate=" + interestRate + ", futureValue=" + futureValue
				+ "]";
	}

}
