package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts; // object reference

	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<>(); // !
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		// 對key搵value.....
		return this.accounts.get(accountNumber);
		//return null;
	}

	// !
	private static Long accountNumber = 0L; //Variab, les is figure only // this is for openXXAccount

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		//get & default
		//Long (key, value) ... (key: check ++accNum, value: 就自動變)
		 this.accounts.put(++accountNumber, new CommercialAccount(company, accountNumber, pin, startingDeposit));
		 return accountNumber;
		//return -1L;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		this.accounts.put(++accountNumber, new ConsumerAccount(person, accountNumber, pin, startingDeposit));
		return accountNumber;
		//return -1L;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		

		return true;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		//return this.accounts.get(getBalance);
		return -1.0;
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		
		return false;
	}
}
