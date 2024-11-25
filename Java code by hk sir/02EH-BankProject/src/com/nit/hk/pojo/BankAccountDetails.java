package com.nit.hk.pojo;

public class BankAccountDetails {
	
	private long accNum;
	private String accHName;
	private double balance;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public String getAccHName() {
		return accHName;
	}
	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "BankAccountDetails [accNum=" + accNum + ", accHName=" + accHName + ", balance=" + balance + "]";
	}
	
}
