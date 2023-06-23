package com.turing.advancedse3.tdd.kata;
import java.util.Date;
enum TransactionMode  {
		DEBIT,
		CREDIT,
}
public class Transaction {
	private Date date;
	private TransactionMode mode;
	private int amount;
	private int balance;
	
	public Transaction(Date date, TransactionMode mode, int amount, int balance) {
		this.date = date;
		this.mode = mode;
		this.amount = amount;
		this.balance = balance;
	}
	public String toString()
	{
		String sign = (this.mode == TransactionMode.DEBIT)?"+":"-";
		return "null "+ sign+ this.amount+" "+this.balance;
	}
}
