<%@page import="fr.akharroub.beans.Produits"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>produit</title>
<link rel="stylesheet" href="ressource/css/produits/produits.css">
</head>
<body>

	<h1>list des produits</h1>
	<div id="conteneur">
		<%
Produits [] Produits = (Produits[]) request.getAttribute("Produits");
for(int i = 0 ; i < Produits.length ;i++){
	%>

		<div class="block_produit">
			<div class="prix">
				<label><%= Produits[i].getPrix() %>&euro;</label>
			</div>
			<a href="<%= Produits[i].getLien() %>"> 
			<img src="<%= Produits[i].getImages() %>" />
			</a>
			<div class="description"><%= Produits[i].getNom() %></div>
		</div>

		<%
}
    %>

	</div>

	<a href="http://localhost:8080/produits/accueil">accueil</a>


</body>
</html>