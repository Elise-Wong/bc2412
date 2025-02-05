package com.javahongkong.bootcamp.exercise;

public class Transaction implements TransactionInterface {
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank
	 *                      The bank where the account is housed.
	 * @param accountNumber
	 *                      The customer's account number.
	 * @param attemptedPin
	 *                      The PIN entered by the customer.
	 * @throws Exception
	 *                   Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		// complete the function
		this.bank = bank;
		this.accountNumber = accountNumber;
		//this.attemptedPin = attemptedPin;

	}

	public double getBalance() {
		// complete the function
		return -1.0;
	}

	public void credit(double amount) {
		// complete the function
	}

	public boolean debit(double amount) {
		// complete the function
		return true;
	}
}
