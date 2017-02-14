package pl.polonialiberum.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String USERNAME = "admin";
	private static final String PASS = "pass";

	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("LoginServlet doPost()");
		String userParam = request.getParameter("username");
		String passParam = request.getParameter("password");
		if (validate(userParam, passParam)) {
			request.getSession(true).setAttribute("username", userParam);
			response.sendRedirect("admin.jsp");
		}
	}

	private boolean validate(String username, String password) {
		return USERNAME.equals(username) && PASS.equals(password);
	}
}
