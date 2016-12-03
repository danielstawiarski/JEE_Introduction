package pl.polonialiberum.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Map;
import java.io.PrintWriter;
/**
 * Servlet implementation class ParametrsGetServlet
 */
@WebServlet("/ParametrsGetServlet")
public class ParametrsGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParametrsGetServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* Get data from URL*/
		Map<String, String[]> parameterMap = request.getParameterMap();
        
        /* Type of content and encoding for response */
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
         
        PrintWriter writer = response.getWriter();
        
        /* Return data to site*/
        writer.println("<html>");
        for(String key : parameterMap.keySet()){
        	writer.println("<div>");
            writer.println(key);
            writer.println("</div>");
            for (String value : parameterMap.get(key)) {
                writer.println("<div>");
                writer.println("&nbsp&nbsp-"+ value);
                writer.println("</div>");
            }
        }
        writer.println("</html>");
        
        
        /* Data to console */
        for (String key : parameterMap.keySet()) {
            System.out.println(key);
            for (String value : parameterMap.get(key)) {
                System.out.println("  -" + value);
            }
	     }
     }
}
