package com.turing.advancedse3.designpattern.template;

public abstract class SMSSender {
	abstract void readFile();
	public void sendSMS()
	{
		System.out.println("Send SMS");
	}
	final void process()
	{
		this.readFile();
		this.sendSMS();
	}
}
