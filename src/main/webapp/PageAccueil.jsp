<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
	<%@include file="/WEB-INF/EnTete.jsp"%>

	

	
	
	
	
	
<h1>Listes des encheres</h1>
	<div>
		<span> <a href="Connexion.html">S'inscrire - Se connecter</a>
		</span>
	</div>


	<form method="post" action="/EnchereENI/src/main/java/ihm/PageAccueil.java">
	<div>
		<label for="filtres">Filtres :</label> 
		<input type="search"id="site-search" name="nomDeLarticle">
	</div>
	
	
	<div>
		<label for="categorie">Catégories :</label> <select name="c"
			id="categorie">
			<option value="toutes">Toutes</option>
			<option value="informatique">Informatique</option>
			<option value="ameublement">Ameublement</option>
			<option value="vetement">Vêtement</option>
			<option value="sport-loisir">Sport & Loisir</option>
		</select>
	</div>
	
		<input type="submit" value="Rechercher">
		</form>



</body>
</html>