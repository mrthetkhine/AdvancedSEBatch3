package com.turing.advancedse3.designpattern.factorymethod;

public class MySQLConnection implements Connection
{

	public void open() {
		System.out.println("MysQL connection open");
		
	}

	public void close() {
		System.out.println("MysQL connection closed");
		
	}
}
