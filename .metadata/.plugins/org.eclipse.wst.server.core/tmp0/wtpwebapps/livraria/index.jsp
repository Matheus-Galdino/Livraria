<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${requestScope.alunos}" var="alunos" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
ul {
	list-style: none;
}

.alunos-list {
	font-size: 20px;
}
</style>
</head>
<body>
	<nav>
		
	</nav>

	<ul class="alunos-list">
		<c:forEach items="${ alunos }" var="aluno">
			<li>
				RGM: ${ aluno.login } | Nome: ${ aluno.nome }
			</li>
		</c:forEach>
	</ul>
</body>
</html>