package com.turing.advancedse3.designpattern.decorator;

public class BasicLogger implements Logger{

	@Override
	public String log(String msg) {
		return msg;
	}

}
