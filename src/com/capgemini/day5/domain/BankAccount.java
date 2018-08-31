package com.capgemini.day5.domain;

import com.capgemini.day5.exception.LowBalanceException;

public class BankAccount 
{
	private long accId;
	private String accHolderName;
	private String accType;
	private double balance;
	private DebitCard debitCard;

	public BankAccount() {
		super();
	}

	public BankAccount(long accId, String accHolderName, String accType, double balance, DebitCard debitCard) {
		super();
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.accType = accType;
		this.balance = balance;
		this.debitCard = debitCard;
	}

	public long getAccId() {
		return accId;
	}

	public void setAccId(long accId) {
		this.accId = accId;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public DebitCard getDebitCard() {
		return debitCard;
	}

	public void setDebitCard(DebitCard debitCard) {
		this.debitCard = debitCard;
	}

	public double withdraw(double amount) throws LowBalanceException {
		if(balance - amount >= 0)
			balance = balance - amount;
		else
			throw new LowBalanceException("You don't have sufficint fund.");
		return balance;
	}
	
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
}
