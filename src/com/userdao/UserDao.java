package com.userdao;

import java.sql.Connection;
import java.sql.Statement;

import com.database.DatabaseConnector;
import com.mysql.jdbc.ResultSet;

public class UserDao
{
public static boolean userRegistration(String uname,String uid,String upass,String ucity,String umob)
{
	Connection con=null;
	boolean flag=false;
	Statement st=null;
	try 
	{
	con=DatabaseConnector.getConnection();
	st=con.createStatement();
String query="insert into m_user(u_name,u_id,u_pass,u_city,u_mob)values('"+uname+"','"+uid+"','"+upass+"','"+ucity+"','"+umob+"')";
	int n=st.executeUpdate(query);
	if(n!=0)
	{
		flag=true;
	}
		
	} 
	catch( Exception e)
	{
		e.printStackTrace();
	}
     return flag;
	}
public static boolean userLogin(String uid,String upass)
{
	Connection con=null;
	boolean flag=false;
	Statement st=null;
	ResultSet rs=null;
	try
	{
	con=DatabaseConnector.getConnection();
	st=con.createStatement();
	String query="select*from m_user where u_id='"+uid+"' and u_pass='"+upass+"'";
	rs=(ResultSet) st.executeQuery(query);
	if(rs.next())
	{
		flag=true;
	}
		
	} 
	
	catch (Exception e)
	{
		e.printStackTrace();
	}
	return flag;
}
}
