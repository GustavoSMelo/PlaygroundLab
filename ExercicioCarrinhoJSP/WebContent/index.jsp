<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="ISO-8859-1" />
		<title>Insert title here</title>
	</head>
	<body>

		<section>
			<form method="post" action="Calcular">
				<h1>Fogões</h1>
				<ul>
					<li>
						<input type="checkbox" name="product" value="Fogao6bocas"/>
						<input type="number" name="qntdFogao6Bocas" value="0"/>
						<label>Fogao de 6 bocas: 700R$</label>
					</li>	
					
					<li>
						<input type="checkbox" name="product" value="Fogao5bocas"/>
						<input type="number" name="qntdFogao5Bocas" value="0"/>
						<label>Fogao de 5 bocas: 600R$</label>
					</li>
					
					<li>
						<input type="checkbox" name="product" value="Fogao4bocas"/>
						<input type="number" name="qntdFogao4Bocas"value="0" />
						<label>Fogao de 4 bocas: 500R$</label>
					</li>
				</ul>
				
				<h1>Freezers e Refrigeradores </h1>
				<ul>
					<li>
						<input type="checkbox" name=product value="FreezerBrastemp"/>
						<input type="number" name="qntdFreezerBrastemp" value="0"/>
						<label>Freezer Brastemp 1850R$</label>
					</li>
					
					<li>
						<input type="checkbox" name="product" value="RefrigeradorEletrolux"/>
						<input type="number" name="qntdRefrigeradorEletrolux" value="0" />
						<label>Refrigerador Eletrolux 2300R$</label>
					</li>
				</ul>
				<button type="submit">Comprar</button>
			</form>
		</section>
	</body>
</html>