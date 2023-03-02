<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<script src="/src/main/java/ihm/Script.js"></script>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="CreerCompte.css">
<meta charset="ISO-8859-1">
<title>Cr�ation de compte</title>
</head>
<body>
	<%@include file="/WEB-INF/EnTete.jsp" %>
	<main>
		<h2>Cr�ation de Compte</h2>
		<form method="post" action="/EnchereENI/src/main/java/ihm/CreerCompte.java">
			<table>
				<tr>
					<td><label for="Pseudo">Pseudo</label><input type="text" name="Pseudo" id="Pseudo" placeholder="Pseudo" required="required"></td>
					<td><label for="Nom">Nom</label><input type="text" name="Nom" id="Nom" placeholder="Nom" required="required"></td>
				</tr>
				<tr>
					<td><label for="Prenom"></label>Pr�nom<input type="text" name="Prenom" id="Prenom" placeholder="Prenom" required="required"></td>
					<td><label for="Email"></label>Email<input type="email" id="Email" placeholder="Email" required="required"></td>
				</tr>
				<tr>
					<td><label for="Telephone"></label>T�l�phone<input type="tel" name="Telephone" id="Telephone" placeholder="Telephone"></td>
					<td><label for="Rue"></label>Rue<input type="text" name="Rue" id="Rue" placeholder="Rue" required="required"></td>
				</tr>
				<tr>
					<td><label for="CodePostale"></label>Code Postale<input type="number" name="CodePostale" id="CodePostale" placeholder="CodePostale" required="required"></td>
					<td><label for="Ville"></label>Ville<input type="text" name="Ville" id="Ville" placeholder="Ville" required="required"></td>
				</tr>
				<tr>
					<td><label for="Mdp"></label>Mod de passe<input type="password" name="Mdp" id="Mdp" placeholder="Mot de passe" required="required"></td>
					<td><label for="ConfirmMdp"></label>Mod de passe<input type="Confirmpassword" name="ConfirmMdp" id="ConfirmMdp" placeholder="Confirmez le mot de passe" required="required"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Cr�er un compte"></td>
					<td><a href="PageAcceuil.jsp">Retour</a></td>
				</tr>
			</table>			
		</form>
	</main>

</body>
</html>