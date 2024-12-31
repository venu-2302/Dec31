package com.gopal;

public class SBIBank implements Bank{
	
	int balance;
	public SBIBank(int balance) {
		super();
		this.balance = balance;
	}
	@Override
	public void withDraw(int amt)
	{
	try {
		if(amt > this.balance) {
			System.out.println("amt "+amt+" trying to withdraw...");
			throw new InSufficientBalanceException("Balance is not enough");
		}
		else {
			System.out.println("successfully withdrawn amount...."+amt);
			this.balance = this.balance - amt;
		}
	}catch(InSufficientBalanceException e) {
		System.out.println("error occurred during with draw...");
		e.printStackTrace();
	}	
	}
	@Override
	public void deposit(int amt){
		try {
			if(amt > 50000) {
				System.out.println("amt "+amt+" trying to deposit...");
				throw new LimitExceedes(
						"more than 50k not possible ");
				
			}
			else {
				System.out.println("successfully deposited amount...."+amt);
				this.balance = this.balance + amt;
			}
		}catch(LimitExceedes e) {
			System.out.println("error occurred during deposit...");
			e.printStackTrace();
		}
	}
}