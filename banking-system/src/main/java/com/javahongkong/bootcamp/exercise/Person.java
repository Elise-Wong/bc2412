package com.javahongkong.bootcamp.exercise;

public class Person extends AccountHolder{ //考抽離
	private String firstName;
	private String lastName;
	// private int idNumber;

	public Person(String firstName, String lastName,int idNumber) {
		// complete the function
		super(idNumber);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		// complete the function
		return this.firstName;
		//return null;
	}

	public String getLastName() {
		// complete the function
		return this.lastName;
		//return null;
	}
}
