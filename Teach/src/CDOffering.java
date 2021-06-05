package com.meritamerica.assignment3;

import com.meritamerica.assignment3.CDOffering;

public class CDOffering {

	private int term;
	private double interestRate;
	
	
	public CDOffering() {}
	
	public CDOffering(int term, double interestRate){
		this.term = term;
		this.interestRate = interestRate;
		}
	

	public static CDOffering readFromString(String cdOfferingDataString) {
	
	String[] termintr = cdOfferingDataString.split(",",2);
	int term = Integer.parseInt(termintr[0]);
	double interestRate = Double.parseDouble(termintr[0]);
	CDOffering offer = new CDOffering(term, interestRate);
	return offer;

	}

			
		public String writeToString() {
			
		String data = term +"," +interestRate;
		return data;
	}
	
			
	public int getTerm() {
		return term;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}