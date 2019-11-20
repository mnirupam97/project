<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Login</h1>
<form method="post" action="loginProcess.do">
<table>
<tr><th>Username:</th><td><input type="text" name="student_username" id="username"></td></tr>

<tr><th>Password:</th><td><input type="password" name="student_password" id="password"></td></tr>

<tr><th><input type="submit" value="submit"></th></tr>
</table>
</form>
</center>
</body>
</html>