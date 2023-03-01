<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erreur lors de la création du compte, données invalide.</title>
</head>
<body>
<%@include file="/WEB-INF/EnTete.jsp" %>
<h2>Une erreur est survenue, le(s) champ(s) <%request.getAttribute("Erreurs"); %> </h2>
<a href="PageAcceuil.jsp">Retour à la page d'acceuil</a>
</body>
</html>