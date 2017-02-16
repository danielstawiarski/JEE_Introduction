package pl.polonialiberum.jdbc.listener;

import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import pl.polonialiberum.jdbc.db.DbUtil;

@WebListener
public class DbInitListener implements ServletContextListener {

	public DbInitListener() {
		// TODO Auto-generated constructor stub
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		DbUtil.getInstance().close();
		System.out.println("Context Destroyed");
	}

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Context initialized");
		try {
			DbUtil.getInstance().getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
