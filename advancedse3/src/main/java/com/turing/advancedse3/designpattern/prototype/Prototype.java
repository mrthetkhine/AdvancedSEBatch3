package com.turing.advancedse3.designpattern.prototype;

public interface Prototype extends Cloneable {
	Prototype reproduce()throws CloneNotSupportedException;
}
