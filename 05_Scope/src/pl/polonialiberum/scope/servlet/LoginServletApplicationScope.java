package pl.polonialiberum.scope.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServletApplicationScope")
public class LoginServletApplicationScope extends HttpServlet {

	public LoginServletApplicationScope() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		if (getServletContext().getAttribute("login") == null)
			getServletContext().setAttribute("login", login);

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>Witaj " + getServletContext().getAttribute("login") + "</title></head>");
		writer.println("<body>");
		writer.println("<h1>Witaj " + getServletContext().getAttribute("login") + "</h1>");
		writer.println("</body>");
		writer.println("</html>");

	}

}
