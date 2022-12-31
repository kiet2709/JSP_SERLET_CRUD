package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerConnection {
	public static Connection initializeDatabase() {
		String dbDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433";
		String dbName = "myfirst";
		String dbUsername = "sa";
		String dbPassword = "123456";
		String connectionURL = dbURL + ";databaseName="+dbName+";encrypt=true;trustServerCertificate=true;";
		Connection conn = null;
		try {
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(connectionURL,dbUsername,dbPassword);
		} catch (Exception ex) {
			System.out.println("Connect failure!");
			ex.printStackTrace();
		}
		return conn;
	}
}
