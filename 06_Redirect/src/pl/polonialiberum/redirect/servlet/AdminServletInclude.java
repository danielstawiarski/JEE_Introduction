package pl.polonialiberum.redirect.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminServletInclude")
public class AdminServletInclude extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminServletInclude() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		System.out.println("AdminServlet GET " + username);
		request.getRequestDispatcher("LoginServlet").include(request, response);
		response.getWriter().println("Tekst odpowiedzi po operacji include()");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		System.out.println("AdminServlet POST " + username);
		request.getRequestDispatcher("LoginServlet").include(request, response);
		response.getWriter().println("Tekst odpowiedzi po operacji include()");
	}

}
