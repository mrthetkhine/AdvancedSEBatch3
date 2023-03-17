package com.turing.advancedse3.concurrency;

class Data
{
	int value = 0;
}
public class IncThread extends Thread 
{

	Data data;
	IncThread(Data data)
	{
		this.data = data;
	}
	public void run()
	{
		for(int i=0;i< 100000;i++)
		{
			synchronized(this.data)  {
				this.data.value ++;
			}
			
		}
	}
	public static void main(String []args)
	{
		Data data = new Data();
		IncThread t1 = new IncThread(data);
		IncThread t2 = new IncThread(data);
		IncThread t3 = new IncThread(data);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Data value "+ data.value);
	}
}
