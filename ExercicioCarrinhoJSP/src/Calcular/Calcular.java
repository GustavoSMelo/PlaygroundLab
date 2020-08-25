package Calcular;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calcular")
public final class Calcular extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Calcular() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		PrintWriter out = response.getWriter();
		
		float BuyValue = 0.0f;
		
		String[] products = request.getParameterValues("product");
		
		if(products != null || products.length <= 0) {
			for(int i = 0; i < products.length; i++) {
				if(products[i].equalsIgnoreCase("Fogao6bocas")) {
					int qntdFogoes = Integer.parseInt(request.getParameter("qntdFogao6Bocas"));
					
					BuyValue += qntdFogoes * 700;
				}
				if(products[i].equalsIgnoreCase("Fogao5bocas")) {
					int qntdFogoes = Integer.parseInt(request.getParameter("qntdFogao5Bocas"));
					
					BuyValue += qntdFogoes * 600;
				}
				
				if(products[i].equalsIgnoreCase("Fogao4bocas")) {
					int qntdFogoes = Integer.parseInt(request.getParameter("qntdFogao4Bocas"));
					
					BuyValue += qntdFogoes * 500;
				}
				if(products[i].equalsIgnoreCase("FreezerBrastemp")) {
					int qntdFogoes = Integer.parseInt(request.getParameter("qntdFreezerBrastemp"));
					
					BuyValue += qntdFogoes * 1850;
				}
				
				if(products[i].equalsIgnoreCase("RefrigeradorEletrolux")) {
					int qntdFogoes = Integer.parseInt(request.getParameter("RefrigeradorEletrolux"));
					
					BuyValue += qntdFogoes * 2300;
				}
			}
			
			out.println("O valor total da compra foi de: " + BuyValue + " R$");
		}
	}
}
