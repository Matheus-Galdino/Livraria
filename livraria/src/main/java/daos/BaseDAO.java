package daos;

import java.sql.Connection;
import java.sql.SQLException;

import connection.MySqlConn;

public abstract class BaseDAO {
	protected Connection conn;

	public BaseDAO() throws ClassNotFoundException, SQLException {
		conn = new MySqlConn().getConn();
	}
}
