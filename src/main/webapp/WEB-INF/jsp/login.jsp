<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Log in</title>
</head>
<body>

<h2> Login</h2>
<p> Welcome to the login in page </p>

<form action= "login.html" method = "post">
<table border= "1">
<tr>
   <th>Email</th>
   <td><input type = "text" name = "email" /></td>
</tr>

<tr>
   <th>Password</th>
   <td><input type = "text" name = "password" /></td>
</tr>
<tr>
    <th><br /></th>
    <td><input type = "submit" name = "login" value="Login" /></td>
</tr>
</table>
</form>
</body>
</html>