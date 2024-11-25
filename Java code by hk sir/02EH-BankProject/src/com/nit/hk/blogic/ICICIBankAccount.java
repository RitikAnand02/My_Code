package com.nit.hk.blogic;

import com.nit.hk.customexception.InsufficientFundsException;
import com.nit.hk.customexception.InvalidAmountException;
import com.nit.hk.pojo.BankAccountDetails;
import com.nit.hk.spec.BankAccount;

public class ICICIBankAccount implements BankAccount {
	
	private long accNum;
	private String accHName;
	private double balance;
	
	@Override
	public void init(BankAccountDetails accDetails) {
		this.accNum = accDetails.getAccNum();
		this.accHName = accDetails.getAccHName();
		this.balance = accDetails.getBalance();
		System.out.println("ICICIBankAccount object is initialized");
	}
	
	@Override
	public void deposit(double amt) throws InvalidAmountException {
		if(amt <= 0)
			throw new InvalidAmountException(
					"Do not pass -ve number as amount");
		
		balance = balance + amt;
		System.out.println(
				"deposit operation is done on ICICIBankAccount object");
	}

	@Override
	public void withdraw(double amt) throws InvalidAmountException, InsufficientFundsException {
		if(amt <= 0)
			throw new InvalidAmountException(
					"Do not pass -ve number as amount and Zero");
		
		if(amt > balance)
			throw new InsufficientFundsException(
					"Insufficient Funds");
		
		balance = balance - amt; 
		System.out.println(
				"withdraw operation is done on ICICIBankAccount object");
	}

	@Override
	public void currentBalance() {
		System.out.println(balance);	
		System.out.println(
				"currentBalance operation is done on ICICIBankAccount object");
	}

	@Override
	public void transferMoney(BankAccount destAcc, double amt)
			throws InvalidAmountException, InsufficientFundsException {

		this.withdraw(amt);
		destAcc.deposit(amt);
		System.out.println(
				"Money transferred from ICICIBankAccount object");
		
	}

}
