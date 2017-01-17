package pl.polonialiberum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/LoginServlet", initParams = {
		@WebInitParam(name = "defaultUsername", value = "Nieznajomy") })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		if (username == null || "".equals(username)) {
			username = getServletConfig().getInitParameter("defaultUsername");
		} else {
			// je�li podano nazw� u�ytkownika, to zapami�tujemy j� na przysz�os�
			// na poziomie sesji
			request.getSession().setAttribute("username", username);
		}

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>Witaj " + username + "</title></head>");
		writer.println("<body>");
		writer.println("<h1>Witaj " + username + "</h1>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
