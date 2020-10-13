<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			String login = session.getAttribute("login").toString(); 
			if(login.equalsIgnoreCase("teste")){
		%>
		<jsp:include page="components/menu.jsp" />
		<%
			}
		%>
		
		<h1>Seja bem vindo ao sistema</h1>
	</body>
</html>