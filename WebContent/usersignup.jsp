<%@ page language="java" import="com.util.Utility" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Signup</title>
</head>
<body bgcolor="LightGray">
<%
int noo =Utility.parse(request.getParameter("no"));
if(noo==2)
{
%>	
<script type="text/javascript">	
alert("your password not matched ")	;
	</script>
<%	
}
%>
<center>
<img src="title_image.png">
<h1 style="color:red;">User Signup</h1>
<form action="<%=request.getContextPath()%>/usersignup" method="post">
<input type="text" name="uname" placeholder="Enter the user name" required />
<br><br>
<input type="text" name="uid" placeholder="Enter the user id" required />
<br><br>
<input type="password" name="upass" placeholder="Enter the password" required />
<br><br>
<input type="password" name="ucpass" placeholder="Repeat the password" required />
<br><br>
<input type="text" name="ucity" placeholder="Enter the city name" required />
<br><br>
<input type="tel" name="umob" placeholder="Enter the mobile number" required />
<br><br>
<input type="submit" value="Signup">
<br><br>
<button style="background-color: green;"><a href="adminlogin.jsp" style="color: red;">Admin Login</a></button>
&nbsp;&nbsp;&nbsp;&nbsp;
<button style="background-color: green;"><a href="index.jsp" style="color: red;">User Login</a></button>
</form>
</center>
</body>
</html>