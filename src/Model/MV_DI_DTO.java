package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class MV_DI_DTO {
	private DataBaseDAO connecter = new DataBaseDAO();
	private PreparedStatement pstm = null;

	//디비에서 읽어오는 함수
	public Vector<String[]> MV_DI_READ() {
		connecter.DB_connect();
		Vector<String[]> Data = new Vector<String[]>();
		try {
		Statement stmt = connecter.conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from movie_director");
		while(rset.next()) {
			String row[] = new String[2]; 
			for(int i=1 ; i<3 ; i++) {
				row[i-1] = rset.getString(i);
			}
			Data.addElement(row);
			
		}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("영화감독 DB 읽기실패" + e.toString());
		}
		return Data;
	}
	
	//데이터 insert 함수
	public void MV_DI_INSERT(String di_number, String mv_number) {
		String quary = "INSERT INTO MOVIE_DIRECTOR VALUES(?,?)";
		connecter.DB_connect();
		try {
			pstm = connecter.conn.prepareStatement(quary);
			
			
			//쿼리에 값을 세팅한다.
			pstm.setString(1,di_number);
			pstm.setString(2,mv_number);

			int success = pstm.executeUpdate();
			
			if(success > 0)
				//시간 남으면 gui로 띄우기
				System.out.println("영화감독 데이터 입력 성공");
			else
				System.out.println("영화감독 데이터 입력 실패");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
