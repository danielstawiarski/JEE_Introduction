package pl.polonialiberum.jdbc.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ReqListener implements ServletRequestListener {

	public ReqListener() {

	}

	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("Request destroyed");
	}

	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("Request initialized");
	}

}
