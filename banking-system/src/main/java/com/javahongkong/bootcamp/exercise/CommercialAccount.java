package com.javahongkong.bootcamp.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Account implementation for commercial (business) customers.<br>
 * <br>
 *
 * Private Variables:<br>
 * {@link #authorizedUsers}: List&lt;Person&gt;<br>
 */
public class CommercialAccount extends Account{
	private List<Person> authorizedUsers;

	public CommercialAccount(Company company, Long accountNumber, int pin, double startingDeposit) {
		// complete the function
		super(company, accountNumber, pin, startingDeposit);
		this.authorizedUsers = new ArrayList<>(); //!
	}

	/**
	 * @param person The authorized user to add to the account.
	 */
	protected void addAuthorizedUser(Person person) {
		// complete the function
		//List<Person> 
		this.authorizedUsers.add(person);
	}

	/**
	 * @param person
	 * @return true if person matches an authorized user in
	 *         {@link #authorizedUsers}; otherwise, false.
	 */
	public boolean isAuthorizedUser(Person person) {
		// complete the function
		//if ()

		for (Person p : authorizedUsers){
			if (p.equals(person))
			return true;
		}
			return false;
	}

	@Override
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person person = (Person) obj;
			return Objects.equals(person.getIdNumber, accountNumber);
	}

}
