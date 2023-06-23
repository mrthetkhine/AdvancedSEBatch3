package com.turing.advancedse3.tdd.kata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
	public static final String INVALID_WITHDRAW_VALUE = "Invalid withdraw value";
	public static final String INVALID_DEPOSIT_VALUE = "Invalid deposit value";
	
	private TransactionHistory history = new TransactionHistory();
	private int balance = 0 ;
	

	void deposit(int amount)
	{
		if(amount >=0)
		{
			this.balance += amount;
			this.history.recordDebit(new Date(), amount, this.balance);
		}
		else
		{
			throw new RuntimeException(INVALID_DEPOSIT_VALUE);
		}
	}
	void withdraw(int amount)
	{
		if(this.balance >= amount)
		{
			this.balance -= amount;
			this.history.recordCredit(new Date(), amount, this.balance);
		}
		else
		{
			throw new RuntimeException(INVALID_WITHDRAW_VALUE);
		}
	}
	public int getBalance()
	{
		return this.balance;
	}
	void printStatement(Printer printer)
	{
		String data = this.history.getTransactionHistoryData();
		printer.print(data);
	}
}
