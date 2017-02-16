package pl.polonialiberum.jdbc.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessListener implements HttpSessionListener {

	public SessListener() {
		// TODO Auto-generated constructor stub
	}

	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("Session created " + arg0.getSession().getId());
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("Session Destroyed");
	}

}
