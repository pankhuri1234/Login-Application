package com.database;

import java.sql.DriverManager;

import java.sql.Connection;

public class DatabaseConnector 
{
	public static java.sql.Connection getConnection()
	{
		Connection con=null;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "admin");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
