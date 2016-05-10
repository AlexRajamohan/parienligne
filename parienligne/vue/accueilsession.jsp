<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head><title>Espace adhérent</title><link rel="stylesheet" media="screen" type="text/css" title="index" href="menu.css" /></head>
 
<body>
 
<ul id="menu_horizontal">
		<form:form method="GET" action="/parienligne/clickConnexion1">
			<table>
				<tr>
					<td><li class="bouton_gauche"><a href="">Accueil</a></li>
<!-- 					<input type="submit" value="Connexion" /></td> -->
				</tr>
			</table>
		</form:form>

<li class="bouton_gauche"><a href="#">Créditer son compte</a></li>
<li class="bouton_gauche"><a href="#">Créer un pari</a></li>
<li class="bouton_droite"><a href="#">Vendre ses ducats</a></li>
<li class="bouton_droite"><a href="#">Se déconnecter</a></li>
</ul>
 
</body>
</html>
