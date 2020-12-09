package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseDAO {
	public Connection conn = null;
	public void DB_connect() {
		try {
			// DB 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "movie", "1234");
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("DB 연결실패" + e.toString());
			} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결실패" + e.toString());
			}
	}
}
