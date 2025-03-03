package com.javahongkong.bootcamp.exercise;

public abstract class AccountHolder {
	private int idNumber;
	private int taxId;

	/**
	 * @param idNumber The government-issued ID used during account setup.
	 */
	public AccountHolder(int idNumber) {
		// complete the function
		this.idNumber = idNumber;
	}

	/**
	 * @return private int {@link AccountHolder#idNumber}
	 */
	public int getIdNumber() {
		// complete the function
		return this.idNumber;
		//return -1;
	}

	// public abstract int getSomething();

	@Override // for Coomercial Account (?)
	public boolean equals(Object obj){
		if (this == obj){
			return true;
		}
		if (!(obj instanceof AccountHolder)){
			return false;
		}
		AccountHolder accountHolder = (AccountHolder) obj;
		return Object.equals(this.idNumber, accountHolder.getIdNumber());
	}

	@Override
	public int hashCode(){

	}

}
