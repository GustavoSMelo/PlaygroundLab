<%@page import="controllers.UserController"%>
<%@page import="models.UserModel"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8" />
		<title>Insert title here</title>
	</head>
	<body>
		<%
			UserController uc = new UserController();
			ArrayList<UserModel> allUsers = uc.Index();
			
			for(int i = 0; i < allUsers.size(); i++) {
				Long id = allUsers.get(i).getID();
				String name = allUsers.get(i).getName();
				String password = allUsers.get(i).getPassword();
				
				out.println("<p> ID: "+id.toString()+" | name: " + name + " | password: " + password + " \n </p>");
				out.println("<br />");
			}
		%>
	</body>
</html>
