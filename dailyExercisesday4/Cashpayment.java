package com.java.dailyExercisesday4;

public class Cashpayment extends Payment {

	public Cashpayment(double amount) {
		super(amount);
	}

	@Override
	public void paymentDetails() {
		System.out.println("The payment amount of $" + getAmount() + " is made in cash.");
	}

}
