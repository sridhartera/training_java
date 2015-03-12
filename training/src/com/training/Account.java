package com.training;

public class Account {
	private double balance;
	
	public Account(double amount){
		if(amount > 0.0){
			balance = amount; // opening acc should not be -ve and if -ve round to 0
		}
	}
	public void credit(double cr){
		balance = balance + cr;
		
	}
	public double getBalance(){
		return balance;
		
	}

}
