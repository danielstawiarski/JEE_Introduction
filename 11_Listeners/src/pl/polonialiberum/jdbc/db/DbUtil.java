package pl.polonialiberum.jdbc.db;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DbUtil {
	private static DbUtil dbUtil;
	// obiekt C3P0 odpowiedzialny za zarzdzanie po³czeniami
	private ComboPooledDataSource connectionPool;

	private DbUtil() throws PropertyVetoException {
		connectionPool = new ComboPooledDataSource();
		// podstawowe informacje o bazie danych
		connectionPool.setDriverClass("com.mysql.jdbc.Driver");
		connectionPool.setJdbcUrl("jdbc:mysql://localhost:3306/world");
		connectionPool.setUser("Daniel_S");
		connectionPool.setPassword("epixo");

		// konfiguracja puli po³aczeñ
		// pocztkowa liczba po³aczeñ
		connectionPool.setInitialPoolSize(5);
		// min. dostêpna liczba podtrzymywanych po³czeñ
		connectionPool.setMinPoolSize(5);
		// max liczba podtrzymywanych po³aczeñ
		connectionPool.setMaxPoolSize(20);
		// iloœæ dodatkowych po³czeñ, która ma byæ otworzona, gdy wszystkie s
		// zajête
		connectionPool.setAcquireIncrement(5);
		// maxymalny czas podtrzymywania po³czenia w sec
		connectionPool.setMaxIdleTime(3600);
	}

	public Connection getConnection() throws SQLException {
		return connectionPool.getConnection();
	}

	public void close() {
		connectionPool.close();
	}

	public static DbUtil getInstance() {
		if (dbUtil == null) {
			try {
				dbUtil = new DbUtil();
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		}
		return dbUtil;
	}
}
