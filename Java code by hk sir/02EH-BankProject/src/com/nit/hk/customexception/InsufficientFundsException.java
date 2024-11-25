package com.nit.hk.customexception;

public class InsufficientFundsException extends Exception {

	private static final long serialVersionUID = 1L;

	public InsufficientFundsException() {
		super();
	}
	
	public InsufficientFundsException(String errMessage) {
		super(errMessage);
	}
	
}
