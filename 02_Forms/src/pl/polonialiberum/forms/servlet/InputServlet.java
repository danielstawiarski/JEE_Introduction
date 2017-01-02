package pl.polonialiberum.forms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.polonialiberum.forms.bean.User;

@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InputServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = createUserFromRequest(request);
		sendResponse(user, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = createUserFromRequest(req);
		sendResponse(user, resp);
	}

	private User createUserFromRequest(HttpServletRequest request) {
		User user = new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("pass"));
		user.setGender(request.getParameter("gender"));
		user.setHobby(request.getParameterValues("hobby"));
		return user;
	}

	private void sendResponse(User user, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.print("<h2>Dane odebrano pomyœlnie</h2>");
		writer.print("<div>");
		writer.println(user.getUsername() + "<br>");
		writer.println(user.getPassword() + "<br>");
		writer.println(user.getGender() + "<br>");
		if (user.getHobby() != null) {
			writer.print("Hobby: <br>");
			for (String hobby : user.getHobby())
				writer.println(" " + hobby + "<br>");
		}
		writer.print("</div>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
