package ocp.capitulo10_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/rw_itau", "rw_itau", "rw_itau");
		System.out.println(conn);
	}
}
