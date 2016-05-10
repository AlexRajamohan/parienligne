<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8" />
<title>Inscription</title>
<link type="text/css" rel="stylesheet" href="../form.css" />
</head>
<body>
	<%-- 	<form method="post" action="inscription"> --%>
	<fieldset>
		<legend>Inscription</legend>
		<p>Veuillez remplir les informations ci-dessous :</p>

		<label for="email">Adresse email<span class="requis">*</span></label>
		<input type="email" id="email" name="email" value="" size="20"
			maxlength="60" /> <span class="erreur">${inscr.erreurs['email']}</span>
		<br /> <label for="mdp">Mot de passe <span class="requis">*</span></label>
		<input type="password" id="mdp" name="mdp" value="" size="20"
			maxlength="20" /> <span class="erreur">${inscr.erreurs['mdp']}</span>
		<br /> <label for="confirmation">Confirmation du mot de passe
			<span class="requis">*</span>
		</label> <input type="password" id="confirmation" name="confirmation" value=""
			size="20" maxlength="20" /> <span class="erreur">${inscr.erreurs['confirmation']}</span>
		<br /> <label for="nom">Identifiant <span class="requis">*</span></label>
		<input type="text" id="id" name="id" value="" size="20" maxlength="20" />
		<span class="erreur">${inscr.erreurs['id']}</span> <br />
		
		<form:form method="GET" action="/parienligne/clickInscription">
			<table>
				<tr>
					<td><input type="submit" value="Inscription" /></td>
				</tr>
			</table>
		</form:form>
		<!-- 			<input type="submit" value="Inscription" class="sansLabel" /> -->
		<br />
		<p class="${empty inscr.erreurs ? 'succes' : 'erreur'}">${inscr.resultat}</p>
	</fieldset>
	<%-- 	</form> --%>
</body>
</html>