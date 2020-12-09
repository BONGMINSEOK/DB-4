package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

// 1) 디비에서 데이터 읽어오기
// 2) 데이터 수정
// 3) 데이터 삭제
// 4) 데이터 삽입
public class MV_DTO {
	private String row[] = new String[6]; 
	private int row_count = 0; //MV데이터의 row의 개수를 알기 위한 변수
	public Vector<String[]> MV_READ() {
		DataBaseDAO connecter = new DataBaseDAO();
		connecter.DB_connect();
		Vector<String[]> Data = new Vector<String[]>();
		try {
		Statement stmt = connecter.conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from MOVIE");
		System.out.println(rset.next());
		while(rset.next()) {
			for(int i=1 ; i<7 ; i++) {
				System.out.println(rset.getString(i));
//				row[i-1] = rset.getString(i);
			}
			Data.add(row_count++,row);	
		}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("영화 DB 읽기실패" + e.toString());
		}
		return Data;
	}
}
