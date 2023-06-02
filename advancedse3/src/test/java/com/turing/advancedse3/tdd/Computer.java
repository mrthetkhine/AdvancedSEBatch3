package com.turing.advancedse3.tdd;



public class Computer {
	HardDisk hardDisk;
	
	public Computer(HardDisk hardDisk)
	{
		this.hardDisk = hardDisk;
	}
	public void start()
	{
		this.hardDisk.init();
		this.hardDisk.readBootSector();
		this.hardDisk.loadOS();
	}
}
