<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Création de compte</title>
</head>
<body>
	<%@include file="/WEB-INF/EnTete.jsp" %>
	<main>
		<h2>Création de Compte</h2>
		<form method="post">
			<ul>
				<li><label for="Pseudo">Pseudo</label><input type="text" name="Pseudo" id="Pseudo" placeholder="Pseudo" required="required"></li>
				<li><label for="Nom">Nom</label><input type="text" name="Nom" id="Nom" placeholder="Nom" required="required"></li>
				<li><label for="Prenom"></label>Prénom<input type="text" name="Prenom" id="Prenom" placeholder="Prenom" required="required"></li>
				<li><label for="Email"></label>Email<input type="email" id="Email" placeholder="Email" required="required"></li>
				<li><label for="Telephone"></label>Téléphone<input type="tel" name="Telephone" id="Telephone" placeholder="Telephone"></li>
				<li><label for="Rue"></label>Rue<input type="text" name="Rue" id="Rue" placeholder="Rue" required="required"></li>
				<li><label for="CodePostale"></label>Code Postale<input type="number" name="CodePostale" id="CodePostale" placeholder="CodePostale" required="required"></li>
				<li><label for="Ville"></label>Ville<input type="text" name="Ville" id="Ville" placeholder="Ville" required="required"></li>
				<li><label for="Mdp"></label>Mod de passe<input type="password" name="Mdp" id="Mdp" placeholder="Mdp" required="required"></li>
			</ul>
		</form>
	</main>

</body>
</html>