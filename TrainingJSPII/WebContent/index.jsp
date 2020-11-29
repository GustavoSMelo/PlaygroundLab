<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8" />
		<title>Insert title here</title>
	</head>
	<body>
		<%! String name = "Gustavo"; %> <!-- declaratives (used to declare variable or objects) -->
		<%= "hello world" %> <!-- expression (used to send text, without need to use out.println ) -->
		
		<%
			for (int i = 0; i <= 5; i++) {
				out.println("<h1>I want to study more </h1>");
			}
		
			out.println("welcome to our system " + name);
		%> <!-- scriptlets (used to use java code inside html) -->
		
		<form action="views/receiveName.jsp" method="post">
			<input type="text" name="name" placeholder="insert your name here... " required/>
			<button type="submit">Enviar</button>
		</form>
	</body>
</html>
