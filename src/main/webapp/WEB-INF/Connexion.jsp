<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	
	<div class="box">
		<form>
		<tr>
			<div class="form-text">
			<td><label for="Identifiant">Identifiant : </label><input
				type="text" name="Identifiant" id="Identifiant" placeholder=""
				required="required"></td></br>
			</div>
			<div class="form-text">
			<td><label for="Mot de passe"></label>Mot de passe :<input
				type="password" name="Mot de passe" id="Mot de passe" placeholder=""
				required="required"></td></tr></br>
			</div>
		</tr>
	
		
	
	<div class="container">
		<div class="button">
			<a href="Bienvenue.html"><input type="submit" value="Connexion"></a>
		</div>
	
		
	
	
		<div class="checkbox">
		<input type="checkbox" id="rememberme" name="rememberme" value="1">
			<label for="rememberme">Se souvenir de moi</label>
		</br>
			<a href="password_reset.html">Mot de passe oublié</a>
		</div>
	</div>
	
	
		<div>
		
		</div>
	
		
		<div class="button">
			<a href="CreerCompte.html" target="_blank"><input type="reset" value="Créer un compte"></a>
		</div>
	
		
	</form>
	</div>
	
	</body>
</html>