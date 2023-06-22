package com.turing.advancedse3.tdd.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AccountTest {
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
	
}
