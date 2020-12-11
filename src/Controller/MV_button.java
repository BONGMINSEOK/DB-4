package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.MV_DTO;
import View.MV_CH_Page;
public class MV_button implements ActionListener {
//MV_button
//AC_DTO().AC_READ()
//IMPORT 수정
//주석 수정
	private JTable table;
	private JTextField I1;
	private JTextField I2;
	private JTextField I3;
	private JTextField I4;
	private JTextField I5;
	private JTextField I6;
	private JTextField D1;
	private JTextField C1;
	private JTextField C2;
	private JTextField C3;
	private JTextField C4;
	private JTextField C5;
	private JTextField C6;
	
	public MV_button(JTable j) { //리스너 등록할때  해당버튼에 맞는 JTable을 가져온다.
		table =j;
	}
	public MV_button(JTextField a1, JTextField a2, JTextField a3, JTextField a4, JTextField a5, JTextField a6) {
		I1 = a1;
		I2 = a2;
		I3 = a3;
		I4 = a4;
		I5 = a5;
		I6 = a6;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		Vector<String[]> Data;
		
		if(b.getText().equals("검색")) {
			Data= new MV_DTO().MV_READ();
			DefaultTableModel tmp = (DefaultTableModel)table.getModel();
			tmp.setNumRows(0); //영화테이블 초기화		
			for(int i=0 ; i< Data.size(); i++) {
				tmp.addRow(Data.elementAt(i)); // Jtable에 각각의 값을 추가한다.
			}
		}	
		else if(b.getText().equals("변경")) {
			new MV_CH_Page().MV_CH_LOAD();
		}
		else if(b.getText().equals("추가")) {
			if(I1.getText().isEmpty() || I2.getText().isEmpty() || I3.getText().isEmpty() || I4.getText().isEmpty() || I5.getText().isEmpty() || I6.getText().isEmpty()) 
			{
				System.out.println("모든 항목을 채워주세요");
				//나중에 경고창 뜨게 만들기
			}
			else {
				String number = I1.getText();
				String name = I2.getText();
				String day = I3.getText();
				String time = I4.getText();
				String grade = I5.getText();
				String genre = I6.getText();
				new MV_DTO().MV_INSERT(number,name,day,time,grade,genre);
				
				// button DTO에서 객체를 불러와서 string 전송하기.
				
				
			}
		}
		
	}
	
	}
	

