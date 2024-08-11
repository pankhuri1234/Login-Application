package com.util;

public class Utility 
{
	public static int parse(String str)
	{
		int p=0;
		if(str==null)
		{
			str="0";
		}
		else if (str.trim().equals(null))
{
	str="0";
}
else if (str.equals("")) 
{
	str="0";
}		
		try
		{
			p=Integer.parseInt(str);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return p;
	}
}
