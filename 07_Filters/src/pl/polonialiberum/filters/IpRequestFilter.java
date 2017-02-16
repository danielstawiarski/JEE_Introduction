package pl.polonialiberum.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

//@WebFilter("/IpRequestFilter")
public class IpRequestFilter implements Filter {
	private String ipPattern;

	public void init(FilterConfig fConfig) throws ServletException {
		ipPattern = fConfig.getInitParameter("ipPattern");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Ip filter: ");
		String requestIp = request.getRemoteAddr();
		System.out.println(request.getRemoteAddr());
		if (requestIp.matches(ipPattern)) {
			System.out.println("IP ok");
			chain.doFilter(request, response);
		} else {
			System.out.println("IP not ok");
			HttpServletResponse httpResponse = (HttpServletResponse) response;
			httpResponse.sendError(403);
		}
	}

	public void destroy() {

	}

}