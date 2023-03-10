<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Créer Compte</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="SupprimerMonCompte.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&family=Ultra&display=swap" rel="stylesheet">
</head>
<body>

	<main>
        <header>
            <%@include file="/WEB-INF/EnTete.jsp"%>
        </header>
        
		<div class="box">
			<div class="container-fluid">
				<h1>Mon profile</h1>
			</div>
		<form method="get"
			action="/EnchereENI/src/main/java/ihm/CreerCompte.java">
			<table>
                
				<tr>
                    <div class="table">
					<td><label for="Pseudo"></label><input type="text"
						name="Pseudo" id="Pseudo" placeholder="Pseudo" required="required"></td>
                    </div>
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
                    <div class="button">
					<a href="Bienvenue.html"><td><input type="submit"
							value="Créer"></td></a>
                        </div>
                        <div class="button">
					<a href="supprimerCompte.java"><td><input type="delete" value="Supprimer mon compte"></td></a>
                </div>
				</tr>
            </div>
			</table>
		</form>
	</div>
	
	</main>


	<div class="container"></div>
	
