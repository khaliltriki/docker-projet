<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Authentication</title>
</head>
<body>
<fieldset>
<div align ="center">
<h1> Application Gestion De Note</h1>

<form action ="login" method="post">

<table>

<tr><td>User Name: </td><td><input type="text" name="username"></td></tr>
<tr><td>Password: </td><td><input type="password" name="password"></td></tr>

<tr><td></td><td><input type="submit" value="Se Connecter"></td></tr>
</table>

</form>
</div>
</fieldset>
</body>
</html>