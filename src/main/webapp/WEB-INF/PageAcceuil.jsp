<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enchere-ENI</title>
</head>
<body>
	<%@include file="/WEB-INF/EnTete.jsp" %>
	
	<h1>Listes des encheres</h1>

    <div>
        <label for="filtres">Filtres :</label>
        <input type="search" id="site-search" name="q">
        <button>Rechercher</button>
    </div>
    
   <div> 
    <span>
    <a href="Connexion.html">S'inscrire - Se connecter</a>
    </span>
   </div>

    <div>
        <label for="categorie">Catégories :</label>

        <select name="c" id="categorie">
            <option value="">Toutes</option>
            <option value="informatique">Informatique</option>
            <option value="ameublement">Ameublement</option>
            <option value="vetement">Vêtement</option>
            <option value="sport-loisir">Sport & Loisir</option>
        </select>
    </div>

	

</body>
</html>