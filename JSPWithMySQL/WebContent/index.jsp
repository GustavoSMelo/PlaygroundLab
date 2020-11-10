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
			<input name="email" type="email" id="email" placeholder="email" />
			<input name="password" type="password" id="password" placeholder="password" />
			<button>Login</button>
		</form>
		<a href="http://localhost:8080/JSPWithMySQL/Registry.jsp">Registry here </a>
	</body>
</html>