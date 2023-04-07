package com.turing.advancedse3.designpattern.observer;

public interface Publisher {
	 public void attach(Subscriber subscriber);
	 public void deattach(Subscriber subscriber);
	 public void change(String message);
}
