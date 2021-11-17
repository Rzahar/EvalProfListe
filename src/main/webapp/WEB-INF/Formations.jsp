<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="models.Formation"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des formations</title>
</head>
<body>
	<h1>formations</h1>
	<%
	for (Formation formation : (List<Formation>) request.getAttribute("formations")) {
	%>
	<li><a href="/formation?title=<%=formation.getTitre()%>"><%=formation.getTitre()%></a>
	</li>
	<%
	}
	%>

</body>
</html>