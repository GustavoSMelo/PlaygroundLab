package calcServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CalcServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		float number01 = Float.parseFloat(request.getParameter("firstNumber"));
		float number02 = Float.parseFloat(request.getParameter("secondNumber"));
		
		String values[] = request.getParameterValues("item");
		
		String radioCalc = request.getParameter("rbCalc");
		PrintWriter pw = response.getWriter();
		
		if(radioCalc.equalsIgnoreCase("soma")) {
			pw.println("\n "+ (number01 + number02));
			for (int i = 0; i < values.length; i++) {
				pw.print(values[i].toString());
			}
		} else if (radioCalc.equalsIgnoreCase("subtracao")) {
			pw.println("\n" + (number01 - number02));
			pw.print(values);
		} else if (radioCalc.equalsIgnoreCase("divisao")) {
			pw.println("\n" + (number01 / number02));
			pw.print(values);
		} else if (radioCalc.equalsIgnoreCase("multiplicacao")) {
			pw.println("\n" + (number01 * number02));
			pw.print(values);
		} else {
			pw.println("\nNenhuma função foi selecionada");
			pw.print(values);
		}
	}
}
