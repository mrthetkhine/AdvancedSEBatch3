package com.turing.advancedse3.tdd.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AccountTest implements Printer{
	String message = "";
	Account account = new Account();
	
	@Test
	void testDeposit()
	{
		
		account.deposit(1000);
		assertEquals(1000, account.getBalance());
	}
	
	@Test
	void testDepositMultiple()
	{
		
		account.deposit(1000);
		account.deposit(200);
		assertEquals(1200, account.getBalance());
	}
	@Test
	void testDepositNegativeValue()
	{
		
		RuntimeException ex = assertThrows(RuntimeException.class, ()->{
			account.deposit(-1000);
		});
		assertEquals(Account.INVALID_DEPOSIT_VALUE, ex.getMessage());
		assertEquals(0, account.getBalance());
	}
	@Test
	void testWithdraw()
	{
		account.deposit(100);
		account.withdraw(100);
		assertEquals(0,account.getBalance());
	}
	@Test 
	void testWithdrawWithoutDeposit()
	{
		RuntimeException ex = assertThrows(RuntimeException.class, ()->{
			account.withdraw(100);
		});
		assertEquals(Account.INVALID_WITHDRAW_VALUE, ex.getMessage());
		assertEquals(0,account.getBalance());
	}
	@Test
	void testWithdrawInsufficient()
	{
		account.deposit(50);
		RuntimeException ex = assertThrows(RuntimeException.class, ()->{
			account.withdraw(100);
		});
		assertEquals(Account.INVALID_WITHDRAW_VALUE, ex.getMessage());
		assertEquals(50,account.getBalance());
	}
	@Test
	void testPrintStatement()
	{
		account.deposit(500);
		account.withdraw(100);
		
		account.printStatement(this);
		
		String header = "Date Amount Balance\r\n";
		String message = header;
		message += "null +500 500\r\n";
		message += "null -100 400\r\n";
		assertEquals(message,this.message);
	}
	public void print(String message)
	{
		this.message = message;
	}
}
