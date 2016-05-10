<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<!-- <meta charset="utf-8" /> -->
<title>Connexion</title>
<link type="text/css" rel="stylesheet" href="form.css" />
</head>
<body>
	<%-- 		<form method="post" action="connexion"> --%>
	<fieldset>
		<legend>Connexion</legend>
		<p>Vous êtes déjà  inscrit:</p>

		<label for="nom">Adresse email <span class="requis">*</span></label> <input
			type="email" id="email" name="email"
			value=<c:out value="${utilisateur.email}"/> " size="20"
			maxlength="60" /> <span class="erreur">${form.erreurs['email']}</span>
		<br /> <label for="motdepasse">Mot de passe <span
			class="requis">*</span></label> <input type="password" id="motdepasse"
			name="motdepasse" value="" size="20" maxlength="20" /> <span
			class="erreur">${form.erreurs['motdepasse']}</span> <br />
		<!-- 			<input type="submit" value="Connexion" class="sansLabel" /> <br /> -->

		<form:form method="GET" action="/parienligne/clickConnexion">
			<table>
				<tr>
					<td><input type="submit" value="Connexion" /></td>
				</tr>
			</table>
		</form:form>
		<p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
	</fieldset>

	<fieldset>
		<legend>Inscription</legend>
		<p>Vous n'avez pas encore de compte ?</p>

		<form:form method="GET" action="/parienligne/clickSinscrire">
			<table>
				<tr>
					<td><input type="submit" value="S'inscrire" /></td>
				</tr>
			</table>
		</form:form>
		<!-- 		new -->
<%-- 		<form:form method="post" modelAttribute="creation" --%>
<%-- 			action="creerCreationListeCourses"> --%>
<%-- 			<spring:message code="creation.elementcourses.libelle.libelle" /> --%>
<%-- 			<form:input path="libelle" /> --%>
<%-- 			<b><i><form:errors path="libelle" cssclass="error" /></i></b> --%>
<!-- 			<br> -->
<%-- 			<spring:message code="creation.elementcourses.libelle.quantite" /> --%>
<%-- 			<form:input path="quantite" /> --%>
<%-- 			<b><i><form:errors path="quantite" cssclass="error" /></i></b> --%>
<!-- 			<br> -->
<!-- 			<input type="submit" /> -->
<%-- 		</form:form> --%>

		<!-- 			<input type="submit" value="M'inscrire" class="sansLabel" /> <br /> -->
	</fieldset>
	<%-- 	</form> --%>
</body>
</html>