package com.turing.advancedse3.tdd.kata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionHistory {
	private List<Transaction> history = new ArrayList<>();
	
	void recordCredit(Date date, int amount, int balance)
	{
		addTransaction(date, TransactionMode.CREDIT, amount, balance);
	}
	
	void recordDebit(Date date, int amount, int balance)
	{
		addTransaction(date, TransactionMode.DEBIT, amount, balance);
	}
	private void addTransaction(Date date,TransactionMode mode, int amount, int balance) {
		Transaction tran = new Transaction(date,mode,amount,balance);
		this.history.add(tran);
	}
	String getTransactionHistoryData()
	{
		String header = "Date Amount Balance\r\n";
		String message = header;
		for(Transaction tran : this.history)
		{
			message += tran+"\r\n";
		}
		return message;
	}
}
