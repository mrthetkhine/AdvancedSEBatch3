package com.turing.advancedse3.designpattern.nullobject;

class Employee
{
	String name;
	String id;
	
	Employee(String name, String id)
	{
		this.name = name;
		this.id = id;
	}
	void work()
	{
		System.out.println("Employee work");
	}
}
class EmptyEmployee extends Employee
{
	EmptyEmployee(String name, String id) {
		super(name, id);
	}

	void work()
	{
	}
}
public class DAO {

	Employee getEmployeeById(Integer id)
	{
		if(id==-1)
		{
			return new EmptyEmployee("", "");
		}
		else
		{
			return new Employee("Emp1","1120");
		}
	}
}
