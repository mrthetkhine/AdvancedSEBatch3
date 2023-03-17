package com.turing.advancedse3.concurrency;

public class DemoThread extends Thread{

	String name;
	DemoThread(String name)
	{
		this.name = name;
	}
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Thread Name "+this.name+" i => "+i);
		}
	}
	public static void main(String[]args)
	{
		DemoThread t1 = new DemoThread("One");
		DemoThread t2 = new DemoThread("Two");
		DemoThread t3 = new DemoThread("Three");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
