package org.trabLanchonete.lanchonete.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionLanchoneteFactory {

	public static Connection getConnection() {
		
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			return DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/trabLanchonedb", "sa", "");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

