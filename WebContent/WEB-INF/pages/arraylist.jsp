<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>arraylist</title>
</head>
<body>
<h1>Arralist</h1>

<%

ArrayList<String> ville = (ArrayList<String>) request.getAttribute("ville");
%>
<p>
Taille de tableau : <%=ville.size() %>
</p>


<%
for(int i = 0 ; i < ville.size() ; i++){
	out.print(ville.get(i)+"<br/>");
}
%>

<% if (ville.isEmpty()){%>

<p> le tableau est vide </p>

<%} %>

<h1>el</h1>
<p>
tableau ville : ${ville };

</p>

<p>
<ul>
<li>${ville[0] }</li>
<li>${ville[1] }</li>
<li>${ville[2] }</li>
<li>${ville[3] }</li>
</ul>
</p>

<a href="http://localhost:8080/produits/accueil">accueil</a>
</body>
</html>