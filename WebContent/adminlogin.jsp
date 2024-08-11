<%@ page language="java" import="com.util.Utility" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body bgcolor="LightGray">
<%
int noo =Utility.parse(request.getParameter("no"));
if(noo==1)
{
%>	
<script type="text/javascript">	
alert("your id password may be wrong ")	;
	</script>
<%	
}
%>
<center>
<img src="title_image.png">
<h1 style="color:red;">Admin Login</h1>
<form action="<%=request.getContextPath()%>/adminlogin" method="post">
<input type="text" name="aid" placeholder="Enter the admin id" required />
<br><br>
<input type="password" name="apass" placeholder="Enter the password" required />
<br><br>
<input type="submit" value="Login">
<br><br>
<button style="background-color: green;"><a href="usersignup.jsp" style="color: red;">User Signup</a></button>
&nbsp;&nbsp;&nbsp;&nbsp;
<button style="background-color: green;"><a href="index.jsp" style="color: red;">User Login</a></button>
</form>
</center>
</body>
</html>