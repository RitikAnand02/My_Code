package com.nit.hk.customexception;

public class InvalidAmountException extends Exception{

	private static final long serialVersionUID = 1L;

	public InvalidAmountException() {
		super();
	}
	
	public InvalidAmountException(String errMessage) {
		super(errMessage);
	}
	
}
