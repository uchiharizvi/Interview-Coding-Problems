package com.interview.problems;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;

	public Bank() {
		// complete the function
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
        return null;
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
        return Long.valueOf(-1L);
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function

		ConsumerAccount consumerAccount = new ConsumerAccount(person,Long.valueOf(-1L), pin,startingDeposit);
        return Long.valueOf(-1L);
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
        return true;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
        return -1;
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
	}

	public boolean debit(Long accountNumber, double amount) throws Exception {
		// complete the function
		Transaction transaction = new Transaction(this, accountNumber, 3383);
        return true;
	}
}
