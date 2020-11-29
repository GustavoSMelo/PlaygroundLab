package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controllers.UserController;
import models.UserModel;

@WebServlet("/UserServlets")
public class UserServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UserServlets() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		Long txtID = Long.parseLong(request.getParameter("txtID"));
		String txtName = request.getParameter("txtName");
		String txtPassword = request.getParameter("txtPassword");
		
		UserModel usr = new UserModel(txtID, txtName, txtPassword);
		UserController uc = new UserController();
		
		uc.Store(usr);
		
		response.sendRedirect("views/allusers.jsp");
	}
}
