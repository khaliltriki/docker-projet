<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<div align="center">


<h1>User Login From</h1>

<form action="LoginServlet"  method="Post">
</form>
<table>
<tr>
<td>User Name</td>
<td> <input type="text" name="username" > </td>
</tr>
<tr>
<td>Password</td>
<td> <input type="password" name="password" > </td>
</tr>
<tr>
<td > <input type="Submit"  value="Connecter" > </td>
</tr>
</table>
</div>
</body>
</html>