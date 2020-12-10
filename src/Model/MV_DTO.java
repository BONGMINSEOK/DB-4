package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.sql.PreparedStatement;

// 1) 디비에서 데이터 읽어오기
// 2) 데이터 수정
// 3) 데이터 삭제
// 4) 데이터 삽입

//mv_read
// string index
//쿼리문
//println 문
public class MV_DTO {
	private DataBaseDAO connecter = new DataBaseDAO();
	private PreparedStatement pstm = null;
	
	public Vector<String[]> MV_READ() { // 디비에서 데이터값을 불러오는 함수
		//DataBaseDAO connecter = new DataBaseDAO();
		connecter.DB_connect();
		Vector<String[]> Data = new Vector<String[]>();
		try {
		Statement stmt = connecter.conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from movie");
		while(rset.next()) {
			String row[] = new String[6]; 
			for(int i=1 ; i<7 ; i++) {
				row[i-1] = rset.getString(i);
			}
			Data.addElement(row);
			
		}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("영화 DB 읽기실패" + e.toString());
		}
		return Data;
	}
	
	//데이터 insert 함수
	public void MV_INSERT(String number, String name, String day, String time, String grade, String genre) {
		String quary = "INSERT INTO MOVIE VALUES(?,?,?,?,?,?)";
		connecter.DB_connect();
		try {
			pstm = connecter.conn.prepareStatement(quary);
			
			
			//쿼리에 값을 세팅한다.
			pstm.setString(1,number);
			pstm.setString(2,name);
			pstm.setString(3,day);
			pstm.setString(4,time);
			pstm.setString(5,grade);
			pstm.setString(6,genre);
			
			int success = pstm.executeUpdate();
			
			if(success > 0)
				//시간 남으면 gui로 띄우기
				System.out.println("영화 데이터 입력 성공");
			else
				System.out.println("데이터 입력 실패");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
