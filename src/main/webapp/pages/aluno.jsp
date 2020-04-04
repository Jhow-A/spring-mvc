<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Olá aluno ${nomeDoAluno} !</h2>
	<br />
	<h2>Número: ${numero }</h2>
	<br />

	<h2>Lista de Alunos</h2>
	<br />

	<table>
		<tr>
			<td>RM</td>
			<td>Nome</td>
			<td>Nota</td>
			<td>Passou?</td>
		</tr>

		<c:forEach items="${listaDeAlunos}" var="aluno">
			<tr>
				<td>${aluno.rm}</td>
				<td>${aluno.nome}</td>
				<td>${aluno.nota}</td>
				<td><c:if test="${aluno.passou}">
				Sim
					</c:if> <c:if test="${not aluno.passou}">
				Não
					</c:if></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>