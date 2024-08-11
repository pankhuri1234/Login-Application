package com.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.userdao.UserDao;

public class UserSignup extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("uname");
		String userid = req.getParameter("uid");
		String userpass = req.getParameter("upass");
		String usercpass = req.getParameter("ucpass");
		String usercity = req.getParameter("ucity");
		String usermob = req.getParameter("umob");
		System.out.println("User name : "+username);
		System.out.println("User id : "+userid);
		System.out.println("User password : "+userpass);
		System.out.println("User confirm password : "+usercpass);
		System.out.println("User city : "+usercity);
		System.out.println("User mobile number : "+usermob);
		if(userpass.contentEquals(userpass))
		{
			boolean flag=UserDao.userRegistration(username, userid, userpass, usercity, usermob);
			if(flag)
			{
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
			}
			else 
			{
				RequestDispatcher rd = req.getRequestDispatcher("usersignup.jsp");
				rd.forward(req, resp);	
			}
		}
		else 
		{
			RequestDispatcher rd = req.getRequestDispatcher("usersignup.jsp?no=");
			rd.forward(req, resp);	
		}
} 
}