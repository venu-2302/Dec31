package com.gopal;

public class InSufficientBalanceException extends Exception{
	
	String message;

	public InSufficientBalanceException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "InSufficientBalanceException [message=" + message + "]";
	}
	
	

}