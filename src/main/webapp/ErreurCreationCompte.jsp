<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="ISO-8859-1">
<title>Erreur lors de la cr�ation du compte, donn�es invalide.</title>
</head>
<body>
    
	<header><%@include file="/WEB-INF/EnTete.jsp"%></header>
	
    <div class="container-fluid">
	<h2>
		Une erreur est survenue, le(s) champ(s)...
		<%request.getAttribute("Erreurs"); %>
	</h2>
    </div>

	<img src="error.jpeg" alt="">
	<footer><a href="PageAcceuil.jsp">Retour à la page d'acceuil</a></footer>


</body>
</html>