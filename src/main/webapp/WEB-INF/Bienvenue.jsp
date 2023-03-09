<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<script src="/src/main/java/ihm/Script.js"></script>
	<html>
	<head>
	<meta charset="UTF-8">
	
	<title>Title of the document</title>
	</head>
	
	<body>
		<h1>Listes des encheres</h1>
	
		<div>
			<label for="filtres">Filtres :</label> <input type="search"
				id="site-search" name="filtres">
			<button>Rechercher</button>
		</div>
	
		<div>
			<span> <a href="Enchères.html">Enchères</a>
			</span> <span> <a href="VendreUnArticle.html">Vendre un article</a>
			</span> <span> <a href="MonProfil.html">Mon profil</a>
			</span> <span> <a href=".html">Déconnexion</a>
			</span>
		</div>
	
		<div>
			<label for="categorie">Catégories :</label> <select name="categorie"
				id="categorie">
				<option value="">Toutes</option>
				<option value="informatique">Informatique</option>
				<option value="ameublement">Ameublement</option>
				<option value="vetement">Vêtement</option>
				<option value="sport-loisir">Sport & Loisir</option>
			</select>
		</div>
	</body>
	
	</html>