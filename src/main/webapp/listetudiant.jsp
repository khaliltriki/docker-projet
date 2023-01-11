<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Etudiants</title>
</head>
<body>

<div align ="center">
<fieldset>
 <h1> Gestion des Etudiantes </h1>
 </fieldset>
</div>

<hr>Liste des Etudiantes</hr>
<table border="1"  width="100%">
   <tr>
      <th>ID </th>
     <th>Nom </th>
     <th>Date Inscription </th> 
     <th>sexe </th>
   </tr>
   <%
    String dbUrl = "jdbc:mysql://localhost:3306/gnote";
	 String dbUname = "root";
	 String dbPassword = "";

	 try{
		Class.forName("com.mysql.cj.jdbc.Driver") ;
		Connection con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);
		PreparedStatement pst=con.prepareStatement("select * from etudiant");
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
			
			%>
			
	 <tr>
        <td><%=rs.getString(1) %> </td>
        <td><%=rs.getString(2) %> </td>
        <td><%=rs.getString(3) %> </td> 
        <td><%=rs.getString(4) %> </td>
    </tr>
			<%
		}
			rs.close();
		pst.close();
		con.close();
	 }catch(Exception e){
		 System.out.print(e);
	 }
	
   
   %>
  

   
</table>
<a href="addetudiant.jsp"> Ajouter un Etudiant </a>
<br>
<a href="menu.jsp"> Quitter </a>

</body>
</html>