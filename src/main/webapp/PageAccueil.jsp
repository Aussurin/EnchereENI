<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="PageAccueil.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&family=Ultra&display=swap" rel="stylesheet">
<title>Accueil</title>
</head>
<body>
	

	
	<div class="insc">
				<a href="/CreationCompte.java">S'inscrire - Se connecter</a>
	</div>
	
	<div class="container-fluid">
		<header>
			<%@include file="/WEB-INF/EnTete.jsp"%>
		</header>
	</div>
	
	
	
<main>
	<h1>Listes des enchères</h1>
	


	<form method="post" action="/EnchereENI/src/main/java/ihm/PageAccueil.java">
<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
	<div class ="filtres">
		<label for="filtres">Filtres :</label> 
		<input type="search"id="site-search" name="nomDeLarticle">
	</div>
</div>	





	
<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">		
        <div class="categories" >
			<label for="categorie">Catégories :</label> <select name="c"
			id="categorie">
				<option value="toutes">Toutes</option>
				<option value="informatique">Informatique</option>
				<option value="ameublement">Ameublement</option>
				<option value="vetement">Vêtement</option>
				<option value="sport-loisir">Sport & Loisir</option>
			</select>
		</div>
</div>
        

       	 <span>
           	 <button class="btn" type="submit">Rechercher</button>
        </span>
		
		</form>
	<div class="listencher">
</div>
</main>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>