package Config;

import java.sql.Connection;

public class DBConnection {
	public static Connection getConnection() {
		return SQLServerConnection.initializeDatabase();
	}
}
