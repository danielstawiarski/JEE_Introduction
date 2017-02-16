package pl.polonialiberum.jdbc.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class AttributeListener
		implements ServletContextAttributeListener, HttpSessionAttributeListener, ServletRequestAttributeListener {

	public AttributeListener() {

	}

	public void attributeAdded(ServletContextAttributeEvent arg0) {

	}

	public void attributeRemoved(ServletContextAttributeEvent arg0) {

	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("Request Attribute removed " + srae.getName());
	}

	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("Request Attribute added " + srae.getName());
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("Request Attribute replaced " + srae.getName());
	}

	public void attributeAdded(HttpSessionBindingEvent arg0) {

	}

	public void attributeRemoved(HttpSessionBindingEvent arg0) {

	}

	public void attributeReplaced(HttpSessionBindingEvent arg0) {

	}

	public void attributeReplaced(ServletContextAttributeEvent arg0) {

	}

}
