<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="servlets.StudentsServlet"%>
<%@page import="models.Student"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des élèves</title>
</head>
<body>

	<%
	for (Student student : (List<Student>) request.getAttribute("students")) {
	%>
	<li><a href="/student?name=<%=student.getNom()%>"><%=student.getNom()%></a>
	</li>
	<%
	}
	%>

</body>
</html>