<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CréerCompte</title>
</head>
<body>

	<main>
		<h1>Mon profile</h1>

		<form method="post"
			action="/EnchereENI/src/main/java/ihm/CreerCompte.java">
			<table>

				<tr>
					<td><label for="Pseudo"></label><input type="text"
						name="Pseudo" id="Pseudo" placeholder="Pseudo" required="required"></td>
					<td><label for="Nom"></label><input type="text" name="Nom"
						id="Nom" placeholder="Nom" required="required"></td>
				</tr>
				<tr>
					<td><label for="Prenom"></label><input type="text"
						name="Prenom" id="Prenom" placeholder="Prenom" required="required"></td>
					<td><label for="Email"></label><input type="email" id="Email"
						placeholder="Email" required="required"></td>
				</tr>
				<tr>
					<td><label for="Telephone"></label><input type="tel"
						name="Telephone" id="Telephone" placeholder="Telephone"></td>
					<td><label for="Rue"></label><input type="text" name="Rue"
						id="Rue" placeholder="Rue" required="required"></td>
				</tr>
				<tr>
					<td><label for="CodePostale"></label><input type="number"
						name="CodePostale" id="CodePostale" placeholder="CodePostale"
						required="required"></td>
					<td><label for="Ville"></label><input type="text" name="Ville"
						id="Ville" placeholder="Ville" required="required"></td>
				</tr>
				<tr>
					<td><label for="Mdp"></label><input type="password" name="Mdp"
						id="Mdp" placeholder="Mot de passe" required="required"></td>
					<td><label for="ConfirmMdp"></label><input
						type="Confirmpassword" name="ConfirmMdp" id="ConfirmMdp"
						placeholder="Confirmez le mot de passe" required="required"></td>
				</tr>
				<tr>
					<a href="Bienvenue.html"><td><input type="submit"
							value="Créer"></td></a>
					<td><a href="PageAcceuil.jsp"><button>Annuler</button></a></td>
				</tr>
			</table>
		</form>
	</main>
	<div class="container"></div>


</body>
</html>