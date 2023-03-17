package com.turing.advancedse3.concurrency;

import java.util.concurrent.locks.ReentrantLock;

class CountThread extends Thread 
{

	Data data;
	ReentrantLock lock;
	CountThread(Data data, ReentrantLock lock)
	{
		this.data = data;
		this.lock = lock;
	}
	public void run()
	{
		
		for(int i=0;i< 100000;i++)
		{
			lock.lock();
			this.data.value ++;
			lock.unlock();
		}
	}
}
public class DeadLock {
	public static void main(String []args)
	{
		Data data = new Data();
		ReentrantLock lock = new ReentrantLock();
		CountThread t1 = new CountThread(data,lock);
		CountThread t2 = new CountThread(data,lock);
		CountThread t3 = new CountThread(data,lock);
		
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
