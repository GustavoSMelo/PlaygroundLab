<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Registry form</title>
	</head>
	<body>
		<form action="RegistryServlet" method="post">
			<input type="text" name="name" placeholder="name" id="name" />
			<input type="email" name="email" placeholder="email" id="email"/>
			<input type="password" name="password" placeholder="password" id="password"/>
			<input type="number" name="id" placeholder="id" id="id" />
			<button>Registry</button>
		</form>
	</body>
</html>