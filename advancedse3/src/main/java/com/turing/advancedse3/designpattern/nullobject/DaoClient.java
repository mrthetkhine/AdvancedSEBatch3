package com.turing.advancedse3.designpattern.nullobject;

public class DaoClient {
	public static void main(String[]args)
	{
		DAO dao = new DAO();
		Employee emp = dao.getEmployeeById(1);
		emp.work();
		
	}
}
