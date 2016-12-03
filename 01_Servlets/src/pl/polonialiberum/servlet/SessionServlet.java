package pl.polonialiberum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pl.polonialiberum.bean.Client;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SessionServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		// session.setMaxInactiveInterval(10); (session interval - seconds)
		Client client = (Client) session.getAttribute("client");

		if (client == null || (client.getFirstName() == null || client.getLastName() == null)) {
			client = new Client();
			String firstName = request.getParameter("firstname");
			String lastName = request.getParameter("lastname");
			client.setFirstName(firstName);
			client.setLastName(lastName);
			session.setAttribute("client", client);
		}

		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("  <body>");
		writer.println("<h1>Test Sesji</h1>");
		if (client.getFirstName() != null && client.getLastName() != null)
			writer.println("<div>Witaj " + client.getFirstName() + " " + client.getLastName() + "</div>");
		else
			writer.println("<div>Witaj nieznajomy</div>");
		writer.println("  </body>");
		writer.println("</html>");

	}

}
