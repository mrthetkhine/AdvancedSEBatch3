package com.turing.advancedse3.designpattern.template.framework;

public class Demo {
	public static void main(String[]args)
	{
		FrameworkAction action = new ReportAction();
		action.process();
		
		action = new SaleAction();
		action.process();
	}
}
