<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="models.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eleve</title>
</head>
<body>

	<%
	Student student = (Student) request.getAttribute("student");
	%>
	<h3><%=student.getNom() %><h3>
	<h3><%=student.getPrenom() %><h3>
	<h3><%=student.getAge() %><h3>
	<h4><%=student.getNote() %><h4>
	<h4><%=student.getFormation() %><h4>

</body>
</html>