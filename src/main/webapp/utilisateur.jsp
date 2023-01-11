<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Admin </title>
<link type="text/css" rel="stylesheet" href="CSS/style.css"/>
</head>
<body>
<form action="utilisateur" method="post">
<div align ="center">
<fieldset>
 <h1> Gestion des Administrateur </h1>
 </fieldset>
 <fieldset>
<table>
<tr><td>User Name: </td><td><input type="text" name="username"></td></tr>
<tr><td>Password: </td><td><input type="password" name="password"></td></tr>
<tr><td>Email: </td><td><input type="text" name="email"></td></tr>
<tr><td>phone: </td><td><input type="text" name="phone"></td></tr>
<tr><td></td><td><input type="submit" value="Ajouter"></td></tr>
</table>
</fieldset>
</div>
</form>
<fieldset>
<div align ="center"  >
<h1><a href="menu.jsp"> Quitter  </a></h1>
</div>
</fieldset>
</body>
</html>