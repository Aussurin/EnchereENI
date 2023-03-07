<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bienvenue</title>
</head>

<body>
<h1>Listes des encheres</h1>

    <div>
        <label for="filtres">Filtres :</label>
        <input type="search" id="site-search" name="q">
        <button>Rechercher</button>
    </div>
    
    <div> 
        <span>
            <a href="Enchères.html">Enchères</a>
        </span>
        <span>
            <a href="VendreUnArticle.html">Vendre un article</a>
        </span>
        <span>
            <a href="MonProfil.html">Mon profil</a>
        </span>
        <span>
            <a href=".html">Déconnexion</a>
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