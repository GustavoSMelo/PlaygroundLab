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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		UserController uc = new UserController();
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if (email.isEmpty() || password.isEmpty()) {
			out.println("<h1>Please, complete all the fields and try again </h1>");
		} else {
			UserModel user = uc.Show(email, password);
			if(user.getID() == null) {
				out.println("<h1>User not exists, please, try create a new login</h1>");
			} else {
				response.sendRedirect("/views/Logged.jsp");
			}
		}
	}
}
