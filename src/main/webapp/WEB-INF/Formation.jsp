<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="models.Formation"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formation</title>
</head>
<body>

	<%
	Formation formation = (Formation) request.getAttribute("formation");
	%>
	<h3><%=formation.getTitre()%><h3>
	<h3><%=formation.getProgramme()%><h3>
	<h3><%=formation.getNbEleve()%><h3>
</body>
</html>