package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controllers.UserController;
import models.UserModel;

@WebServlet("/RegistryServlet")
public class RegistryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegistryServlet() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		PrintWriter out = response.getWriter();
				
		UserController uc = new UserController();
		UserModel user = new UserModel();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Long id = Long.parseLong(request.getParameter("id"));
		
		if(name.isEmpty()|| email.isEmpty() || password.isEmpty() || id == null) {
			out.println("<h1>Please, complete all the fields and try again </h1>");
		} else {
			user.setEmail(email);
			user.setName(name);
			user.setPassword(password);
			user.setID(id);

			uc.Store(user);
			response.sendRedirect("/index.jsp");
		}
	}

}
