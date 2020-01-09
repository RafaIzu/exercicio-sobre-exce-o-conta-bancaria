package entities;

import model.exception.DomainException;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account() {
		
	}
	
	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}


	public String getHolder() {
		return holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(double amount) {

			balance+=amount;
		
	}
	
	public void withdraw(double amount) throws DomainException {
		if (amount>withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		else if(amount>balance) {
			throw new DomainException("Not enough balance");
		}
		else {
		balance-=amount;
		}
	}
	
	public String toString() {
		StringBuilder sc=new StringBuilder();
		sc.append("New balance: ");
		sc.append(balance);
		return sc.toString();
	}


	
	
	

}
