package com.capgemini.day5.domain;

import com.capgemini.day5.exception.InvalidPinException;

public class DebitCard {

	private long cardNo;
	private int cvv;
	private int pin;
	private int expMonth;
	private int expYear;

	public DebitCard() {
		super();
	}

	public DebitCard(long cardNo, int cvv, int pin, int expMonth, int expYear) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.pin = pin;
		this.expMonth = expMonth;
		this.expYear = expYear;
	}

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}
	
	public boolean validatePin(int pin) throws InvalidPinException {
		if(this.pin == pin)
			return true;
		else
			throw new InvalidPinException("You have entered wrong pin.");
	}

}