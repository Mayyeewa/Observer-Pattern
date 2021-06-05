package com.meritamerica.assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class MeritBank {

	private static final CDOffering CDOffering = null;
	private static long nextAccountNumber;
	private static AccountHolder AccountHoldersArray[] = new AccountHolder[0];
	private static CDOffering CDOfferingsArray[] = new CDOffering[0];

	public static boolean readFromFile(String fileName) {
		
		

		try {
			BufferedReader rd = new BufferedReader(new FileReader(fileName));
			
				String line = rd.readLine();		
				nextAccountNumber = Long.parseLong(line);
				
				line = rd.readLine();
				int numCdOffering = Integer.parseInt(line);			
					for (int i = 0; i<numCdOffering; i++) {
				line =	rd.readLine();
				CDOffering cdofferings = CDOffering.readFromString(line);
				
				CDOffering [] CDOfferingsArray1 = new CDOffering[CDOfferingsArray.length + 1];		
					for (int j = 0; j < CDOfferingsArray1.length - 1; j++) {
						CDOfferingsArray1[j] = CDOfferingsArray1[j];
					}
				CDOfferingsArray = CDOfferingsArray1;
				CDOfferingsArray[CDOfferingsArray.length - 1] = CDOffering;
					}
				
				line =	rd.readLine();
					int numHolder = Integer.parseInt(line);
				
				line = rd.readLine();
					String[] numHolder1 = line.split(",");//Doe,,John
					
				line = rd.readLine();
					int AcHolder1 = Integer.parseInt(line);//1st acc holder has 1 chk acc
				
				line = rd.readLine();
					String[] checking1 = line.split(",");
					
				line = rd.readLine();
					int AcHolder2 = Integer.parseInt(line);//2st acc holder has 1 chk acc
		
				line = rd.readLine();
					String[] saving1 = line.split(",");
					int numSavings = Integer.parseInt(line);
					SavingsAccount[] savings = new SavingsAccount[numSavings];
						for(int i=0; i<numSavings; i++) {
							savings[i] = SavingsAccount.readFromString(line);
						}
						
						
						line = rd.readLine();
						int numCD = Integer.parseInt(line);
						
						

						line = rd.readLine();
					
					
					line = rd.readLine();
					line = rd.readLine();
					line = rd.readLine();
					line = rd.readLine();
					line = rd.readLine();
					line = rd.readLine();
					line = rd.readLine();
					line = rd.readLine();
					line = rd.readLine();
					line = rd.readLine();
					line = rd.readLine();
					line = rd.readLine();

					


					
				
				
				
		}catch (Exception e) {}
	
		return false;
				
			}
	/*
	 * static boolean readFromFile(String fileName) static boolean
	 * writeToFile(String fileName) static AccountHolder[] sortAccountHolders()
	 */

	public static void addAccountHolder(AccountHolder accountHolder) {
		AccountHolder[] newAccountHolderArray = new AccountHolder[AccountHoldersArray.length + 1];
		for (int i = 0; i < newAccountHolderArray.length - 1; i++) {
			newAccountHolderArray[i] = AccountHoldersArray[i];
		}
		AccountHoldersArray = newAccountHolderArray;
		AccountHoldersArray[AccountHoldersArray.length - 1] = accountHolder;
	}

	public static AccountHolder[] getAccountHolders() {
		return AccountHoldersArray;
	}

	public static CDOffering[] getCDOfferings() {
		return CDOfferingsArray;
	}

	public static CDOffering getBestCDOffering(double depositAmount) {
		double best = 0.0;
		CDOffering bestOffering = null;
		if (CDOfferingsArray == null) {
			return null;
		}
		for (CDOffering offering : CDOfferingsArray) {
			if (futureValue(depositAmount, offering.getInterestRate(), offering.getTerm()) > best) {
				bestOffering = offering;
				best = futureValue(depositAmount, offering.getInterestRate(), offering.getTerm());
			}
		}
		return bestOffering;
	}

	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		if (CDOfferingsArray == null) {
			return null;
		}
		CDOffering bestOffering = null;
		double best = 0.0;
		CDOffering secondBestOffering = null;
		for (CDOffering offering : CDOfferingsArray) {
			if (futureValue(depositAmount, offering.getInterestRate(), offering.getTerm()) > best) {
				secondBestOffering = bestOffering;
				bestOffering = offering;
				best = futureValue(depositAmount, offering.getInterestRate(), offering.getTerm());
			}
		}
		return secondBestOffering;
	}

	public static void clearCDOfferings() {
		CDOfferingsArray = null;
	}

	public static void setCDOfferings(CDOffering[] offerings) {
		CDOfferingsArray = offerings;
	}

	public static long getNextAccountNumber1() {
		return nextAccountNumber += 1;
	}

	public void setNextAccountNumber(long nextAccountNumber) {
		this.nextAccountNumber = nextAccountNumber;

	}

	public static double totalBalances() {
		double total = 0.0;
		for (AccountHolder accounts : AccountHoldersArray) {
			total += accounts.getCombinedBalance();
		}
		System.out.println("Total aggregate account balance: $" + total);
		return total;
	}

	public static double futureValue(double presentValue, double interestRate, int term) {
		double fValue = presentValue * Math.pow(1 + interestRate, term);
		return fValue;
	}
}