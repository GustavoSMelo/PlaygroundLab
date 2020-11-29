<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Main page</title>
	</head>
	<body>
		<h1>Training jsp </h1>
		<form action="CalcServlet" method="post">
			<input name="firstNumber" type="number" placeholder="first number" />
			<input name="secondNumber" type="number" placeholder="second number" />
			
			<br />
			<input name="rbCalc" type="radio" value="soma" />
			<label>Soma</label>	
			<br />
			
			<input name="rbCalc" type="radio" value="subtracao" />
			<label>Menos</label>
			<br />
			
			<input name="rbCalc" type="radio" value="divisao" />
			<label>Divisão</label>
			<br />
			
			<input name="rbCalc" type="radio" value="multiplicacao" />
			<label>Multiplicação</label>
			<br />
			
			<input type="checkbox" name="item" value="item1" />
			<input type="checkbox" name="item" values="item2" />
			<input type="checkbox" name="item" values="item3" />
			
			<button type="submit">Calcular </button>
		</form>
	</body>
</html>
