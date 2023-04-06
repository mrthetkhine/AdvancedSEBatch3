package com.turing.advancedse3.designpattern.factorymethod;

interface Connection
{
	void open();
	void close();
}
abstract class ConnectionFactory
{
	public abstract Connection createConnection();
}
class MySQLConnectionFactory extends ConnectionFactory
{

	@Override
	public Connection createConnection() {
		
		return new MySQLConnection();
	}
	
}
class OracleConnectionFactory extends ConnectionFactory
{

	@Override
	public Connection createConnection() {
		return new OracleConnection();
	}
	
}
class DriverManager 
{
	static Connection getConnection(String type)throws Exception
	{
		/*
		if(type.equals("MySQL"))
		{
			return new MySQLConnection();
		}
		else 
		{
			return new OracleConnection();
		}*/
		
		Class clazz = Class.forName(type);
		return (Connection) clazz.newInstance();
		
	}
}
public class FactoryMethodDemo {
	public static void main(String[]args)
	{
		try {
			//Connection con = DriverManager.getConnection("com.turing.advancedse3.designpattern.factorymethod.MySQLConnection");
			//Connection con = DriverManager.getConnection("Oracle");
			
			ConnectionFactory factory = new MySQLConnectionFactory();
			Connection con = factory.createConnection();
			con.open();
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
