package com.gopal;

public class LimitExceedes extends Exception {

	String error;
	public LimitExceedes(String error) {
		super();
		this.error = error;
	}

	@Override
	public String toString() {
		return "LimitExceedes [error="+error+"]";
	}
}