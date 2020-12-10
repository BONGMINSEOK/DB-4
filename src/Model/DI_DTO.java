package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class DI_DTO {
	private DataBaseDAO connecter = new DataBaseDAO();
	private PreparedStatement pstm = null;
	
	public Vector<String[]> DI_READ() {
		DataBaseDAO connecter = new DataBaseDAO();
		connecter.DB_connect();
		Vector<String[]> Data = new Vector<String[]>();
		try {
		Statement stmt = connecter.conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from director");
		while(rset.next()) {
			String row[] = new String[4]; 
			for(int i=1 ; i<5 ; i++) {
				row[i-1] = rset.getString(i);
			}
			Data.addElement(row);
			
		}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("감독 DB 읽기실패" + e.toString());
		}
		return Data;
	}
	
	public void DI_INSERT(String number, String name, String birthday, String gender) {
		String quary = "INSERT INTO DIRECTOR VALUES(?,?,?,?)";
		connecter.DB_connect();
		try {
			pstm = connecter.conn.prepareStatement(quary);
			
			
			//쿼리에 값을 세팅한다.
			pstm.setString(1,number);
			pstm.setString(2,name);
			pstm.setString(3,birthday);
			pstm.setString(4,gender);

			int success = pstm.executeUpdate();
			
			if(success > 0)
				//시간 남으면 gui로 띄우기
				System.out.println("감독 데이터 입력 성공");
			else
				System.out.println("감독 데이터 입력 실패");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
