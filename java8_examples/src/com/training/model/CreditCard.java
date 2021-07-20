package com.training.model;

public class CreditCard {
	private long cardnumber;
	private String cardHolderName;
	private long phoneNumber;
	private double creditLimit;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(long cardnumber, String cardHolderName, long phoneNumber, double creditLimit) {
		super();
		this.cardnumber = cardnumber;
		this.cardHolderName = cardHolderName;
		this.phoneNumber = phoneNumber;
		this.creditLimit = creditLimit;
	}
	public long getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	@Override
	public String toString() {
		return "CreditCard [cardnumber=" + cardnumber + ", cardHolderName=" + cardHolderName + ", phoneNumber="
				+ phoneNumber + ", creditLimit=" + creditLimit + "]";
	}


}

