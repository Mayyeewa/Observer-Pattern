package com.meritamerica.assignment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CDAccount extends BankAccount {
	
	private double Balance;
	private double InterestRate;
	private int Term;
	private Date StartDate;
	private long AccountNumber;
	private double futureValue;
	private CDOffering offering;
	private double openingBalance;
	
	 
	//Constructor
	public CDAccount() {}
	
	


	public CDAccount(double balance, double interestRate, Date accountOpenedOn) {
		super(balance, interestRate, accountOpenedOn);
	}

	public CDAccount(double balance, double interestRate, long accountNumber) {
		super(balance, interestRate, accountNumber);
		}

	public CDAccount(double balance, double interestRate) {
		super(balance, interestRate);
		}

	public static CDAccount readFromString(String accountData) throws ParseException {
		String[] tokens = accountData.split(",");
		long accountNumber = Long.parseLong(tokens[0]);
		double balance = Double.parseDouble(tokens[1]);
		double interestRate = Double.parseDouble(tokens[2]);
		SimpleDateFormat sdfmt1 = new SimpleDateFormat("dd/MM/yyyy");

		Date accountOpenend = sdfmt1.parse(tokens[3]);

		CDAccount account = new CDAccount(accountNumber, balance, accountOpenend);
		return account;
	}
	

	
	public CDAccount(CDOffering offering, double balance) {
		super();
		Balance = balance;
		this.offering = offering;
		this.InterestRate=offering.getInterestRate();
		
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}



	public double getBalance() {
		return Balance;
	}

	public CDAccount 
	
	getFutureValue() {
		return (null);
	}

	public double getInterestRate() {
		return InterestRate;
	}

	int getTerm() {
		return offering.getTerm();
	}


	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		return super.withdraw(amount);
	}


	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		return super.deposit(amount);
	}
	
	
	
}


