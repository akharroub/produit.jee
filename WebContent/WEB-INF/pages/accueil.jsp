<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>accueil</title>
</head>
<body>
<h1>Accueil</h1>
<a href="http://localhost:8080/produits/ProduitsServlet">Produits</a><br><br>
<a href="http://localhost:8080/produits/Utilisateur">Utilisateur</a><br><br>
<a href="http://localhost:8080/produits/test">Arraylist</a><br><br>
<a href="http://localhost:8080/produits/jstl">Jstl</a><br><br>
<div>
<div>
<p>nom: ${ personnes[0].nom }</p>
<p>prenom: ${ personnes[0].prenom }</p>
<p>age: ${ personnes[0].age }</p>
<p>taille: ${ personnes[0].taille }</p>
<p>poide: ${ personnes[0].poide }</p>

</div>
============================================
<div>
<p>nom: ${ personnes[1].nom }</p>
<p>prenom: ${ personnes[1].prenom }</p>
<p>age: ${ personnes[1].age }</p>
<p>taille: ${ personnes[1].taille }</p>
<p>poide: ${ personnes[1].poide }</p>
</div>
==================================================
<div>
<p>nom: ${ personnes[2].nom }</p>
<p>prenom: ${ personnes[2].prenom }</p>
<p>age: ${ personnes[2].age }</p>
<p>taille: ${ personnes[2].taille }</p>
<p>poide: ${ personnes[2].poide }</p>
</div>

==================================================

</div>
</body>
</html>