<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="LoginServlet" method="post">
			<label>Name: </label>
			<input type="text" placeholder="insert your name here... " name="txtName" required/>
			
			<button type="submit">Logar</button>
		</form>
	</body>
</html>
