package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Response;
import org.apache.tomcat.util.descriptor.web.LoginConfig;

/**
 * Servlet implementation class Valida
 */
@WebServlet("/Valida")
public class Valida extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Valida() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		
		if(session.getAttribute("login") == null) {
			session.setAttribute("login", login);
			response.sendRedirect("/Ex008/index.jsp");
			System.out.println("1");
		}
		else {
			String registredLogin = session.getAttribute("login").toString();
			
			if(registredLogin.equalsIgnoreCase("teste") && password.equalsIgnoreCase("1234")){
				response.sendRedirect("/Ex008/sistema.jsp");
				System.out.println("2");
			} else if (registredLogin.equalsIgnoreCase("usuario") && password.equalsIgnoreCase("123")) {
				response.sendRedirect("/Ex008/sistema.jsp");
				System.out.println("3");
			} else {
				PrintWriter out = response.getWriter();
				out.println("Usuario ou senha invalidos");
				System.out.println("4");
			}	
		}
	}
}
