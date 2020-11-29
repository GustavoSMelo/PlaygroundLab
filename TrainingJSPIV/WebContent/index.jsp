<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="UserServlets" method="post">
			<label>ID: </label>
			<input type="number" name="txtID" placeholder="insert your id here... " required/>
			<br />
			
			<label>Name: </label>
			<input type="text" name="txtName" placeholder="insert your name here... " required/>
			<br />
			
			<label>Password: </label>
			<input type="password" name="txtPassword" placeholder="insert your password here... " required/>
			<br />
			
			<button type="submit">Registry</button>
		</form>
	</body>
</html>
