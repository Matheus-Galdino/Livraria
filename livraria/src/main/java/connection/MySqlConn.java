package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConn {

	private String url = "jdbc:mysql://localhost/bdlivraria?useTimezone=true&serverTimezone=UTC";
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String user = "root";
	private String pwd = "1234";

	public Connection getConn() throws ClassNotFoundException, SQLException {
		Connection conn = null;

		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, pwd);

		return conn;
	}
}
