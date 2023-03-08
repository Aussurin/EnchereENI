<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/WEB-INF/EnTete.jsp"%>
	
	
	
	<tr>
		<td><label for="Identifiant">Identifiant : </label><input
			type="text" name="Identifiant" id="Identifiant" placeholder=""
			required="required"></td>
		<td><label for="Mot de passe"></label>Mot de passe :<input
			type="password" name="Mot de passe" id="Mot de passe" placeholder=""
			required="required"></td>
	</tr>

	<div>

		<input type="checkbox" id="rememberme" name="rememberme" value="1">
		<label for="rememberme">Se souvenir de moi</label>
	</div>

	<div>
		<button>
			<a href="Bienvenue.html">Connexion</a>
		</button>
	</div>

	<div>
		<a href="CreerCompte.html" target="_blank"><button>Créer
				un Compte</button></a>
	</div>

</body>
</html>