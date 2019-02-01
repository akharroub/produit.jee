<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jstl</title>
</head>
<body>
	<h1>jstl</h1>
	<c:set var="nom" value="james"></c:set>
	<c:out value="bonjour avec jstl" />
	<c:out value="${nom }"/>

	<br> ${"hello" }

	<c:if test="true">
		<h1>titre dans un c:if</h1>
	</c:if>

	<c:forEach begin="1" end="10" step="1">
		<h3>boucle</h3>
	</c:forEach>

	<c:forEach begin="0" end="20" step="5">
		<h4>STEP 5</h4>
	</c:forEach>

	<c:forEach var="i" begin="1" end="10" step="1">
	<c:if test="${i % 2 ==0 }">
		<c:out value="${i }" />
		</c:if>
	</c:forEach>
	
	<br>
	<br>
	
	<c:forEach var="i" begin="1" end="100" step="1">
	<c:out value="${i }" />
	<c:if test="${i % 20 ==0 }">
		<br>
		</c:if>
	</c:forEach>
	


	<br>
	<a href="http://localhost:8080/produits/accueil">accueil</a>
</body>
</html>