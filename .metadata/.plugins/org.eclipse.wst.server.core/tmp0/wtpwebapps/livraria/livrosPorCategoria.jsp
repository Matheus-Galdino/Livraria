<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${requestScope.livros}" var="livros" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Livros filtrados pela categoria</title>

<style type="text/css">
table {
	text-align: center;
	border-collapse: collapse;
}

td {
	padding: 5px;
	border: 1px solid #000;
}
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>Cod livro</td>
				<td>Titulo</td>
				<td>Autor</td>
				<td>Categoria</td>
				<td>Valor</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ livros }" var="livro">
				<tr>
					<td>${ livro.codlivro }</td>
					<td>${ livro.titulo }</td>
					<td>${ livro.autor }</td>
					<td>${ livro.categoria }</td>
					<td>R$ ${ livro.valor }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>