<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${requestScope.categorias}" var="categorias" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar livro</title>

<style type="text/css">
label {
display: block;
margin-top: 10px;
margin-bottom: 5px;
}
</style>

</head>
<body>
	<form action="CadastrarLivro" method="post">
		<label>Código do livro: </label>
		<input type="number" name="cod">
		
		<br>
		
		<label>Titulo: </label>
		<input name="titulo">
		
		<br>
		
		<label>Autor:</label>
		<input name="autor">
		
		<br>
		
		<label>Categoria: </label>
		<select name="categoria">
			<c:forEach items="${ categorias }" var="categoria">
				<option>${categoria.categoria}</option>
			</c:forEach>
		</select>
		
		<br>
		
		<label>Valor: </label>
		<input type="number" name="valor">
		
		<button>Enviar</button>
	</form>
</body>
</html>