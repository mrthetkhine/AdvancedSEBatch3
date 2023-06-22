package com.turing.advancedse3.tdd.kata;

public class Account {
	private int balance = 0 ;
	void deposit(int amount)
	{
		this.balance += amount;
	}
	public int getBalance()
	{
		return this.balance;
	}
}
