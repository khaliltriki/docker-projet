<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> etudiants </title>
<link type="text/css" rel="stylesheet" href="CSS/style.css"/>
</head>
<body>
<form action="Etudiant" method="post">
<div align ="center">
<fieldset>
 <h1> Ajouter Etudiant </h1>
 </fieldset>
 <fieldset>
<table>
<tr><td>code Ins: </td><td><input type="text" name="id"></td></tr>
<tr><td>Name: </td><td><input type="text" name="nom"></td></tr>
<tr><td> Date Inscription: </td><td><input type="date" name="date_ins"></td></tr>
<tr><td>Sexe: </td><td>
<select name="sex"><option>Homme</option><option>Femme</option>
</select></td></tr>
<tr><td></td><td><input type="submit" value="Ajouter"></td></tr>
</table>
</fieldset>
</div>
</form>
<fieldset>
<div align ="center"  >
<h1><a href="listetudiant.jsp"> Retour  </a></h1>
</div>
</fieldset>
</body>
</html>