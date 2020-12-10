package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.MV_AC_DTO;
import Model.MV_COM_DTO;
import View.MV_COM_CH_Page;

public class MV_COM_button  implements ActionListener{
	private JTable table;
	private JTextField I1;
	private JTextField I2;
	private JTextField D1;
	private JTextField D2;
	private JTextField C1;
	private JTextField C2;
	
	public MV_COM_button(JTable j) { //리스너 등록할때  해당버튼에 맞는 JTable을 가져온다.
		table =j;
	}
	
	public MV_COM_button(JTextField a1, JTextField a2) {
		I1 = a1;
		I2 = a2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		Vector<String[]> Data;
		
		if(b.getText().equals("검색")) {
			Data= new MV_COM_DTO().MV_COM_READ();
			DefaultTableModel tmp = (DefaultTableModel)table.getModel();
			tmp.setNumRows(0); //영화 제작사 테이블 초기화		
			for(int i=0 ; i< Data.size(); i++) {
				tmp.addRow(Data.elementAt(i)); // Jtable에 각각의 값을 추가한다.
			}
		}	
		else if(b.getText().equals("변경")) {
			new MV_COM_CH_Page().MV_COM_CH_LOAD();
		}
		else if(b.getText().equals("추가")) {
			if(I1.getText().isEmpty() || I2.getText().isEmpty()) 
			{
				System.out.println("모든 항목을 채워주세요");
				//나중에 경고창 뜨게 만들기
			}
			else {
				String mv_number = I1.getText();
				String com_name = I2.getText();
				new MV_COM_DTO().MV_COM_INSERT(mv_number,com_name);
				
				// button DTO에서 객체를 불러와서 string 전송하기.
				
				
			}
		}
	}
}
