<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8" />
        <title>Création d'un pari</title>
        <link type="text/css" rel="stylesheet" href="../form.css" />
    </head>
    <body>
        <form method="post" action="creationpari.jsp">
            <fieldset>
                <legend>Création d'un pari</legend>
                <p>Veuillez remplir les informations ci-dessous :</p>

                <label for="objet">Objet du pari<span class="requis">*</span></label>
                <input type="text" id="objet" name="objet" value="<c:out value="${param.objet}"/>" size="20" maxlength="60" />
                <span class="erreur">${pari.erreurs['objet']}</span>
                <br />

                <label for="montant">Montant mis en jeu <span class="requis">*</span></label>
                <input type="number" id="montant" name="montant" value="<c:out value="${param.montant}"/>" size="20" maxlength="20" />
                <span class="erreur">${pari.erreurs['montant']}</span>
                <br />

                <label for="datel">Date limite de participation <span class="requis">*</span></label>
                <input type="date" id="datel" name="datel" value="<c:out value="${param.datel}"/>" size="20" maxlength="20" />
                <span class="erreur">${pari.erreurs['datel']}</span>
                <br />

                <label for="nbparticip">Nombre de participants<span class="requis">*</span></label>
                <input type="number" id="nbparticip" name="nbparticip" value="<c:out value="${param.nbparticip}"/>" size="20" maxlength="20" />
                <span class="erreur">${pari.erreurs['nbparticip']}</span>
                <br />

                <input type="submit" value="Valider" class="sansLabel" />
                <br />
                <p class="${empty pari.erreurs ? 'succes' : 'erreur'}">${pari.resultat}</p>
            </fieldset>
        </form>
    </body>
</html>