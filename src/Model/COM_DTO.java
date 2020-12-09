package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class COM_DTO {
	public Vector<String[]> COM_READ() {
		DataBaseDAO connecter = new DataBaseDAO();
		connecter.DB_connect();
		Vector<String[]> Data = new Vector<String[]>();
		try {
		Statement stmt = connecter.conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from company");
		while(rset.next()) {
			String row[] = new String[5]; 
			for(int i=1 ; i<6 ; i++) {
				row[i-1] = rset.getString(i);
			}
			Data.addElement(row);
			
		}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("제작사 DB 읽기실패" + e.toString());
		}
		return Data;
	}
}
