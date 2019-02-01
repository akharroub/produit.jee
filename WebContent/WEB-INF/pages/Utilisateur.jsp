<%@page import="fr.akharroub.beans.Utilisateur"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="ISO-8859-1">
<title>utilisateur</title>
<link rel="stylesheet" href="ressource/css/produits/Utilisateur.css">
</head>
<body>

<h1>list des Utilisateur</h1>
	<div id="conteneur">
		<%
Utilisateur [] Utilisateur = (Utilisateur[]) request.getAttribute("Utilisateur");
for(int i = 0 ; i < Utilisateur.length ;i++){
	%>

		<div class="block_produit">
			<div class="prix">
				<label><%= Utilisateur[i].getAge() %></label>
				
			</div>
			
			<img src="<%= Utilisateur[i].getLienimages() %>" />
			</a>
			<div class="description"><%= Utilisateur[i].getNom() %></div>
			<div class="description"><%= Utilisateur[i].getPrenom() %></div>
		</div>

		<%
}
    %>

	</div>

	<a href="http://localhost:8080/produits/accueil">accueil</a>


</body>
</html>