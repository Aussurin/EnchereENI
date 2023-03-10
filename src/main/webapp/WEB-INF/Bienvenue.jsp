<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<script src="/src/main/java/ihm/Script.js"></script>
	<html>
	<head>
	<meta charset="UTF-8">
		
	<title>Bienvenue</title>
	</head>
	
	<body>

		<header>
			<a href="Enchères.html" type="link">Enchères</a>
			<a href="VendreUnArticle.html" type="link">Vendre un article</a>
			<a href="MonProfil.html" type="link">Mon profil</a>
			<a href=".html" type="link">Déconnexion</a>
		</header>
	
		<%@include file="/WEB-INF/EnTete.jsp"%>
	
	
			<div class="container-fluid">
				<h1>Listes des enchères</h1>
			</div>
	
	
	
	<form>
		<div >
				<label for="filtres">Filtres :</label> </br><input type="search"
					id="site-search" placeholder="Le nom de l'article contient" name="filtres">
			</div>
		<div>
			<label for="categorie">Catégories :</label> <select type="categorie"
				id="categorie">
				<option value="">Toutes</option>
				<option value="informatique">Informatique</option>
				<option value="ameublement">Ameublement</option>
				<option value="vetement">Vêtement</option>
				<option value="sportLoisir">Sport & Loisir</option>
			</select>
		</div>
	
		<button class="btn" type="submit">Rechercher</button>
	</form>
	
	
	
	<div class="checkbox">
	<form class="container">
		
		<div class="left-div">
	<input type="radio" id="achat" name="achat">
	<label for="achat">Achats:</label></br>
	
	<input type="checkbox" id="achat2" name="achat2">
	<label for="achat2">mes enchères ouvertes</label></br>
	
	<input type="checkbox" id="achat2" name="achat2">
	<label for="achat2">mes enchères</label></br>
	
	<input type="checkbox" id="achat3" name="achat3">
	<label for="achat3">mes enchères remportées</label></br>
		</div>
	</form>
	</body>
	
	</html>