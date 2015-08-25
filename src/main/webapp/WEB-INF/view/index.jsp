<%@ page language="java" contentType="text/html; charset = UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>P e s s o a s</title>
</head>
<body>
	<form method="post" action="/pessoa">
		<table>
			<tr>
				<td><label>Nome:</label></td>
				<td><input type="text" name="Nome"/></td>
			</tr>
			<tr>
				<td><label>Profissao:</label></td>
				<td><input type="text" name="Profissao"/></td>
			</tr>
			<tr>
				<td><label>Data de aniversario:</label></td>
				<td><input type="text" name="DataNiver"/></td>
			</tr>
		</table>
		<input type="submit" value="Salvar" />
	</form>

	<br>
	<br>
</body>
</html>