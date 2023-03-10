<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
<title>CréerCompte</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="DetailVente.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&family=Ultra&display=swap" rel="stylesheet">
</head>
<body>

	<main>
        <header>
            <%@include file="/WEB-INF/EnTete.jsp"%>
        </header>
        
		
        <form>
            <td><label for="Ma proposition">Ma proposition</label><input type="number"
                name="Ma Proposition" id="Ma Proposition" placeholder=" "
                required="required"></td>
        </tr>

        <div class="button">
            <a href="encherir.java"><td><input type="submit"
                    value="Encherir"></td></a>
                </div>
    </form>
        
	</body>

</html>